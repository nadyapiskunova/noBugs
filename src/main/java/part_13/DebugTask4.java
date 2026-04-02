package part_13;

public class DebugTask4 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(null));
        System.out.println(isPalindrome("abba"));
    }
    public static boolean isPalindrome(String str) {
        if(str == null || str.isEmpty()){
             return false;
        }
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
