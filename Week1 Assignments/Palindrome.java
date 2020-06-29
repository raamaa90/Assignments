package week1assignment;

public class Palindrome {
	
	public static boolean isPalindrome(String str) {
		int i=0, j= str.length()-1;
		while(i>j) {
			if(str.charAt(i) != str.charAt(j))
				return false;
		i++;
		j--;
		
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "madam";
		System.out.println(str);
		
		if (isPalindrome(str))
			System.out.println("Yes, Its Palindrome");
		else
			System.out.println("No, Its Not Palindrome");
	}

}
