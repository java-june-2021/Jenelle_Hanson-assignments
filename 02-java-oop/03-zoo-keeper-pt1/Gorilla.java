public class Gorilla extends Mammal {
    Mammal m = new Mammal();
    public void throwSomething(){
        System.out.println("Gorilla has thrown something!");
        this.setEnergyLevel(this.getEnergyLevel() - 5); 
        System.out.println(this.getEnergyLevel());
    }

    public void eatBananas(){
        System.out.println("Gorilla ate a banana!");
        this.setEnergyLevel(this.getEnergyLevel() + 10); 
        System.out.println(this.getEnergyLevel()); 
    }

    public void climb(){
        System.out.println("Gorilla climbed a tree!");
        this.setEnergyLevel(this.getEnergyLevel() - 10); 
        System.out.println(this.getEnergyLevel());
    }

}
