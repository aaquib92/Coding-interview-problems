public class PalindromeString
{
    public static boolean isPalindrome(String input){
        int start =0;
        int end = input.length()-1; 
        while(start < end ){
            if(input.charAt(start) == input.charAt(end)){
                return true;
            }
            start++;
            end--;
        }
        return false;
    }
	public static void main(String[] args) {
		String original = "Madam";
		System.out.println(isPalindrome(original));
	}
}