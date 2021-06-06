package oopsconcept;

public class CarRunnr{
	
	//@Override
	public int mileage() {
		return 23;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle m= new MarutiCar();
		Vehicle d= new DucatiBike();
		//Vehicle v=new Vehicle();
		//Vehicle h= new CarRunnr();
		
		System.out.println(m.mileage());
		System.out.println(d.mileage());
		//System.out.println(v.mileage());
		//System.out.println(h.mileage());
		//d.tyre();
	}

}
