
public class ShortCalc {

	public static void main(String[] args) {
		
		
		String welcomeMessage = "Welcome to My Short Calculator";
		
		int firstNumber = 10;
		int secondNumber = 20;
		
		double firstDecimal = 10.22;
		double secondDecimal = 9.11;
		
		int totalNumber = (int) (firstNumber + secondDecimal);
		double totalDecimal = firstDecimal + secondNumber;
		
		//Operator overloading
		String results = "Results are: ";
		
		System.out.println(welcomeMessage);
		System.out.println();
		System.out.println("=============================");
		System.out.println(results + "(for Numbers) :" + totalNumber);
		System.out.println(results + "(for Decimals) :" +totalDecimal);
		
	}
	
}
