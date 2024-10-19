package InnerClass_Exercises.nested_Loops_exercise8;





abstract class Animal {


  abstract void makeSound();

}


public class Main {
    public static void main(String[] args) {



       Animal myCat = new Animal() {
           @Override
           void makeSound() {
               System.out.println("meouu ");
           }
       };

       myCat.makeSound();


    }
}
