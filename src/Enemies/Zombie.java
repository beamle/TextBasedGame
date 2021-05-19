package Enemies;

public class Zombie extends Enemy{

    public Zombie(int maxHealth, int attackDamage) {
        super(maxHealth,attackDamage);
    }

    @Override
    public void shout(){
        System.out.println("Braainss! Hrrr..");
    }

}
