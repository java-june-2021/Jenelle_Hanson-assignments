public class Project {
    // Attributes
    private String name;
    private String description;
    private double initialCost;

    public Project() {
        this.name = "Website Construction";
        this.description = "Full-Stack Project";
        this.initialCost = 1000.0;
    }

    // method overloading
    public Project(String name) {
        this.name = name;
        this.description = "Front-end Project";
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // constructor
    public Project(String name, String description, double initialCost) {
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }

    public String elevatorPitch(){
        return this.name + " (" + this.initialCost + "):" + this.description;
    }

    // getters and setters

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public double getInitialCost() {
        return this.initialCost;
    }

    public void setName(String name) {
        if (name.length() < 4) {
            System.out.println("Name must be longer than 4 characters");
            return;
        }
        this.name = name;
    }

    public void setDescription(String description) {
        if (description.length() < 10) {
            System.out.println("Description must be longer than 10 characters");
            return;
        }
        this.description = description;
    }

    public void setInitialCost(double initialCost) {
        if (initialCost < 0) {
            System.out.println("Initial cost cannot be negative");
            return;
        }
        this.initialCost = initialCost;
    }

    // empty projects to add a name and
    // description to later

    // projects with just a name

    // projects with both

    // All projects have to get and set both
    // properties

    // Elevator pitch: return the name and description separated by a colon
}
