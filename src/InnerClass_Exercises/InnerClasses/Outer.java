package InnerClass_Exercises.InnerClasses;

class Computer  {

    class Processor {
        void displayDetails() {
            System.out.println(" Brand is AMD");
            System.out.println(" Speed is 23");
        }

    }

       void showProcessorDetails() {
            Processor processor = new Processor();
            processor.displayDetails();
       }
    }






