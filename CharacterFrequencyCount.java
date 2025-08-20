import java.util.*;
public class CharacterFrequencyCount
{ 
    public static Map<Character, Integer> countFrequencies (String str){
        Map<Character, Integer> freqMap = new HashMap<>();
        
        for(char ch:str.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
        }

       return freqMap;
    }
	public static void main(String[] args) {
		String str = "helloworld";
		 Map<Character, Integer> map = countFrequencies(str);
	     System.out.print(map);

	}
}