import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
public class PythagClass {
    public double calculateHypotenuse(int legA, int legB){
        double legC = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
        return legC;
    }
    //why cant I return this statement  "The Hypotenuse of a" + legA + " and " + legB + " triangle is: " + legC;
}