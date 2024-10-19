package Polymorphism;



 abstract class Animal {
    // Superclass method
   public void sound() {
        System.out.println("Animal makes a sound");

    }




}

class Dog extends Animal {

    private String name;

    private String spec;

    public int hp;

    public double str;

    public double stam;

    public double weapon;

    public Dog ( String name , String spec ,   int hp,  double str , double stam , double weapon) {

        this.hp = hp;
        this.stam = stam ;
        this.name = name;
        this.str = str;
        this.spec = spec;
        this.weapon = weapon;

    }

/*
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", spec='" + spec + '\'' +
                ", hp=" + hp +
                ", str=" + str +
                ", stam=" + stam +
                ", weapon=" + weapon +
                '}';
    }*/

    // Subclass overrides the superclass method




}

class Cat extends Animal {
    // Subclass overrides the superclass method

    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
      //  Animal myAnimal = new Animal();  // Animal reference and object
        Dog Warrior = new Dog("Honorius", "Warrior", 100, 10, 8, 2);

        Animal myCat = new Cat();        // Animal reference but Cat object

    //    myAnimal.sound();    // Outputs: Animal makes a sound
       Warrior.sound();       // Outputs: Dog barks (runtime decision to call Dog's method)

        myCat.sound();       // Outputs: Cat meows (runtime decision to call Cat's method)
    }
}
