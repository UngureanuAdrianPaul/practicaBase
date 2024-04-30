import skills.Skill;

public class SuperHero extends SuperHuman {
   private int moral;

   public SuperHero() {
      super();
      this.moral = 0;

   }

   public SuperHero(Skill caracteristica) {
      super(caracteristica);
      this.moral = 0;
   }

   public SuperHero(String nombre, int inteligencia, int agilidad, int fuerza, int resistencia) {
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