package oops;

public class CarUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car(true, 4, "BMW");
		Car c2 = new Car(false, 5, "Ferrari");
		
		c1.setMaxSpeed(200);
		c2.setMaxSpeed(300);
		
		c1.print();
		c2.print();
		
	}

}
