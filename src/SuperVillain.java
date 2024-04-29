
public class SuperVillain extends SuperHuman {

    private int moral;

    public SuperVillain() {
        this.moral = 0;
    }

    public SuperVillain(String caracteristicas) {
        super(caracteristicas);
        this.moral = 0;
    }

    public SuperVillain(String nombre, int inteligencia, int agilidad, int fuerza, int resistencia) {
        super(nombre, inteligencia, agilidad, fuerza, resistencia);
        this.moral = 0;
    }

    public int getMoral() {
        return moral;
    }

    @Override
    public boolean combate(SuperHuman enemy) {

        if (super.combate(enemy)) {
            this.moral--;
            return true;
        } else {
            this.moral++;
            return false;
        }

    }

}