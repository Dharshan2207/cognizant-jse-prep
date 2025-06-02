public class PalindromdCheck {
    public static void main(String[] args) {
        String text = "madam";
        int left = 0;
        int right = text.length() -1;
        boolean isPalindrome = true;
        while((left < right) && isPalindrome){
            if(text.charAt(left) != text.charAt(right)){
                isPalindrome = false;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
