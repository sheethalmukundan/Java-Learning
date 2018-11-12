package exception.learn;

public class ExceptionHandlingClass {
	
	public void operation() {
		
		try {
			
			int data = 100/0;
		}
		
		catch(ArithmeticException e) {
			
			System.out.println("There is an Exception");
		}
	}

}
