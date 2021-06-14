import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Puzzling {
    public ArrayList<Integer> task1(ArrayList<Integer> arr) {
        int sum = 0;
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (arr.get(i) > 10) {
                newArr.add(arr.get(i));
            }
        }
        System.out.println(sum);
        return newArr;
    }

    
    public ArrayList<String> task2(ArrayList<String> arr) {
        ArrayList<String> newArr = new ArrayList<String>();
        Collections.shuffle(arr);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() > 5) {
                newArr.add(arr.get(i));
            }
        }
        System.out.println(arr);
        return newArr;
    }


    public ArrayList<Character> task3(){
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for(char i = 'a'; i <= 'z'; i++){
            alphabet.add(i);
        }
        Collections.shuffle(alphabet);
        System.out.println("Last vowel: " + alphabet.get(25));
        System.out.println("First vowel: " + alphabet.get(0));
        char firstLetter = alphabet.get(0);
        char[] vowels = {'a','e','i','o','u'};
        for(int j = 0; j < vowels.length; j++) {
            if(vowels[j] == firstLetter){
                System.out.println("It's a vowel!");
            }
        }
    return alphabet;
    }


    public ArrayList<Integer> task4(){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Random r = new Random();
        for(int i = 55; i < 100; i++){
            nums.add(i);
        }
        ArrayList<Integer> randInts = new ArrayList<Integer>();
        for(int j = 0; j < 10; j++){
            // int randomNum = nums.get(r.nextInt(45));
            randInts.add(randomNum);
        }
        return randInts;
    }
}
