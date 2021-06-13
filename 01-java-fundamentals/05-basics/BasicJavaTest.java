import java.util.ArrayList;
import java.util.Arrays;

public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava bJ = new BasicJava();
        bJ.printNums255();// 1

        bJ.printOddNums255(); // 2

        bJ.printSum(); // 3


        int[] arr = { 1, 3, 5, 7, 9, 13 };
        bJ.iteNPrint(arr); // 4


        int[] arr1 = { -3, -5, -7 };
        int[] arr2 = { 9, 8, 10 };
        int[] arr3 = { -1, 2, 1 };
        bJ.printMax(arr1); // 5
        bJ.printMax(arr2);
        bJ.printMax(arr3);


        float[] arr4 = { 9.5f, 8.0f, 10.0f };
        double[] arr5 = { 8, 10, -80, 35, 19 };
        bJ.printAvg(arr);// 6
        bJ.printAvg(arr1);
        bJ.printAvg(arr4);
        bJ.printAvg(arr5);


        System.out.println(bJ.getOddsTo255());//7


        int y = 9;
        System.out.println(bJ.greaterThanY(arr, y));//8


        System.out.println(bJ.squares(arr5));//9


        System.out.println(bJ.EliminateNegNum(arr1));
        System.out.println(bJ.EliminateNegNum(arr3));


        System.out.println(bJ.maxMinAvg(arr2));

        int[] arr6 = {1, 5, 10, 7, -2};
        System.out.println(bJ.shiftingArray(arr6));
        int[] arr7 = {5, 10, 7, -2, 0};
        System.out.println(bJ.shiftingArray(arr7));
    }
}
/*
Shifting the Values in the Array
Given any array x, say [1, 5, 10, 7, -2], write a method that 
shifts each number by one to the front. For example, when the 
method is done, an x of [1, 5, 10, 7, -2] should become 
[5, 10, 7, -2, 0]. Notice that the last number is 0. The 
method does not need to wrap around the values shifted out 
of bounds.
*/