public class SquareRoot {

    // Returns the square root of a number
    public static double sqrt(double a) {
        if (a < 0) {
            throw new ArithmeticException("Cannot take square root of a negative number.");
        }
        return Math.sqrt(a);
    }
}
