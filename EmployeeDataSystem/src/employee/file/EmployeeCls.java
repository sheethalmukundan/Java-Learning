package employee.file;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EmployeeCls {
	
	

	public static void main(String[] args) {
		LinkedList<EmployeeClass> emp = new LinkedList();
		emp.add(new EmployeeClass("E0001", "Abheesh",9976767999L,"abheesh@gmail.com"));
		emp.add(new EmployeeClass("e0001", "Sheethal",9876789879L,"sheethal@gmail.com"));
		emp.add(new EmployeeClass("E0003", "Vaishnav",9845764576L,"vaishnav@gmail.com"));
		emp.add(new EmployeeClass("E0004", "John",9845321243L,"john@gmail.com"));
		emp.add(new EmployeeClass("e0005", "john",8767456351L,"john12345@gmail.com"));
		
		LoadData L1 = new LoadData();
		LoadData.identicalData(emp);
		LoadData.searchData( emp);

		
		
	
		
		
		
		}
				
	}
	

