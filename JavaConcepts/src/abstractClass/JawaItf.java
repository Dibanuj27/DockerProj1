package abstractClass;

public class JawaItf implements Vehicle1Itf{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMWItf b=new BMWItf();
		JawaItf j=new JawaItf();
		
		j.mileage();
		j.variant();
		System.out.println("-----------");
		b.mileage();
		b.variant();
	}

	
	public void mileage() {
		// TODO Auto-generated method stub
		System.out.println("Jawa Mileage is 67kmpl");
	}

	
	public void variant() {
		// TODO Auto-generated method stub
		System.out.println("Jawa variant is Off Road");
	}

}
