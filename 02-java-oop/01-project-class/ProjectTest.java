public class ProjectTest {
    public static void main(String[] args) {
        // Project projects = new Project();
        
        Project java = new Project();
        Project javaScript = new Project("User Interface");
        Project python = new Project("Personal", "Projects for Jobs");
    

        System.out.println(java.getName());
        System.out.println(java.getDescription());
        System.out.println(python.getName());
        System.out.println(python.getDescription());
        System.out.println(javaScript.getName());
        System.out.println(javaScript.getDescription());
    }
}
/*  
    projects.name = "Project1";
    projects.description = "Create my first project";
    project1.name = ;
    project2.name = ;
    project2.description = ;
    
    Java
    Python
    Javascript
*/