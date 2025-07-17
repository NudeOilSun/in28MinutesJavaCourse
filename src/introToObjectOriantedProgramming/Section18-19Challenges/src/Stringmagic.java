import java.io.Console;
import java.util.Arrays;

public class Stringmagic {

    public static void main(String[] args) {
        System.out.println(findLongestWord("A quick brown fox jumps over the lazy dog"));
    }

    public static String findLongestWord(String sentence) {

        if (sentence.equals("")) return "";

        String[] splitSentence = sentence.split(" ");
        String maxWord = "";

        for(String word:splitSentence){
            if (word.length() > maxWord.length()){
                maxWord = word;
            }
        }

        return maxWord;
    }
}
