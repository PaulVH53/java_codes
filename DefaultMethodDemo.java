// Implement MyIF.
class MyIFImp implements MyIF {
	// Only getNumber() defined by MyIF needs to be implemented.
	// getString() can be allowed to default.
	public int getNumber() {
		return 100;
	}
}

// Use the default method.
class DefaultMethodDemo {
	public static void main(String[] args) {
		MyIFImp obj = new MyIFImp();
		
		// Can call getNumber(), because it is explicitly
		// implemented by MyIFImp:
		System.out.println(obj.getNumber());
		
		// Can also call getString(), because of default
		// implementation:
		System.out.println(obj.getString());
	}
}
