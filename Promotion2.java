// Demonstrate casts.
class Promotion2 {
	public static void main(String[] args) {
		byte b = 50;
		
		b = (byte)(b * 2); // Error! Cannot assign an int to a byte!
		
		System.out.println("byte b = 50");
		System.out.println("b = b * 2 = " + b);
	}
}