import skills.Skill;

public class SuperVillain extends SuperHuman{
   private int moral;

   public SuperVillain(String nombre, int inteligencia, int agilidad, int fuerza, int resistencia) {
      super(nombre, inteligencia, agilidad, fuerza, resistencia);
      this.moral=0;
   }

   public SuperVillain() {
      this.moral=0;
   }

   public SuperVillain(Skill caracteristica) {
      super(caracteristica);
      this.moral=0;
   }
   
   @Override
   public boolean combate(SuperHuman enemy) {
      if (enemy.getClass() == SuperHero.class) {
         if (super.combate(enemy)) {
            this.moral--;
            return true;
         } else {
            this.moral++;
            return false;
         }
      } else {
         return true;
      }
   }
}