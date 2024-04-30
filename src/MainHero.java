public class MainHero {
    public static void main(String[] args) {
        SuperHero danielHero = new SuperHero();
        SuperVillain putin = new SuperVillain();
        System.out.println(danielHero.toString());
        System.out.println(putin.toString());
        danielHero.setNombre("Daniel");
       

        danielHero.combate(putin);

    }
}
