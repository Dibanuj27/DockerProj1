package oopsconcept;
import abstractClass.BMWItf;
public class CarRunner {

	public static void main(String[] args) {
		
		CarInher car=new CarInher();
		//System.out.println(name);
		System.out.println(car.name+" fuel efficiency is: ");
		car.fuelefficiency();
		System.out.println(car.name+" Version is: ");
		car.features();
		
		BMWItf b=new BMWItf();
		b.mileage();
		
	}

}
