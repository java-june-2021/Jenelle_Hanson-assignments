public class Mammals {
    private String name;
    private int energyLevel;
    private boolean canFly;

    //constructor
    public Mammals(String name, int energyLevel, boolean canFly){
        this.name = name;
        this.energyLevel = energyLevel;
        this.canFly = canFly;
    }

    public int displayEnergy() {
        System.out.println(energyLevel);
        return energyLevel;
    }

    //getters and setters
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

    public int getName() {
        return this.name;
    }
    
    public void setName(int name) {
        this.name = name;
    }

    // public int getEnergyLevel() {
    //     return this.energyLevel;
    // }
    
    // public void setEnergyLevel(int energyLevel) {
    //     if (energyLevel < 0) {
    //         System.out.println("This animal has no energy and fell asleep.");
    //         return;
    //     }
    //     this.energyLevel = energyLevel;
    // }
}
