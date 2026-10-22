public class Character 
{
    private String name;
    private int health;
    private boolean defending;

    public Character(String name, int health)
    {
        this.name = name;
        this.health = health;
        this.defending = false;
    }

    public void attack(Character target)
    {
        int damage = (int)(Math.random() * 100) + 1;
       
        target.takeDamage(damage);
    }

    public void takeDamage(int damage)
    {
         if(defending)
        {
            damage = damage / 2;
            defending = false;
        }
        health -= damage;

        if(health < 0)
        {
            health = 0;
        }
    }

    public void defense()
    {
        defending = true;
    }


}
