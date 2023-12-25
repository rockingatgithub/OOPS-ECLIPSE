package oops;

public class Car extends Vehicle {
	
	public int numOfDoors;
	public String modelName;

	public Car (int maxSpeed, boolean isMotorised, int numOfDoors, String modelName) {
		
		super(maxSpeed, isMotorised);
		this.numOfDoors = numOfDoors;
		this.modelName = modelName;
		
	}
	
	public void print () {
		System.out.println("The car details are:-" + "total doors are: " + this.numOfDoors + "the car model is:" + this.modelName);
	}
	
}
