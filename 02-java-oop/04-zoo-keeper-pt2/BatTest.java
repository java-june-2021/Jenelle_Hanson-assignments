public class BatTest {
    public static void main(String[] args) {
        Bat b = new Bat();

        b.setEnergyLevel(300);
        b.displayEnergy();
        b.attackTown();
        b.attackTown(); 
        b.attackTown();
        b.eatHuman();
        b.eatHuman();
        b.fly();
        b.fly();
    }
}
