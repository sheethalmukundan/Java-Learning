package programstatickeyword;

public class StudentClass {

	public static void main(String[] args) {
		
		StudentCountClass Obj = new StudentCountClass();
		StudentCountClass Obj1 = new StudentCountClass();
		Obj.setName("Shinaz Azeez");
		Obj.setAge(25);
		Obj.setId(1587923);

		System.out.println(Obj.getName());
		System.out.println(Obj.getAge());
		System.out.println(Obj.getId());
		System.out.println(StudentCountClass.getCountOfStudents());
		System.out.println(StudentCountClass.noOfStudents);
		
		

	}

}
