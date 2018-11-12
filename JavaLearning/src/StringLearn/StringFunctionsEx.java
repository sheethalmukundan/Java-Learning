package StringLearn;

public class StringFunctionsEx {

	public static void main(String[] args) {
		
		String myString = "Sheethal Mukundan";
		int strLength = myString.length();
		String strUpper = myString.toUpperCase();
		String strLower = myString.toLowerCase();
		String strConcat = "sheethal"+" Mukundan";
		System.out.println(strLength);
		System.out.println(strUpper);
		System.out.println(strLower);
		System.out.println(strConcat);
		System.out.println(myString.replace('a', 'e'));
		
		
		

	}

}
