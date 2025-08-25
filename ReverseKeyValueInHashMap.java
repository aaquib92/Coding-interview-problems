import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReverseKeyValueInHashMap {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");

        List<Map.Entry<String, String>> entries = new ArrayList<>(map.entrySet());
        map.clear();
        for (Map.Entry<String, String> entry : entries) {
            map.put(entry.getValue(), entry.getKey());
        }
        System.out.println(map);

    }
}
