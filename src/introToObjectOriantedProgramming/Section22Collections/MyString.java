package introToObjectOriantedProgramming.Section22Collections;

public class MyString {

    public String str;

    public MyString(String str) {
        this.str = str;
    }

    public boolean isHexadecimalChar(char ch) {
        return (ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f');
    }

    public boolean isHexadecimal() {
        if (str == null || str.length() == 0) return false;

        for(char c:str.toCharArray()){
            if (!Character.isDigit(c) && !isHexadecimalChar(c)) return false;
        }

        return true;
    }

    public String reverseWordsInSentence(String sentence) {

        if (sentence == null) return "INVALID";
        if (sentence.isEmpty()) return "";

        String[] words = sentence.split(" ");

        StringBuilder reversedSentence = new StringBuilder();

        for(String word:words){
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedSentence.append(reversedWord).append(" ");
        }
        return reversedSentence.toString().trim();
    }

}