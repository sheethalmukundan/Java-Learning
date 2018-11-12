package array.learn;

import java.util.Scanner;

public class ArrayClass {
	
	public void arrayFunction() {
		
		Scanner S = new Scanner(System.in);
		
		
		/*a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;*/

		System.out.println("Enter the number: ");
		int iNput_num = S.nextInt();
		int a[] = new int[iNput_num];
		
        System.out.println("enter elements");



		for(int i=0;i<iNput_num;i++) {
			
			a[i] = S.nextInt();
			
		}
		System.out.println("Elements are......");

		
		for(int i:a) {
			
			
			System.out.println(i);
			
		}
	
		
		
	}

}
