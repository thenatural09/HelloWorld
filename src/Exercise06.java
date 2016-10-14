/**
 * Created by Troy on 10/14/16.
 */
public class Exercise06 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("sir"));
    }

    public static boolean isPalindrome(String str) {
        int i = str.length();
        String reverseStr = "";
        for (int j = i-1; j >= 0; j--) {
            reverseStr = reverseStr + str.charAt(j);
        }
        return reverseStr.equals(str);
    }
}
