package introToObjectOriantedProgramming;

public class MyCharRunner {

	public static void main(String[] args) {

		MyChar MyChar = new MyChar('c');
		System.out.println(MyChar.isVowel());
		System.out.println(MyChar.isNumber());
		System.out.println(MyChar.isAlphabet());

		MyChar.printLowerCaseAlphabet();
		MyChar.printUpperCaseAlphabet();

	}

}
