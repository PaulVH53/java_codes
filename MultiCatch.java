/*
Here is a catch statement that uses the multi-catch feature to catch both
ArithmeticException and ArrayIndexOutOfBoundsException:
catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
The following program shows the multi-catch feature in action:
*/

// Demonstrate the multi-catch feature.
class MultiCatch {
	public static void main(String[] args) {
		int a=10, b=0;
		int[] vals = { 1, 2, 3 };
	
		try {
			//int result = a / b; // generate an ArithmeticException
			
			vals[10] = 19; // generate an ArrayIndexOutOfBoundsException
			
		// This catch clause catches both exceptions.
		} catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught: " + e);
		}
		
		System.out.println("After multi-catch.");
	}
}