package utilities;

public class Main {

	public static void main(String[] args) 
	{
	        // Using methods from MathFunctions
	        System.out.println("Square of 5: " + MathFunctions.square(5));
	        System.out.println("Cube of 3: " + MathFunctions.cube(3));
	        System.out.println("Factorial of 4: " + MathFunctions.factorial(4));

	        // Using methods from StringUtils
	        System.out.println("Reverse of 'hello': " + StringUtils.reverse("hello"));
	        System.out.println("Is 'radar' a palindrome? " + StringUtils.isPalindrome("radar"));
	        System.out.println("Number of vowels in 'Java': " + StringUtils.countVowels("Java"));
	    }

	}


