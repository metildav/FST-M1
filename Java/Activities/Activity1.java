package activities;

public class Activity1 {

	public static void main(String[] args) {
		Car ford = new Car();
		ford.make = 2014;
		ford.color = "Black";
		ford.transmission = "Manual";
		ford.displayCharacteristics();
		ford.accelerate();
		ford.brake();
	}

}

