
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "bat", "carrot", "dog", "elephant", "fan");
        Map<Integer, List<String>> grouped = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(grouped);

    }
}
