public class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        Samurais s = new Samurais();
        Ninjas n = new Ninjas();
        Wizards w = new Wizards();
    
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