import java.util.HashMap;
import java.util.Map;

public class ToppingShenanigans {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("salad", "oil");
        map.put("potato", "ketchup");
        System.out.println("Map before modifying: " + map);
        System.out.println("Map after modifying: "+modifyMap(map));
    }

    public static Map<String, String> modifyMap (HashMap<String, String> map){
        addNewTopping(map, "potato", "fries");
        addNewTopping(map, "salad", "spinach");
        return map;
    }

    private static void addNewTopping(HashMap<String, String> map, String existingKey, String newKey) {
        if (map.containsKey(existingKey)) {
            //add the new key with the existing key value
            map.put(newKey, map.get(existingKey));
        }
    }

}
