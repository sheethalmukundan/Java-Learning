package Inheritance;

public class InheritanceClassTutorial { 

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		rec.setValues(20, 20);
		tri.setValues(20, 30);
		
		System.out.println(rec.area());
		System.out.println(tri.area());

	}

}
