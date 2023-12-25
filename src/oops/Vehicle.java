/**
 * 
 */
package oops;

/**
 * 
 */
public class Vehicle {

	
	private int maxSpeed;
	public boolean isMotorised;
	
	public Vehicle (boolean isMotorised) {
		this.isMotorised = isMotorised;
	}
	
	public void setMaxSpeed (int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public int getMaxSpeed () {
		return this.maxSpeed;
	}
	

}
