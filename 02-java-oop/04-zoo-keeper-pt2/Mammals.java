public class Mammals {
    private int energyLevel;

    public int displayEnergy() {
        System.out.println(energyLevel);
        return energyLevel;
    }

    public int getEnergyLevel() {
        return this.energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        if (energyLevel < 0) {
            System.out.println("This animal has no energy and fell asleep.");
            return;
        }
        this.energyLevel = energyLevel;
    }
}
