public class SuperHeroe extends SuperHuman {

    private int moral;

    // CONSTRUCTORES
    public SuperHeroe() {
        super();
        this.moral = 0;

    }

    public SuperHeroe(String caracteristicas) {
        super(caracteristicas);
        this.moral = 0;
    }

    public SuperHeroe(String nombre, int inteligencia, int agilidad, int fuerza, int resistencia) {
        super(nombre, inteligencia, agilidad, fuerza, resistencia);
        this.moral = 0;
    }

    public int getMoral() {
        return moral;
    }

    @Override
    public boolean combate(SuperHuman enemy) {
        if (enemy.getClass() == SuperVillain.class) {

            if (super.combate(enemy)) {
                this.moral++;
                return true;
            } else {
                this.moral--;
                return false;
            }

        } else {

            return true;
        }

    }
}
