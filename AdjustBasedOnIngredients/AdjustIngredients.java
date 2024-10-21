import java.util.HashMap;

public class AdjustIngredients {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("spinach", "dirt");
        map.put("ice cream", "cherry");
        System.out.println("Map before modifying: " + map);
        System.out.println("Map after modifying: "+modifyMap(map));

    }

    public static HashMap<String, String> modifyMap (HashMap<String, String> map){
        //check if ice cream exist
        if(map.containsKey("ice cream")){
            //add the new element
            map.put("yogurt", map.get("ice cream"));
        }
        //check if spinach exist
        if(map.containsKey("spinach")){
            map.put("spinach", "nuts");
        }
        return map;
    }

}
