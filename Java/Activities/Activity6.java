package activities;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		//Creating object for Plane class and setting maxPassengers to 10 by passing it to constructor
		Plane plane = new Plane(10);
		//Add passengers on the list
		plane.onboard("John");
		plane.onboard("Steve");
		plane.onboard("Anna");
		//Plane takes off
		System.out.println("Plane took off at: " + plane.takeOff());
		//Print list of people on board
		System.out.println("People on board: " + plane.getPassengers());
		//Flying
		Thread.sleep(5000);
		//Plane has landed
		plane.land();
		System.out.println("Plane landed at: " + plane.getLastTimeLanded());
		System.out.println("People on the plane after landing: " + plane.getPassengers());
	}

}
