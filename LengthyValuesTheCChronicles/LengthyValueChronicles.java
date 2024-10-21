import java.util.HashMap;

public class LengthyValueChronicles {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bb");
        map.put("c", "cake");
        System.out.println("Map after modifying: " + modifyMap(map));

    }

    public static HashMap<String, String> modifyMap(HashMap<String, String> map) {
        //check if keys exist
        if (map.containsKey("a") && map.containsKey("b")) {
            //get the values length
            int valA = map.get("a").length();
            int valB = map.get("b").length();

            //if a is bigger, then assign its value to c
            if(valA > valB){
                map.put("c", map.get("a"));
            }
            //if b is bigger, then assign its value to c
            else if(valB> valA){
                map.put("c", map.get("b"));
            }
            //if both length are the same
            else if (valA == valB) {
                //change a and b
                map.put("a", "");
                map.put("b", "");
            }
        }

        return map;
    }

}
