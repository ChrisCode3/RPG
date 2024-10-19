package InnerClass_Exercises.nested_Loops_exercise2;

public class University {

   static class Department {

       private String departmentName;
       private int facultyCount;

       public Department(String departmentName, int facultyCoun) {

           this.departmentName = departmentName;
           this.facultyCount = facultyCoun;

       }


       public void displayInfo() {

           System.out.println( "Department Name is "  + departmentName);

           System.out.println( "Department Name is " + facultyCount );
       }


   }


}
