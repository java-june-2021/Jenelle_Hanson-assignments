public class Samurai extends Humans {
    private int dHealth = 200;
    private static int count = 0;

    public Samurai(String name) {
        this.name = name;
        this.health = dHealth;
        count += 1;
    }

    public void deathBlow(Humans target) {
        target.health = 0;
        this.health /= 2;
        System.out.println(this.name + " dealt a death blow to " 
        + target.name + ". " + target.name + "'s health is now: " 
        + target.health + ". " + this.name + "'s health decreased to " + this.health);
    }

    public void meditate() {
        this.health += this.health/2;
        System.out.println(this.name + " meditated " 
        + this.name + "'s health is now: " 
        + this.health + ".");
    }

    public void howMany() {
        System.out.println("Samurai on field: " + count);
    }
    /*
Samurai: Add a method howMany() that returns the total current number of Samurai.
 */
}
