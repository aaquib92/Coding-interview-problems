import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class DuplicateElements
{
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 3, 5);
        // Method 1
		Set<Integer> unique = new HashSet<>();
		List<Integer> duplicates = list.stream().filter(a -> !unique.add(a)).collect(Collectors.toList());
		System.out.println(duplicates);

		// Method 2
		Map<Integer,Long> freqCount = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Set<Integer> duplicate = freqCount.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());
		System.out.println(duplicate);
		

	}
}
