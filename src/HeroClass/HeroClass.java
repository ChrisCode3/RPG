package HeroClass;




class HeroClass {

    private String name;

    private String spec;

    public int hp;

    public double str;

    public double stam;

    public double weapon;

    public HeroClass ( String name , String spec ,   int hp,  double str , double stam , double weapon) {

        this.hp = hp;
        this.stam = stam ;
        this.name = name;
        this.str = str;
        this.spec = spec;
        this.weapon = weapon;

    }


    static void warScream () {

        System.out.println(" For the empreror ");

    }

    public double weaponDmg ( ) {

        return (this.str * this.weapon);

    }

    @Override
    public String toString() {

        return   "HeroClass{" +
                "name='" + name + '\'' + "," +
                " spec='" + spec + '\'' +
                ", hp=" + hp +
                ", str=" + str +
                ", stam=" + stam +
                ", weapon=" + weapon +
                '}';
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public double getStr() {
        return str;
    }

    public void setStr(double str) {
        this.str = str;
    }

    public double getStam() {
        return stam;
    }

    public void setStam(double stam) {
        this.stam = stam;
    }

    public double getWeapon() {
        return weapon;
    }

    public void setWeapon(double weapon) {
        this.weapon = weapon;
    }


    public void warCry() {

        System.out.println(" death and glory!!! " );

    }

    public String getName() {
        return name;
    }

    public String getSpec() {
        return spec;
    }
}


