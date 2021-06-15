public class Project {
    //Attributes
    private String name;
    private String description;
    

    //constructor
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    //method overloading
    public Project(String name){
        this.name = name;
        this.description = "Front-end Project";
    }

    public Project() {
        this.name = "Website Construction";
        this.description = "Full-Stack Project";
    }

    //Methods
    //getters and setters

    public String getName(){
        return this.name;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public String setName(){
        return this.name;
    }
    
    public String setDescription(){
        return this.description;
    }


    //empty projects to add a name and 
    //description to later 

    //projects with just a name

    //projects with both

    //All projects have to get and set both 
    //properties

    //Elevator pitch: return the name and description separated by a colon

    /*     public void setName(){
        if(name.equals("")){
            System.out.println("Please input more characters");
            return;
        }
        if(name.length() < 4){
            System.out.println("must be more than 4 characters");
            return;
        }
     */
}
