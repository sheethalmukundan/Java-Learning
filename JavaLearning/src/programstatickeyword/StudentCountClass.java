package programstatickeyword;

public class StudentCountClass {
	
	int id;
	static int noOfStudents=0;
	StudentCountClass(){
		
		noOfStudents++;
		
	}
	
	public static int getCountOfStudents() {
		
		return(noOfStudents);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	String name;
	int age;
	

}
