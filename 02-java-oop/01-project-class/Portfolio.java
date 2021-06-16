import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Project> projects;

    public Portfolio() {
        this.projects = new ArrayList<Project>();
    }

    public ArrayList<Project> getProjects() {
        return this.projects;
    }

    public void setProjects(Project p) {
        projects.add(p);
    }

    public getPortfolioCost(){
        
    };
    
}
/*
Create a Portfolio class that will keep an ArrayList of Project in the field
projects. Use generics to ensure these are Project objects.

Add the appropriate getters/setters/constructors for this class to work

Add the getPortfolioCost method that calculates and returns the cost to buy
the entire portfolio.

Add the showPortfolio method that will print all the project elevator pitches,
followed by the total cost.
*/