package HeroClass;





class Main {


    static void warScream () {

        System.out.println(" For the empreror ");

    }







    public static void main(String[] args) {


        HeroClass Warrior = new HeroClass("Honorius", "Warrior", 100, 1, 8, 1);
        
        HeroClass Wizard = new HeroClass("Magnus", "Wizard", 50, 2, 8, 20);

        HeroClass Barbarian = new HeroClass( " Rock " , "Barbarian " , 45 , 20 , 20 , 5 );

        MonsterClass Frank = new MonsterClass( "Frank " , 1000 , 1 , 100);

//

        StartGame newGame = new StartGame();

        newGame.monsters.add(Frank);

        newGame.classes.add(Warrior);


        newGame.printMonsterslist();



        System.out.println(Warrior.toString());

        CombatSystem newCombat = new CombatSystem( Warrior , newGame.monsters );

        newCombat.Combat();

        newGame.printMonsterslist();
        /*   while (Warrior.hp > 0 && Wizard.hp > 0) {

            System.out.println("The fight between " + Wizard.getName() + " and " + Warrior.getName() + " begins");

        //    warScream();
            Warrior.hp = (int) (Warrior.hp - Wizard.weaponDmg());

            



            Wizard.hp = (int) (Wizard.hp - Warrior.weaponDmg());

            if (Wizard.hp <= 0 && Warrior.hp > 0) {
                System.out.println("Warrior Wins ");
                System.out.println(Warrior.hp);
            //    Warrior.warCry();
            }

            if (Warrior.hp <= 0 && Wizard.hp > 0) {
                System.out.println("Wizard wins ");
                System.out.println(  "  His life is :" +  Wizard.hp);
           //    Wizard.warCry();

            }



        }

        System.out.println(  " Outside loop");

        System.out.println("   The hp on the warr is now"  +  Warrior.getHp());

    //    Warrior.healpot();

        System.out.println("   The hp on the warr is now"  +  Warrior.getHp());


          System.out.println("   The damage of the weapon is "  +  Warrior.weaponDmg() +HeroClass.test3(Warrior.dmg()));


        Barbarian.warCry();
        Warrior.warCry();*/



    }




}



