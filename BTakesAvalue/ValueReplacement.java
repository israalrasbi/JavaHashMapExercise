import java.util.HashMap;

public class ValueReplacement {
    public static void main(String[] args) {
        //create a hash map and add the values 
        HashMap<String, String> map = new HashMap<>();
        map.put("a","candy");
        map.put("b", "dirt");
        map.put("c", "meh");
        System.out.println("Map after modifying: " + replaceValue(map));
    }

    public static HashMap<String, String> replaceValue(HashMap<String, String> map){
        //check if the map has the key
        if(map.containsKey("a")){
            //replace the a and b keys
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }
}
