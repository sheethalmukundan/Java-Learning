package employee.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.io.*;

public class EmployeeClass{
	
	public static void employeeData(){
		try {
		Scanner scan = new Scanner(new File("C:\\\\Users\\\\E00802\\\\Desktop\\\\employees.info.txt"));
		HashMap<String,String>map=new HashMap<String,String>();
		while(scan.hasNext()) {
			
			map.put(scan.next().toLowerCase(),scan.next());

		}
		System.out.println(map);
		Set keys = map.keySet();

		System.out.println(keys);

		System.out.println(" ");
		
		

		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	
		}
	
}
