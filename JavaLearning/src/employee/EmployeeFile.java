package employee;

public class EmployeeFile {

	public static void main(String[] args) {
		
		EmployeeData Emp = new EmployeeData();
		Emp.setId(123456);
		Emp.setName("Jazzim Jack");
		Emp.setAge(30);
		
		System.out.println(Emp.getId());
		System.out.println(Emp.getAge());
		System.out.println(Emp.getName());

	}

}
