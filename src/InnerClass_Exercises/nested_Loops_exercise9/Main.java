package InnerClass_Exercises.nested_Loops_exercise9;


class Person {


    static class Address {


        String address;

        String state;


           public Address ( String address , String state ) {

           this.address = address;

           this.state = state;

        }

        void displayAddress() {

             System.out.println(this.address + " , "+  this.state);
        }
    }

}





public class Main {

    public static void main(String[] args) {



        Person myPerson = new Person();

        Person.Address myAddress = new Person.Address(" New York", " Alaska");


        myAddress.displayAddress();


    }



}
