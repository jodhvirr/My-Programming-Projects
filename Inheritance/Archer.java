public class Archer extends Character 
{
    public Archer(String name)
    {
        super(name, 100);
    
    }

    @Override
    public void attack(Character target)
    {
        int damage = (int)(Math.random()*100) + 1;
        target.takeDamage(damage);
    }
}
