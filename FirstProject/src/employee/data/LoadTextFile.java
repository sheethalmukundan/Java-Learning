package employee.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.*;

public class LoadTextFile {
	
	
	 static {
		try {
		File file=new File("C:\\Users\\E00802\\Desktop\\employees.info.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while ((st = br.readLine()) != null) {
			System.out.println(st);
			
		}
		}
		catch(FileNotFoundException e) {
			
			e.printStackTrace();

		}
			catch(IOException i) {
				
				i.printStackTrace();
		}

		}
	 
	 
	
	}




