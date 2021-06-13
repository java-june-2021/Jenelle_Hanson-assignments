import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
    public void printNums255() {
        for (int i = 1; i < 256; i++) {
            System.out.println(i);
        }
    }

    public void printOddNums255() {
        for (int j = 1; j < 256; j += 2) {
            System.out.println(j);
        }
    }

    public void printSum() {
        int sum = 0;
        for (int k = 0; k < 256; k++) {
            sum += k;
            System.out.println("New number: " + k + " Sum: " + sum);
        }
    }

    public void iteNPrint(int[] arr) {
        for (int l = 0; l < arr.length; l++) {
            System.out.println(arr[l]);
        }
    }

    public void printMax(int[] arr1) {
        int max = Integer.MIN_VALUE;
        for (int m = 0; m < arr1.length; m++) {
            if (arr1[m] > max) {
                max = arr1[m];
            }
        }
        System.out.println(max);
    }

    public void printAvg(int[] arr) {
        int sum = 0;
        for (int n = 0; n < arr.length; n++) {
            sum += arr[n];
        }
        System.out.println(sum / arr.length);
    }

    public void printAvg(float[] arr) {
        float sum = 0f;
        for (int n = 0; n < arr.length; n++) {
            sum += arr[n];
        }
        System.out.println(sum / arr.length);
    }

    public void printAvg(double[] arr) {
        double sum = 0;
        for (int n = 0; n < arr.length; n++) {
            sum += arr[n];
        }
        System.out.println(sum / arr.length);
    }

    public ArrayList getOddsTo255() {
        ArrayList oddsList = new ArrayList();
        for (int i = 1; i <= 255; i += 2) {
            oddsList.add(i);
        }
        return oddsList;
    }

    public int greaterThanY(int[] arr, int y) {
        int gTYValues = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > y) {
                gTYValues++;
            }
        }
        return gTYValues;
    }

    public String squares(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return Arrays.toString(arr);
    }

    public String EliminateNegNum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                arr[i] = 0;
            }
        }
        return Arrays.toString(arr);
    }

    public ArrayList maxMinAvg(int[] arr) {
        ArrayList maxMinAvg = new ArrayList();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
            sum += arr[i];
        }
        avg = sum / arr.length;
        maxMinAvg.add(max);
        maxMinAvg.add(min);
        maxMinAvg.add(avg);
        return maxMinAvg;
    }

    public String shiftingArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        return Arrays.toString(arr);
    }
}
