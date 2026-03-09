public class PalindromeCheckerApp {
    public static void main(String[] args) {


        String str = "level";
        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        boolean palindrome = true;

        while (left < right) {
            if (arr[left] != arr[right]) {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}