
public class ExampleAndOr {
	
/*
 * Starting "and & or" statements
 * Wish me luck
 * I hope my future stays bright!
 */

	public static void main(String[] args) {
		// "And & Or" statement practice
		
		int x, y;
		x = 10;
		y = -10;
		// && and
		// || or
		if(x > 0 && y > 0){
			System.out.println(" Both num are +ve");
		}else if(x > 0 || y > 0){
			System.out.println(" at least one num is +ve");
		}else{ //else{ is also else if( x < 0 && y < 0);
			System.out.println(" Both num are -ve");
		}
		
		int a, b;
		a = -10;
		b = 10;
		
		/*
		 *  Using only a single "&&or"
		 *  Same function!
		 */
		
		if(a > 0 & b > 0){
			System.out.println(" Both num are +ve");
		}else if(a > 0 | b > 0){
			System.out.println(" at least one num is +ve");
		}else{
			System.out.println(" Both nums are -ve");
		}

	}	

}
