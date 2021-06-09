public class ImportDemoTest {
    public static void main(String[] args){
        ImportDemo i = new ImportDemo(); //We are instantiating a new ImportDemo object. All public methods of the ImportDemo class are available to the object
        String currentDate = i.getCurrentDate(); //Calling the getCurrentDate() method on the object.
        System.out.println(currentDate);
    }
    //As long as both ImportDemo and ImportDemoTest files are in the same
    //directory, you do not have to explicitly import one into another. Also,
    //you can just run the javac compiler on ImportDemoTest, and it will compile
    //both files for us
}
