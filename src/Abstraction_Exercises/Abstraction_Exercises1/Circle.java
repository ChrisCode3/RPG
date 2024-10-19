package Abstraction_Exercises.Abstraction_Exercises1;

 class Circle extends  Shape{

     int radius;

   //  int diameter;


     public Circle(int radius) {
         this.radius = radius;
     }

     @Override
     void calculateArea() {

        double area  = Math.PI * Math.pow(this.radius , 2);

         System.out.println(area);
     }

     @Override
     void calculatePerimeter() {


         double Perimeter =  2 *( this.radius * Math.PI);

         System.out.println(Perimeter);

     }





 }
