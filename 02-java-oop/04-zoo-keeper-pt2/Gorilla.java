public class Gorilla extends Mammals {
    Mammals m = new Mammals();

    public void throwSomething(){
        System.out.println("Gorilla has thrown something 'WHOOSH!'");
        this.setEnergyLevel(this.getEnergyLevel() - 5); 
        System.out.println(this.getEnergyLevel());
    }

    public void eatBananas(){
        System.out.println("Gorilla ate a banana 'Nom Nom!");
        this.setEnergyLevel(this.getEnergyLevel() + 10); 
        System.out.println(this.getEnergyLevel()); 
    }

    public void climb(){
        System.out.println("Gorilla climbed a tree!");
        this.setEnergyLevel(this.getEnergyLevel() - 10); 
        System.out.println(this.getEnergyLevel());
    }
}
