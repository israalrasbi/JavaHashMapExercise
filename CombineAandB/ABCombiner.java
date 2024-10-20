import java.util.HashMap;

public class ABCombiner {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a","Hi");
        map.put("b", "There");

        System.out.println("Map after modifying: "+combine(map));

    }

    public static HashMap<String, String> combine (HashMap<String, String> map){
        //check if key exists
        if(map.containsKey("a") && map.containsKey("b")){
            //create a new key
            map.put("ab", map.get("a")+map.get("b"));
        }
        return map;
    }
}
