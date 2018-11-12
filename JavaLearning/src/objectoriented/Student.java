package objectoriented;

public class Student {
	/*
	 * generating the getter and setter to prevent the direct access
	 * put the cursor on any variable and goto-->Source-->Generates getters and setters
	 * getId()--> will return the values to the function
	 * setId()--> will accept the values for the particular arguments which has been already passed.. 
	 */
	
	int id;
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
