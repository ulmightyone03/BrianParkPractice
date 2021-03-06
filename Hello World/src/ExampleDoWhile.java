
public class ExampleDoWhile {
	
/*
 * Here is a "do while" statement
 * similar to "while" statement
 * but DIFFERENT LOL
 */

	public static void main(String[] args) {
		// "Do~While" statement practice
		
		int x = 10;
		
		do{
			System.out.println("x = " + x);
			x--;
			
		}while(x > 0);
		
		int a = -10;
		// If integer doesn't meet condition
		
		do{
			System.out.println("a = " + a);
			a--;
			
		}while(a > 0);
		// Should still run at least once!
		
	/*
	 * Here's a "while" loop 
	 * to show the difference
	 * just in case :)
	 */
		int b = 10;
		
		while(b <= 0){
			System.out.println("b = " + b);
			b = b + 2;
	/*
	 * As you can see
	 * the system did not print even once
	 * because "while" loops
	 * check the condition FIRST!
	 */
		}
		
	}

}
