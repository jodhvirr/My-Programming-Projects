public class Mage extends Character 
{
    public Mage(String name)
    {
        super(name, 75);
    
    }

    @Override
    public void attack(Character target)
    {
        int damage = (int)(Math.random()*150) + 1;
        target.takeDamage(damage);
    }
    
}
