package oops;

public class Car extends Vehicle {
	
	public int numOfDoors;
	public String modelName;

	public Car (boolean isMotorised, int numOfDoors, String modelName) {
		
		super(isMotorised);
		this.numOfDoors = numOfDoors;
		this.modelName = modelName;
		
	}
	
	public void print () {
		System.out.println("The car details are:-" + "total doors are: " + this.numOfDoors + "the car model is:" + this.modelName);
		System.out.println("The maxSpeed and isMotorised property:"+ this.isMotorised + "maxSpeed is:" + this.getMaxSpeed());
	}
	
}
