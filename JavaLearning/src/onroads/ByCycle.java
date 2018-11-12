package onroads;

public class ByCycle implements Vehicle {
	
	int speed;
	int gear;
	String color;
	
	public void changeGear(int newGear) {
		
		gear = newGear;
		
	}
	
	public void speedUp(int increase) {
		
		speed = speed+increase;
	}
	
	public void applyBreaks(int decrease) {
		
		speed = speed-decrease;
	}
	
	public void color(String colorChange) {
		
		color = colorChange;
	}
	
	public void display_Status() {
		
		System.out.println("speed in: "+speed + " gear in : "+gear+" color: "+color);
	}

}
