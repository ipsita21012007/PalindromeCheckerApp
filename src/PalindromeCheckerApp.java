public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String str = "madam";

        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        boolean isPalindrome = true;

        while (left < right) {
            if (arr[left] != arr[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is Not a Palindrome");
        }
    }
}