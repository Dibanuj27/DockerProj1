package oopsconcept;

public class AudiInher extends CarInher {

	//static String name= "Audi's";
	public static void main(String[] args) {
		
		CarInher car=new CarInher();
		//System.out.println(name);
		System.out.println(name+" fuel efficiency is: ");
		car.fuelefficiency();
		System.out.println(name+" Version is: ");
		car.features();
		

	}

}
