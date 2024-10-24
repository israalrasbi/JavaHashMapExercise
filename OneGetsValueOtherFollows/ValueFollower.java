import java.util.HashMap;

public class ValueFollower {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("c", "cake");
        System.out.println("Map before modifying: " + map);
        System.out.println("Map after modifying: " + modifyMap(map));

    }

    public static HashMap<String, String> modifyMap(HashMap<String, String> map) {
        //check if both key exist, if yes return the map
        if (map.containsKey("a") && map.containsKey("b")) {
            return map;
        }
        //check if a exist
        if(map.containsKey("a") && !map.containsKey("b")){
            map.put("b", map.get("a"));
        }
        //check if b exist
        if(map.containsKey("b") && !map.containsKey("a")){
            map.put("a", map.get("b"));
        }

        return map;
    }

}
