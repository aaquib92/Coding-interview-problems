
import java.util.*;
public class firstNonRepeatingCharacter
{ 
    public static char firstNonRepeatingCharacter(String str){
        Map<Character, Integer> freqMap = new HashMap<>();
        
        for(char ch:str.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
        }
        
        for(Map.Entry<Character, Integer> entry:freqMap.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }

       return '\0';
    }
	public static void main(String[] args) {
		String str = "swiss";
		System.out.println(firstNonRepeatingCharacter(str));

	}
}
