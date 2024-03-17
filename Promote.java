class Promote {
	public static void main(String[] args) {
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = .1234;
		
		double result = (f * b) + (i / c) - (d * s);
		
		System.out.println("byte b = 42");
		System.out.println("char c = 'a'");
		System.out.println("short s = 1024");
		System.out.println("int i = 50000");
		System.out.println("float f = 5.67f");
		System.out.println("double d = .1234");
		
		System.out.println("double result = (f * b) + (i / c) - (d * s)");
		System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
		System.out.println("result = " + result);
	}
}