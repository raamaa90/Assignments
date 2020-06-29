/*Find the sum of digits of a given number

		Pseudo code:
		* Declare your input number (int)
		* Initialize an integer variable by name: sum
		* Use loop to calculate the sum: which loop to use until the number goes greater than 0??
		* Within loop: get the remainder when done by 10 -> Tip: use mod operator( % )
		* Print the remainder to confirm
		* Within loop: add that remainder to the sum
		* Print the sum to confirm	
		* Within loop: get quotient of that number (tip: quotient should be same variable of loop condition)	
		* Print the quotient to confirm		
		* Outside the loop: print the final sum
		*/
package week1assignment;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a=901,b,c=0;
 
 for(int i=0 ; i<3 ; i++) {
 
	 b=a%10;
	 System.out.println("Value of a Mod 10 is : " +b);
	 c=c+b;
	 System.out.println("Value of Sum : " +c);
	 a=a/10;
	 System.out.println("Value of Quotient is " +a);
	
 }
 
 System.out.println("Sum of Provided Digit is : " +c);
	}

}
