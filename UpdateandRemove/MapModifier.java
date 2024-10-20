import java.util.HashMap;

public class MapModifier {
    public static void main(String[] args) {
        HashMap<String, String>map = new HashMap<>();
        map.put("a","aaa");
        map.put("b", "bbb");
        map.put("c","ccc");

        System.out.println("Map after modifying: "+modifyMap(map));

    }

    public static HashMap<String, String> modifyMap (HashMap<String, String> map){
        //check if key a exist in map
        if(map.containsKey("a")){
            //change key b
            map.put("b", map.get("a"));
        }
        //remove key c
        map.remove("c");
        return map;
    }
}
