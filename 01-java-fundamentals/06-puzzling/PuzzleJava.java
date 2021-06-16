import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
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

    public ArrayList<Character> task3() {
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char i = 'a'; i <= 'z'; i++) {
            alphabet.add(i);
        }
        Collections.shuffle(alphabet);
        System.out.println("Last vowel: " + alphabet.get(25));
        System.out.println("First vowel: " + alphabet.get(0));
        char firstLetter = alphabet.get(0);
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        for (int j = 0; j < vowels.length; j++) {
            if (vowels[j] == firstLetter) {
                System.out.println("It's a vowel!");
            }
        }
        return alphabet;
    }

    public ArrayList<Integer> task4() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 55; i < 100; i++) {
            nums.add(i);
        }
        ArrayList<Integer> randInts = new ArrayList<Integer>();
        for (int j = 0; j < 10; j++) {
            int randomNum = nums.get(r.nextInt(45));
            randInts.add(randomNum);
        }
        return randInts;
    }

    public ArrayList<Integer> task5() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 55; i < 100; i++) {
            nums.add(i);
        }
        ArrayList<Integer> randInts = new ArrayList<Integer>();
        for (int j = 0; j < 10; j++) {
            int randomNum = nums.get(r.nextInt(45));
            randInts.add(randomNum);
        }

        Collections.sort(randInts);

        System.out.println("Minimum number: " + randInts.get(0));
        System.out.println("Maximum number: " + randInts.get(9));
        return randInts;
    }

    public String task6() {
        ArrayList<Character> alphabet = new ArrayList<Character>();
        Random r = new Random();
        for (char i = 'a'; i <= 'z'; i++) {
            alphabet.add(i);
        }
        ArrayList<Character> randChars = new ArrayList<Character>();
        for (int j = 0; j < 5; j++) {
            Character randomCharacter = alphabet.get(r.nextInt(25));
            randChars.add(randomCharacter);
        }
        
        String randWord = new String();

        randWord = randChars.get(0).toString() + randChars.get(1)
        + randChars.get(2) + randChars.get(3) + randChars.get(4);
        
        return randWord;
    }

    public ArrayList<String> task7() {
        ArrayList<String> createString = new ArrayList<String>();
        
        for (int i = 0; i < 9; i++) {
            createString.add(task6());
        }
        return createString;
    }
}
/* import java.util.StringBuilder 
StringBuilder sb = new StringBuilder(); //String sb = "";
for(int j = 0; j < 5; j++) {
    sb.append(alphabet.get(r.nextInt(25)));
}
return sb;




*/
