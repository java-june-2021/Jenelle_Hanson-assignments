public class ProjectTest {
    public static void main(String[] args) {
        Project cafe = new Project();
        Portfolio portfolio1 = new Portfolio();
        Portfolio portfolio2 = new Portfolio();
        Project elevatorPitch1 = new Project("User Interface");
        Project elevatorPitch2 = new Project("Personal", "Projects for Jobs");
        Project elevatorPitch3 = new Project("Personal", "Projects for Jobs", 1000.0);


        System.out.println(cafe.getName());
        System.out.println(cafe.getDescription());
        System.out.println(cafe.getInitialCost());
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


        portfolio1.setProjects(cafe);
        portfolio1.setProjects(elevatorPitch1);
        
        portfolio2.setProjects(elevatorPitch2);
        portfolio2.setProjects(elevatorPitch3);

        System.out.println(portfolio1.getProjects());
        System.out.println(portfolio2.getProjects());

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