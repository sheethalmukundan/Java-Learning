package polymorphism;

public class PolymorphClass {

	public static void main(String[] args) {

		Bank abc = new Bank_Abc();//We called Up casting-->base class object points to subclass
		Bank def = new Bank_Def();
		Bank xyz = new Bank_Xyz();
		System.out.println(abc.getInterestRate());
		System.out.println(def.getInterestRate());
		System.out.println(xyz.getInterestRate());

	}

}
