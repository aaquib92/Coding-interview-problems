import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountVowelsInWordsGreater {
    private static int countVowels(String word) {
        return (int) word.toLowerCase().chars().filter(ch -> "aeiou".indexOf(ch) >= 0).count();
    }

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "sky", "orange", "pear", "grape");
        List<String> result = words.stream().filter(word -> countVowels(word) > 2).collect(Collectors.toList());
        System.out.println(result);

    }
}
