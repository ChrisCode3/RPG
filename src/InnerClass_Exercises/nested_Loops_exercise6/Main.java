package InnerClass_Exercises.nested_Loops_exercise6;




class MathUtil {



    static class Calculator {

        static int add( int a , int b) {

            System.out.println(" Hello World");
            return a + b;


        }

    }


}






public class Main {

    public static void main(String[] args) {


      //  MathUtil.Calculator Test = new MathUtil.Calculator();



        System.out.println( MathUtil.Calculator.add(6 , 5));
    }

}
