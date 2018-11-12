package objectoriented_sec;

public class OrientedClass {
	
	int length;
	int breadth;
	int height;
	
	public int getVolumeCube() {
		
		return (length*breadth*height);
	}
	
	OrientedClass(){
		
		length = 20;
		breadth = 10;
		height = 10;
	}
	

}
