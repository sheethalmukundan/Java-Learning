package objectoriented;

public class OopsLearning {

	public static void main(String[] args) {
		
		Student S1 = new Student();
		// setting the variable values using setter ...
		//it will restrict the direct access for the values..
		S1.setId(1785);
		S1.setAge(22);
		S1.setName("Sheethal");
		//calling the values using getter...
		System.out.println(S1.getName());
		System.out.println(S1.getAge());
		System.out.println(S1.getId());
		
		
		

	}

}
