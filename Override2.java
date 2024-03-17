// Methods with differing type signatures are overloaded – not
// overridden.
class A2 {
	int i, j;
	
	A2(int a, int b) {
		i = a;
		j = b;
	}
	
	// display i and j
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
}


// Create a subclass by extending class A.
class B2 extends A2 {
	int k;
	
	B2(int a, int b, int c) {
		super(a, b);
		k = c;
	}
	// overload show()
	void show(String msg) {
		System.out.println(msg + k);
	}
}

class Override2 {
	public static void main(String[] args) {
		B2 subOb = new B2(1, 2, 3);
		
		subOb.show("This is k: "); // this calls show() in B2
		subOb.show(); // this calls show() in A2
	}
}