public class Human {
    private int health = 100;
    private int strength = 3;
    private int intelligence = 3;
    private int stealth = 3;

    public void attack(Human target){
        target.health -= this.strength;
    }

    //health meter
    public int displayHealth() {
        System.out.println(health);
        return health;
    }


    //getters and setters

    //Health
    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            System.out.println("You died");
            return;
        }
        this.health = health;
    }

    //Strength
    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    //Intelligence
    public int getIntelligence() {
        return this.intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    //Stealth
    public int getStealth() {
        return this.stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }
}
