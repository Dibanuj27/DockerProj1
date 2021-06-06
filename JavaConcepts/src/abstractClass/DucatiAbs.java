package abstractClass;

public class DucatiAbs extends VehicleAbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VehicleAbs m=new MarutiAbs();
		VehicleAbs d=new DucatiAbs();
		
		m.mileage();
		d.mileage();

	}

	//@Override
	public void mileage() {
		// TODO Auto-generated method stub
		System.out.println("Mileage is 35kmpl");
	}

}
