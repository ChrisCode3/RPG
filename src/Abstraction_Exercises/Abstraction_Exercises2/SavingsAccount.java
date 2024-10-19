package Abstraction_Exercises.Abstraction_Exercises2;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

public class SavingsAccount extends BankAccount {



    public SavingsAccount(int balance) {
        super(balance);

    }





    @Override
   void deposit(int amount) {

        balance = getBalance() + amount;

        LocalDateTime time = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy , HH:mm:ss a");

        String formattedTime = time.format(formatter);

        System.out.println( "The new balance of the account is =  "+  balance);
        System.out.println( "The transaction happen at this time " +  formattedTime);


    }

    @Override
    void withdraw(int amount) {

       balance =   getBalance()  - amount;
       
       System.out.println(balance);

    }











}
