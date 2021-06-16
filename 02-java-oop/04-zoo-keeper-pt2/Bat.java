public class Bat extends Mammals {
    Mammals m = new Mammals();

    public void fly() {
        if(this.getEnergyLevel() <= 0){
            System.out.println("Bat has no energy and has fallen asleep. 'ZZZZZ'");
            return;
        } else {
            System.out.println("Bat flew away 'Flap Flap!'");
            this.setEnergyLevel(this.getEnergyLevel() - 50);
            System.out.println(this.getEnergyLevel());
        }
    }

    public void eatHuman() {
        System.out.println("Bat ate someone 'CRUNCH SLURP!'");
        this.setEnergyLevel(this.getEnergyLevel() + 25);
        System.out.println(this.getEnergyLevel());
    }

    public void attackTown() {
        if(this.getEnergyLevel() <= 0){
            System.out.println("Bat has no energy and has fallen asleep. 'ZZZZZ'");
            return;
        } else {
            System.out.println("Bat attacked a town 'CRACKLE SNAP POP WHOOSH!'");
            this.setEnergyLevel(this.getEnergyLevel() - 100);
            System.out.println(this.getEnergyLevel());
        }
    }
}
