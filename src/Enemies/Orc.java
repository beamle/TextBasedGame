package Enemies;

public class Orc extends Enemy{

    public Orc(int maxHealth, int attackDamage) {
        super(maxHealth, attackDamage);
    }








    //Methods
    @Override
    public void shout() {
        System.out.println("I am Orc! Zac-Zac!");
    }


}
