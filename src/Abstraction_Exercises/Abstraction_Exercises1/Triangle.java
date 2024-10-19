package Abstraction_Exercises.Abstraction_Exercises1;

class Triangle extends Shape {


    int radius;

    int diameter;


    public Triangle(int radius, int diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    @Override
    void calculateArea() {

        double area = this.radius * Math.PI;

        System.out.println(area);

    }

    @Override
    void calculatePerimeter() {

       double circumference = this.diameter * Math.PI;


    }


}
