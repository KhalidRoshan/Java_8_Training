package Module_3_Tasks.Task_1;

public class StringPalindrome {
 public static void main(String args[]){
     StringPalindromeInterface strPal = (String input) -> {
         StringBuilder reverseWord = new StringBuilder(input);
         reverseWord.reverse();
         String result = reverseWord.toString();
         if (result.equals(input)) {
             System.out.println("Palindrome");
         } else {
             System.out.println("Not a palindrome");
         }
     };
     strPal.checkIfPalindrome("ABBA");
 }
}
