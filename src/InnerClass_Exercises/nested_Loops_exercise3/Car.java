package InnerClass_Exercises.nested_Loops_exercise3;


 public class Car {

     public void startEngine(){

         class Engine {

             public void run() {
                 System.out.println(" Engine is running");
             }
         }


         Engine engine = new Engine();
         engine.run();
     }


}



/* class Car {


  static  class Engine {


         public void run() {
             System.out.println(" Engine is running");
         }
     }

}*/



