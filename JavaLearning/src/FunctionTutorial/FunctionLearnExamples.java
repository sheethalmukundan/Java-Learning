package FunctionTutorial;

class MyFirstClass{
	
	public static void myFirstFunction() {
		
		System.out.println("This is simple example of method");
	}
	
	public static void funcWithArg() {
		
		int a = 8;
		boolean flag = false;
		for(int num=2;num<=a/2;num++) {
			
			if(a%num==0) {
				
				flag = true;
				break;
			}
			
		}
		if(!flag) {
			System.out.println("prime numer");
			
		}
		else {
			System.out.println("not a prime number");
		}
		
	
	}
	
	
}

public class FunctionLearnExamples {

	public static void main(String[] args) {
		
		MyFirstClass M1 = new MyFirstClass();
		M1.myFirstFunction();
		M1.funcWithArg();
		
	}
	
	
	
	
	
}
