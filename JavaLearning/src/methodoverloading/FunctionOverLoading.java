package methodoverloading;

public class FunctionOverLoading {

	public static void main(String[] args) {
		
		System.out.println(startProcess(20,10,10));
		System.out.println(startProcess("Sheethal","Mukundan"));
		System.out.println(startProcess(20.23,30.23));

	}
	
	public static int startProcess(int l,int b,int h) {
		
		return(l*b*h);
	}
	
	public static String startProcess(String a,String b) {
		
		return(a+b);
		
	}
	
	public static double startProcess(double a,double b) {
		
		return(a+b);
	}

}
