import java.lang.Math;

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB){
        double hypotenuse = Math.sqrt((legA*legA)+(legB*legB));
        return hypotenuse;
    }
}