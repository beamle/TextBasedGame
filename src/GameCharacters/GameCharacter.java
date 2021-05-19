package GameCharacters;

abstract public class GameCharacter {
    private int health,
                attackDamage,
                defencePoints,
                healthPotion;




    //Constructors

    public GameCharacter(int health, int attackDamage, int healthPotion, int defencePoints) {
        this.health = health;
        this.attackDamage = attackDamage;
        this.healthPotion = healthPotion;
        this.defencePoints = defencePoints;
    }








    //Getters and Setters

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getDefencePoints() {
        return defencePoints;
    }

    public void setDefencePoints(int defencePoints) {
        this.defencePoints = defencePoints;
    }

    public int getHealthPotion() {
        return healthPotion;
    }

    public void setHealthPotion(int healthPotion) {
        this.healthPotion = healthPotion;
    }







    //Methods


}
