package Abstraction_Exercises.Abstraction_Exercises2;

abstract class BankAccount {


   int balance;

 //  String accountNumber;

   public BankAccount(int balance) {

      this.balance = balance;

   }


   public int getBalance() {
      return balance;
   }

   public void setBalance(int balance) {
      this.balance = balance;
   }





   abstract void deposit(int amount);




   abstract void withdraw(int amount);
}

