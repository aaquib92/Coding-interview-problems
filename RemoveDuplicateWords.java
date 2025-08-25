import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {
    public static String removeDuplicateWords(String str) {
        String[] words = str.split(" ");
        Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));
        String uniqueString = String.join(" ", uniqueWords);
        return uniqueString;
    }

    public static void main(String[] args) {

        String sentence = "this is is a test test sentence";
        System.out.println(removeDuplicateWords(sentence));

    }

}
