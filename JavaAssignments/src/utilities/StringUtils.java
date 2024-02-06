package utilities;

public class StringUtils {
	public static String reverse(String input) 
	{
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String input) 
    {
        String reversed = reverse(input);
        return input.equals(reversed);
    }

    // Method to count the number of vowels in a string
    public static int countVowels(String input) 
    {
        int count = 0;
        String lowerCaseInput = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) 
        {
            char currentChar = lowerCaseInput.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') 
            {
                count++;
            }
        }

        return count;
    }

}
