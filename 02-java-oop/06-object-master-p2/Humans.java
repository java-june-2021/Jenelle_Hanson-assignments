public class Humans {
    protected String name = "";
    protected int health = 100;
    protected int strength = 3;
    protected int intelligence = 3;
    protected int stealth = 3;

    public void attack(Humans target){
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
