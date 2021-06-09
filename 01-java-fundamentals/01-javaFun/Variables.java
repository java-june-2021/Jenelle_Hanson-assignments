public class Variables {
    public static void main(String[] args){
        //primitive types cannot use methods on a primitive
        byte myByte = 127; //127 to -128
        short myShort = 32767; //32767 to -32,768
        int ourInt; // we can declare a variable without setting its value
        ourInt = 400; // we can assign a value to the variable later in our code
        long myLong = 1999999999; //2 quintillion
        double pi = 3.14159265; // we can also declare and assign on the same line
        float myFloat = 3.14f; //6 to 7 decimals the f is necessary

        boolean bool = true;
        char singleCharacter = 'A';


        //Object class
        //wrapper class (wraps the corresponding type into an obj)
        Character  myCharacter= 'r'; //makes an obj that can use methods
        Integer myInteger= 44;
        // Long myLongObj = 10000000;// type mismatch error cannot convert from an int to a long
        Double myDouble = 3.4394240;
        Boolean myBool = false;
        String myString = "style";
        // BigInteger myBigInt = 18472843498020382798; //int of any size //error cannot be resolved to a type also out of range

        long start = System.currentTimeMillis();
        int sum = 0; //changed from Integer
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        long end = System.currentTimeMillis();
        double total = (double) (end - start) / 1000;
        System.out.println("Time of execution: " + total + " seconds");
    }
}
