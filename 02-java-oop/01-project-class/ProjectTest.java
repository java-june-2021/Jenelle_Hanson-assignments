public class ProjectTest {
    public static void main(String[] args) {
        Project elevatorPitch = new Project();
        Project elevatorPitch1 = new Project("User Interface");
        Project elevatorPitch2 = new Project("Personal", "Projects for Jobs");
        Project elevatorPitch3 = new Project("Personal", "Projects for Jobs", 1000.0);


        System.out.println(elevatorPitch.getName());
        System.out.println(elevatorPitch.getDescription());
        System.out.println(elevatorPitch.getInitialCost());
        System.out.println("*****************");

        System.out.println(elevatorPitch1.getName());
        System.out.println(elevatorPitch1.getDescription());
        System.out.println(elevatorPitch1.getInitialCost());
        System.out.println("*****************");

        System.out.println(elevatorPitch2.getName());
        System.out.println(elevatorPitch2.getDescription());
        System.out.println(elevatorPitch2.getInitialCost());
        System.out.println("*****************");

        System.out.println(elevatorPitch3.getName());
        System.out.println(elevatorPitch3.getDescription());
        System.out.println(elevatorPitch3.getInitialCost());
        System.out.println("*****************");


        // System.out.println(elevatorPitch.elevatorPitch());
        System.out.println(elevatorPitch3.elevatorPitch());

    }
}

/*
 *  Create a Portfolio class that will keep an ArrayList of Project in the
 * field projects. Use generics to ensure these are Project objects.
 * 
 * 
 *  Add the appropriate getters/setters/constructors for this class to work
 * 
 * 
 *  Add the getPortfolioCost method that calculates and returns the cost to buy
 * the entire portfolio.
 * 
 * 
 *  Add the showPortfolio method that will print all the project elevator
 * pitches, followed by the total cost.
 * 
 */