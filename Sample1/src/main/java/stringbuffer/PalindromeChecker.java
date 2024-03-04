package stringbuffer;

public class PalindromeChecker
{
		        StringBuffer sb1 = new StringBuffer("java");
		        sb1.reverse();
		        StringBuffer sb2 = new StringBuffer("malayalam");
		        sb2.reverse();

		    public static void main(String[] args) 
		    {
		        String str1 = "java";
		        String str2 = "malayalam";

		        if (isPalindrome(str1)) {
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
		        else 
		        {
		            System.out.println(str2 + " is not a palindrome");
		        }
		    }

	}
