import java.util.*;
import java.util.stream.Collectors;
public class EvenAndOddNumbers
{
	public static void main(String[] args) {
       List<Integer> numbers = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);
       Map<String, List<Integer>> grouped = numbers.stream().collect(Collectors.groupingBy(n -> n%2 == 0 ? "Even":"Odd"));
       System.out.println(grouped);

	}
}