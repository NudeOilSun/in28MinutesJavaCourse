package introToObjectOriantedProgramming;

public class MyChar {
	char myChar;

	MyChar(char myChar) {
		this.myChar = myChar;
	}

	Boolean isVowel() {
		char lowerChar = Character.toLowerCase(this.myChar);

		return lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u';
	}

	Boolean isNumber() {
		return Character.isDigit(this.myChar);
	}

	Boolean isAlphabet() {
		return Character.isAlphabetic(myChar);
	}

	void printLowerCaseAlphabet() {
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(c + " ");
		}
	}

	void printUpperCaseAlphabet() {
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.println(c + " ");
		}
	}

}
