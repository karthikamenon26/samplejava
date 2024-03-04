package palindrome;

public class PalindromeChecker 
{
    public static boolean isPalindrome(String str) 
    {
        StringBuffer sb = new StringBuffer(str);
        String reversedStr = sb.reverse().toString();
        return str.equals(reversedStr);
    }

    public static void main(String[] args) 
    {
        String str1 = "java";
        String str2 = "malayalam";

        if (isPalindrome(str1))
        {
            System.out.println(str1 + " is a palindrome");
        } 
        else 
        {
            System.out.println(str1 + " is not a palindrome");
        }

        if (isPalindrome(str2)) 
        {
            System.out.println(str2 + " is a palindrome");
        }
        else {
            System.out.println(str2 + " is not a palindrome");
        }
    }
}
