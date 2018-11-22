package data.employee;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class EmpClass {

	static {
		HashMap<String,EmployeeClass> map = new HashMap<>();
		//List<EmployeeClass> list = new ArrayList<>();

		try {
			File file = new File("employees.properties");
			FileInputStream fileInput = new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(fileInput);
			fileInput.close();

			EmployeeClass emp1 =new EmployeeClass(properties.getProperty("emp1.id"),properties.getProperty("emp1.name"),properties.getProperty("emp1.phone"),properties.getProperty("emp1.email"));
			EmployeeClass emp2 =new EmployeeClass(properties.getProperty("emp2.id"),properties.getProperty("emp2.name"),properties.getProperty("emp2.phone"),properties.getProperty("emp2.email"));
			EmployeeClass emp3 =new EmployeeClass(properties.getProperty("emp3.id"),properties.getProperty("emp3.name"),properties.getProperty("emp3.phone"),properties.getProperty("emp3.email"));
			EmployeeClass emp4 =new EmployeeClass(properties.getProperty("emp4.id"),properties.getProperty("emp4.name"),properties.getProperty("emp4.phone"),properties.getProperty("emp4.email"));
			EmployeeClass emp5 =new EmployeeClass(properties.getProperty("emp5.id"),properties.getProperty("emp5.name"),properties.getProperty("emp5.phone"),properties.getProperty("emp5.email"));
			
			map.put(properties.getProperty("emp1.id").toLowerCase(), emp1);
			map.put(properties.getProperty("emp2.id").toLowerCase(), emp2);
			map.put(properties.getProperty("emp3.id").toLowerCase(), emp3);
			map.put(properties.getProperty("emp4.id").toLowerCase(), emp4);
			map.put(properties.getProperty("emp5.id").toLowerCase(), emp5);
			
			
			//System.out.println(map);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	searchIdentical(map);
	searchData(map);

	}
	
	public static void searchIdentical(HashMap<String,EmployeeClass> map) {
		
		
		//Set<String> keys = map.keySet();
		//System.out.println(keys);
		LinkedList<String> list  = new LinkedList<>();
		
		
		
	
		
		for (Map.Entry<String,EmployeeClass> entry : map.entrySet()) {
		    String key = entry.getKey();
		    EmployeeClass value = entry.getValue();
		    list.add(key);
		   }
		
		System.out.println(list);
		Iterator<String> iter = list.listIterator();
		//iterating the element one by one from the list object
		//if the iter have next input on hand hasNext() will give true.
		//next will read the data upto space
		if(iter.hasNext()) {
			String previous = iter.next();
			while(iter.hasNext()) {
				String current = iter.next();
				
				if(previous.equals(current)) {
					
					System.err.println("Invalid Data");
					

					}
				else {System.out.println("hai");}
				
				previous=current;
				
			}
		}
	}
		
	
	
	public static void searchData(HashMap<String,EmployeeClass> map) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name/id of Employee: ");
		String id_Name = scan.nextLine();
		
		for (Map.Entry<String,EmployeeClass> entry : map.entrySet()) {
		    String key = entry.getKey();
		    EmployeeClass value = entry.getValue();
		    //System.out.println(key);
		    
		    if(id_Name.equalsIgnoreCase(key) || id_Name.equalsIgnoreCase(value.getName()))  {
		    	
		    	System.out.println(map.get(key));
		    }
		}
		
	
	}
		
	

	public static void main(String[] args) {
		//EmployeeClass emp = new EmployeeClass();
		// List<EmployeeClass> list = new ArrayList<>();
		

}
	}
