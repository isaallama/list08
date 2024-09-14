package list08.exercise01;

public class Validator {
    public static void validateDiscount(double percentage) throws IllegalArgumentException {
        if (percentage < 0 || percentage > 50) {
            throw new IllegalArgumentException("Invalid discount: Discount cannot be more than 50%.");
        }
    }
}
