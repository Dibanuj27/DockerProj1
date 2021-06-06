package abstractClass;

public class FerrariEncp extends CarEncp {

	public static void main(String[] args) {
		CarEncp c=new CarEncp();
		 c.setModel("Limited Edition");
		 c.setPrice(200);

		 System.out.println("Model is " +c.getModel());
		 System.out.println("Price is "+c.getPrice());
		 
	}

}
