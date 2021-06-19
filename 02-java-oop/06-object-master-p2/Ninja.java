public class Ninja extends Humans {
    private int dStealth = 10;

    //method overload
    public Ninja(String name) {
        this.name = name;
        this.stealth = dStealth;
    }
    
    public void steal(Humans target) {
        target.health -= this.stealth;
        this.health += this.stealth;
        System.out.println(this.name + " stole from " 
        + target.name + ". " + target.name + "'s health is now: " 
        + target.health + ". " + this.name + "'s health is now: " + this.health); 
    }

    public void runAway() {
        this.health -= 10;
        System.out.println(this.name + " ran away. " + this.name 
        + "'s health is now: " + this.health);
    }
}
