public class HumansTest {
    public static void main(String[] args) {
        Samurai jack = new Samurai("Samurai Jack");
        Ninja shinobi = new Ninja("Ninja Shinobi");
        Wizard aku = new Wizard("Wizard Aku");
        Wizard gandolf = new Wizard("Wizard Gandolf");
        Ninja hinata = new Ninja("Ninja Hinata");
        Samurai mugen = new Samurai("Samurai Mugen");
    
        aku.heal(jack);
        aku.fireball(jack);
        jack.deathBlow(aku);
        jack.meditate();
        shinobi.steal(jack);
        shinobi.runAway();

        gandolf.fireball(hinata);
        gandolf.heal(aku);
        hinata.steal(mugen);
        hinata.runAway();
        jack.howMany();
        mugen.deathBlow(aku);
        mugen.meditate();

    }
}