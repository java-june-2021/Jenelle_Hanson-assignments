import java.util.ArrayList;
public class Exceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("19");
        myList.add(99);
        myList.add("Hey-o World!");
        myList.add("See you next time World");
        myList.add(true);
        myList.add(999);
        
        Integer castedValue = 0;
        for(int i = 0; i < myList.size(); i++) {
            try {
                castedValue = (Integer) myList.get(i);//try to run this code
                System.out.println("This value works: " + castedValue);// print everything that runs
            } catch (ClassCastException e) { //e is exception || java.lang.ClassCastException is the name of the exception
                System.out.println("This is exception at index " + i + ": " + e);//tells me what the issue is
            }
        }
        
    }
}
