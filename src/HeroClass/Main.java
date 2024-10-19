package HeroClass;



 class Main {


    static void warScream () {

        System.out.println(" For the empreror ");

    }



    public static void main(String[] args) {


        HeroClass Warrior = new HeroClass("Honorius", "Warrior", 100, 10, 8, 2);
        
        HeroClass Wizard = new HeroClass("Magnus", "Wizard", 50, 2, 8, 123);

        HeroClass Barbarian = new HeroClass( " Rock " , "Barbarian " , 45 , 20 , 20 , 5 );




       System.out.println(Warrior.toString());


        while (Warrior.hp > 0 && Wizard.hp > 0) {

            System.out.println("The fight between " + Wizard.getName() + " and " + Warrior.getName() + " begins");

            warScream();
            Warrior.hp = (int) (Warrior.hp - Wizard.weaponDmg());


            Wizard.hp = (int) (Wizard.hp - Warrior.weaponDmg());

            if (Wizard.hp <= 0 && Warrior.hp > 0) {
                System.out.println("Warrior Wins ");
                System.out.println(Warrior.hp);
                Warrior.warCry();
            }

            if (Warrior.hp <= 0 && Wizard.hp > 0) {
                System.out.println("Wizard wins ");
                System.out.println(Wizard.hp);
               Wizard.warCry();

            }

        }


        Barbarian.warCry();


    }




}



