package onroads;

public class MyClassDef {

	public static void main(String[] args) {
		
		ByCycle B = new ByCycle();
		bike B1 = new bike();
		
		B.changeGear(2);
		B.applyBreaks(1);
		B.color("Red");
		B.display_Status();
		
		B1.changeGear(4);
		B1.applyBreaks(1);
		B1.color("Green");
		B1.display_Status();

	}

}
