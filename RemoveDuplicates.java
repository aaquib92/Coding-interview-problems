import java.util.*;
import java.util.stream.Collectors;
public class RemoveDuplicates
{
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 3, 5);
		List<Integer> removeDuplicates = list.stream().distinct().collect(Collectors.toList());
		System.out.println(removeDuplicates);


	}
}