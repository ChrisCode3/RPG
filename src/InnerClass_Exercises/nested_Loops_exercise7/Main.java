package InnerClass_Exercises.nested_Loops_exercise7;




class House {


    // double length  = 5;

     //double width  = 5;

    public void calculateArea() {

      class Room {

            public double getArea(double a , double b) {

                return a * b;
            }


            public class Closet {
                public void scream() {
                    System.out.println( " screem!!" );
                }
            }
        }

        Room room = new Room();

        Room.Closet myCloset  = room.new Closet();

        myCloset.scream();

        double area = room.getArea(5, 10);
        System.out.println("Area of the room: " + area);
    }



}


public class Main {

    public static void main(String[] args) {


    House newHouse = new House();

    newHouse.calculateArea();






    }

}

 /*


// Car myfirstCar = new Car();

// Car.Engine myEngine = myfirstCar.new Engine();
  */