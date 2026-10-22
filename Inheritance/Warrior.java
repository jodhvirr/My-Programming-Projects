public class Warrior extends Character 
{
   public Warrior(String name)
   {
        super(name , 125);
   } 



   @Override
   public void attack(Character target)
   {
        int damage = (int)(Math.random() * 75) + 1;
        target.takeDamage(damage);
   }
   

}


