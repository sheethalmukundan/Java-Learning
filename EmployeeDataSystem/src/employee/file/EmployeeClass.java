package employee.file;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeClass {
	private String id;
	private String name;
	private long phone;
	private String email;
	
//Constructor implementation 
	
public EmployeeClass(String id,String name,long phone,String email) {
		
		this.id = id.toLowerCase();
		this.name = name;
		this.phone = phone;
		this.email = email;
		
	}
//using getters and setters method to access private variable using public
//get method will give us the value
//set method will accept the value
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}

//initialize class to load the linkedlist
//checking the duplicate values through iterating the id's

class LoadData{
	
	//method to check the identical id's
	
	public static void identicalData(LinkedList<EmployeeClass> Employ) {
		//creating a new list to map id individually
		
		LinkedList<String> list = new LinkedList<String>();

		//iterating id's and adding to the new list which is created
		for(EmployeeClass emp:Employ)
		{
			//adding all employ id's to one variable through iteration
			String c = emp.getId();
			list.add(c);
		}
		
		//System.out.println(list);
		
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
					break;

					}
				else {}
				
				previous=current;
				
			}
			

		}
		
		}
	public static void searchData(LinkedList<EmployeeClass> Employ) {
		
		//scanner for user input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name/id of Employee: ");
		String id_Name = scan.nextLine();
		
		//iterating the list and printing the values according to user input.
		for(EmployeeClass emp:Employ) {
			
			//equals will provide the true or false if the user input matches the empid.
			//iterating upto the list size
			
			if(id_Name.equals(emp.getId())||id_Name.equalsIgnoreCase(emp.getName())) {
				
				System.out.println("ID = "+emp.getId()+"\nName = "+emp.getName()+" \nPhone = "+emp.getPhone()+" \nEmail = "+emp.getEmail());
			}
			
		}
		
	}
	
}






