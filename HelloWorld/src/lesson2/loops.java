package lesson2;

public class loops {

	public static void main(String[] args) {
		
		int i;
		int j;
		int s;
		
		
for(i=0;i<=10;i++) {
			
			for(s=0;s<=10-i;s++) {
				
				System.out.print(" ");
			}
			 
			for(j=0;j<=i;j++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
        for(i=9;i>=0;i--) {
			
			for(s=0;s<=10-i;s++) {
				
				System.out.print(" ");
			}
			 
			for(j=0;j<=i;j++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
			
		}


	}

}
