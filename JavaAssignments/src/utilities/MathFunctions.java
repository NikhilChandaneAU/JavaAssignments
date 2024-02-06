package utilities;

public class MathFunctions {

	public static double square(double number) {
        return number * number;
    }

    // Method to calculate the cube of a number
    public static double cube(double number) {
        return number * number * number;
    }

    // Method to calculate the factorial of a number
    public static long factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}
