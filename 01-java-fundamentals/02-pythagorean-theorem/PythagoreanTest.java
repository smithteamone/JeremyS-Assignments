public class PythagoreanTest {
    public static void main (String [] args ) {
        Pythagorean sideC = new Pythagorean();
        double hypotenuse = sideC.calculateHypotenuse(5,5);
        System.out.println(hypotenuse);
    }
}