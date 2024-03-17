// Method overriding.
class A {
	int i, j;
	A(int a, int b) {
		i = a;
		j = b;
	}
	
	// display i and j
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
}

class B extends A {
	int k;
	
	B(int a, int b, int c) {
		super(a, b);
		k = c;
	}
	
	// display k – this overrides show() in A
	void show() {
		super.show(); // this calls A's show()
		System.out.println("k: " + k);
	}
}

class Override {
	public static void main(String[] args) {
		B subOb = new B(1, 2, 3);
		A superOb = new A(5, 7);
		System.out.println("this calls show() in B");
		subOb.show(); // this calls show() in B
		
		System.out.println("this calls show() in A");
		superOb.show(); // this calls show() in A
	}
}