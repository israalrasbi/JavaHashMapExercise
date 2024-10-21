import java.util.HashMap;

public class ToppingShenanigans {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("salad", "oil");
        map.put("potato", "ketchup");
        System.out.println("Map after modifying: "+modifyMap(map));
    }

    public static HashMap<String, String> modifyMap (HashMap<String, String> map){
        //check if key exist
        if(map.containsKey("potato")){
            //add the new element
            map.put("fries", map.get("potato"));
        }
        //check if key exist
        if(map.containsKey("salad")){
            //add the new element
            map.put("spinach",map.get("salad"));
        }
        return map;
    }

}
