public class StringManipulatorTesting {
    public static void main(String[] args) {
    StringManipulator sM = new StringManipulator();
    System.out.println(sM.trimAndConcat("    Hello     ","     World    "));
    
    char letter = 'o';
    Integer a = sM.getIndexOrNull("Coding", letter);
    Integer b = sM.getIndexOrNull("Hello World", letter);
    Integer c = sM.getIndexOrNull("Hi", letter);
    System.out.println(a); // 1
    System.out.println(b); // 4
    System.out.println(c); // null
        

    String word = "Hello";
    String subString = "llo";
    String notSubString = "world";
    Integer a1 = sM.getIndexOrNull(word, subString);
    Integer b1 = sM.getIndexOrNull(word, notSubString);
    System.out.println(a1); // 2
    System.out.println(b1); // null

    String word1 = sM.concatSubstring("Hello", 1, 2, "world");
    System.out.println(word1);
    }
}