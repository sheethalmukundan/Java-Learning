package recursion.learn;

public class FactorialClass {
	
	public static int factorialFuntion(int n) {
		 
		if(n<=1)
			return 1;
		else
			return(n*factorialFuntion(n-1));
	}

	public static void main(String[] args) {
		
		System.out.println(factorialFuntion(5));
 
	}

}
