import java.util.ArrayList;
public class PuzzlingTest {
    public static void main(String[] args){
        Puzzling puzz = new Puzzling();
        ArrayList<Integer> arr = new ArrayList<Integer>(0);
        arr.add(3);
        arr.add(5);
        arr.add(1);
        arr.add(2);
        arr.add(7);
        arr.add(9);
        arr.add(8);
        arr.add(13);
        arr.add(25);
        arr.add(32);
        System.out.println(puzz.task1(arr));
        //End of Task 1


        ArrayList<String> task2Arr = new ArrayList<String>();
        task2Arr.add("Nancy");
        task2Arr.add("Jinichi");
        task2Arr.add("Fujibayashi");
        task2Arr.add("Momochi");
        task2Arr.add("Ishikawa");
        System.out.println(puzz.task2(task2Arr));
        //End of Task 2

        System.out.println(puzz.task3());
        // //End of task 3

        System.out.println(puzz.task4());
    }
}
