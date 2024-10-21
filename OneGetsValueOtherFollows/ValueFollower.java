import java.util.HashMap;

public class ValueFollower {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "cake");
        System.out.println("Map after modifying: " + modifyMap(map));

    }

    public static HashMap<String, String> modifyMap(HashMap<String, String> map) {
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
