package package2;

import oops.Car;

public class Oops2 {
	
	public static void main (String args []) {
		Car c1 = new Car(false, 2, "Ferrari");
		c1.setMaxSpeed(600);
		c1.isMotorised = true;
		c1.print();
	}

}
