
public class ForLoopExample {
	
	public static void main(String[] args) {
				//This is in feature branch
		for(int i = 0 ; i < 12 ; i++) {
			
			//for is a keyword - When we want to add looping construct to out program
			//Three parameter
			//1. A variable/counter variable is initialized
			//2. Condition to terminate the loop
			//3. Counter increment/decrement
			
			//++ operator --> adds 1 to current value --> (i = i+1)
			System.out.println(i);
			
			//Workflow
			//i = 1 and condition is checked. 1 < 11 (True). Then it will be printed to console. i will be incremented by 1
			//i = 2 and condition is checked. 2 < 11 (True). Then it will be printed to console. i will be incremented by 1
			//i = 3 and condition is checked. 3 < 11 (True). Then it will be printed to console. i will be incremented by 1
			//..................
			//..................
			//i = 11 and condition is checked. 11 < 11 (False) . Terminate the loop.
		}
		System.out.println("Next Available Statement!");
	}
}
