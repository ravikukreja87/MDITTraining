import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		System.out.print("Enter a number to check Odd/Even: ");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
				
		if(number % 2 == 0) {
			System.out.println("Number is Even");
			//number % 2  produces remainder after division
		} else {
			System.out.println("Number is Odd");
		}
		//% is a remainder operator
			//== is comparison operator (left and right comparison)
			//= assignment operator (assigning value to variable)
		
		in.close();
	}

}
