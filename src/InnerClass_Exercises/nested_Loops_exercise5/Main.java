package InnerClass_Exercises.nested_Loops_exercise5;





class Library  {

    String libraryName;


    public Library( String libraryName) {

        this.libraryName = libraryName;

    }

 class Book {

        public String getLibraryName() {

        return libraryName;

        }

    }


}



public class Main {

    public static void main(String[] args) {


        Library myFirstLibray = new Library( " Coborg " );

        Library.Book myBook = myFirstLibray.new Book();



        System.out.println(myBook.getLibraryName());








    }



}





























