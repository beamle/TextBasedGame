package Enemies;

abstract public class Enemy {
    //Variables
    private int maxHealth;
    private int attackDamage;

    //Constructors

    public Enemy(int maxHealth, int attackDamage) {
        this.maxHealth = maxHealth;
        this.attackDamage = attackDamage;
    }

    //Getters and setters

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    //Methods
    public abstract void shout();

}
