// Here, Box allows one object to initialize another.
class Box {
	double width;
	double height;
	double depth;
	
	// Notice this constructor. It takes an object of type Box.
	Box(Box ob) { // pass object to constructor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	
	// constructor used when all dimensions specified
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	// constructor used when no dimensions specified
	Box() {
		width = -1; // use -1 to indicate
		height = -1; // an uninitialized
		depth = -1; // box
	}
	
	// constructor used when cube is created
	Box(double len) {
		width = height = depth = len;
	}
	
	// compute and return volume
	double volume() {
		return width * height * depth;
	}
}

class OverloadCons2 {
	public static void main(String[] args) {
		// create boxes using the various constructors
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box();
		Box mycube = new Box(7);
		Box myclone = new Box(mybox1); // create copy of mybox1
		
		double vol;
		
		// get volume of first box
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		
		// get volume of second box
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is " + vol);
		
		// get volume of cube
		vol = mycube.volume();
		System.out.println("Volume of cube is " + vol);
		
		// get volume of clone
		vol = myclone.volume();
		System.out.println("Volume of clone is " + vol);
	}
}