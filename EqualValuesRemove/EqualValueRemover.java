import java.util.HashMap;

public class EqualValueRemover {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "aaa");
        map.put("c", "cake");
        System.out.println("Map after modifying: "+removeValue(map));

    }

    public static HashMap<String, String> removeValue(HashMap<String, String> map){
        //check if a and b exist in the map
        if(map.containsKey("a") && map.containsKey("b")){
            //get values of a and b
            String valA = map.get("a");
            String valB = map.get("b");
            //check if equal
            if(valA.equals(valB)){
                //remove keys
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }

}
