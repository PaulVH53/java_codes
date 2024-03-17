// This program uses inheritance to extend Box.
class Box {
	double width;
	double height;
	double depth;

	// construct clone of an object
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

// BoxWeight now uses super to initialize its Box attributes.
class BoxWeightSuper extends Box {
	double weight; // weight of box
	
	// initialize width, height, and depth using super()
	BoxWeightSuper(double w, double h, double d, double m) {
		super(w, h, d); // call superclass constructor
		weight = m;
	}
}

class DemoBoxWeightSuper {
	public static void main(String[] args) {
		BoxWeightSuper mybox1 = new BoxWeightSuper(10, 20, 15, 34.3);
		BoxWeightSuper mybox2 = new BoxWeightSuper(2, 3, 4, 0.076);
		double vol;
		
		//vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + mybox1.volume());
		System.out.println("Weight of mybox1 is " + mybox1.weight);
		System.out.println();
		
		//vol = mybox2.volume();
		System.out.println("Volume of mybox2 is " + mybox2.volume());
		System.out.println("Weight of mybox2 is " + mybox2.weight);
	}
}