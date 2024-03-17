// Demonstrate the basic arithmetic operators.
class BasicMath {
	public static void main(String[] args) {
		// arithmetic using integers
		System.out.println("Integer Arithmetic");
		int a = 1 + 1;
		int b = a * 3;
		int c = b / 4;
		int d = c - a;
		int e = -d;
		
		System.out.println("int a = 1 + 1 = " + a);
		System.out.println("int b = a * 3 = " + b);
		System.out.println("int c = b / 4 = " + c);
		System.out.println("int d = c - a = " + d);
		System.out.println("int e = -d = " + e);
		
		// arithmetic using doubles
		System.out.println("\nFloating Point Arithmetic");
		double da = 1 + 1;
		double db = da * 3;
		double dc = db / 4;
		double dd = dc - a;
		double de = -dd;
		System.out.println("double da = 1 + 1 = " + da);
		System.out.println("double db = da * 3 = " + db);
		System.out.println("double dc = db / 4 = " + dc);
		System.out.println("double dd = dc - a = " + dd);
		System.out.println("double de = -dd = " + de);
	}
}