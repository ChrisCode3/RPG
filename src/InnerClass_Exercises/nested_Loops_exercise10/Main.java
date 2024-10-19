package InnerClass_Exercises.nested_Loops_exercise10;



class School {

    static class Student {

        String name;

        int grade;

        Student ( String name, int grade  ) {


            this.name  = name;

            this.grade = grade;

        }

        void displayStudentInfo() {

            System.out.println( name + ", "  + grade);

        }

    }


}




public class Main {

    public static void main(String[] args) {

        School.Student myStudent = new School.Student( "John"  , 18);

        myStudent.displayStudentInfo();


    }

}
