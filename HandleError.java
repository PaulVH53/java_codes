// Handle an exception and move on.
import java.util.Random;

class HandleError {
	public static void main(String[] args) {
		int a=0, b=0, c=0;
		Random r = new Random();
		
		for(int i=0; i<100; i++) {
			try {
				b = r.nextInt();
				c = r.nextInt();
				System.out.println("a: " + a + "   b: " + b + "   c: " + c);
				a = 12345 / (b/c);
				System.out.println("a: " + a + "   b: " + b + "   c: " + c);
			} catch (ArithmeticException e) {
				System.out.println("Division by zero.");
				a = 0; // set a to zero and continue
			}
			System.out.println("i: " + i + "   a = 12345 / (b/c) :  " + a);
			System.out.println("");
			System.out.println("");
		}
	}
}