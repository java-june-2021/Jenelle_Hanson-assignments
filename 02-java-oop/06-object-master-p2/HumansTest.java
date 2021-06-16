public class HumansTest {
    public static void main(String[] args) {
        Humans h = new Humans();
        Samurai s = new Samurai();
        Ninja n = new Ninja();
        Wizard w = new Wizard();
    
        // h.displayHealth();

        //humans actions
        // n.displayHealth();

        h.attack(n);
        System.out.println("Ninja was attacked: " + n.displayHealth());

        h.attack(s);
        System.out.println("Samurai was attacked: " + s.displayHealth());

        h.attack(w);
        System.out.println("Wizard was attacked: " + w.displayHealth());
    }
}