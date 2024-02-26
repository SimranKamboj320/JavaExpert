public class JavaExpert {
    public static boolean isPalindrome(int n) {
        int reversedNum = 0;
        int originalNum = n;

        while (n > 0) {
            int lastDigit = n % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            n = n / 10;
        }
        
        return originalNum == reversedNum;
    }

    public static void main(String args[]) {
        int num = 121;
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
