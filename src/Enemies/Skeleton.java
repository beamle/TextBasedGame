package Enemies;

public class Skeleton extends Enemy {

    public Skeleton(int maxHealth, int attackDamage){
        super(maxHealth, attackDamage);
    }

    @Override
    public void shout() {
        System.out.println("Skellettonnss...Chrrrr...k..k");
    }
}
