public class Wizard extends Humans {
    private int dHealth = 50;
    private int dInt = 8;
    
    // method overload
    public Wizard(String name) {
        this.name = name;
        this.health = dHealth;
        this.intelligence = dInt;
    }

    public void heal(Humans target){
        target.health += this.intelligence;
        System.out.println(this.name + " healed " 
        + target.name + ". " + target.name + "'s health is now: " 
        + target.health);
    }

    public void fireball(Humans target){
        target.health -= this.intelligence * 3;
        System.out.println(this.name + " threw a fireball at " 
        + target.name + ". " + target.name + "'s health is now: " 
        + target.health);
    }
}
