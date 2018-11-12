package statickeyworduse;

public class UseStatic {

	public static void main(String[] args) {
		
		StaticUse S1 = new StaticUse();
		System.out.println(StaticUse.doSomething(10,20));
		System.out.println(S1.doSomethingElse("Hello Good evening...."));
		System.out.println(StaticUse.area);

	}

}
