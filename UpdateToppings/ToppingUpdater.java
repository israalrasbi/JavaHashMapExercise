import java.util.HashMap;

public class ToppingUpdater {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ice cream", "peanuts");
        System.out.println("Map after modifying: "+updateTopping(map));
    }

    public static HashMap<String, String> updateTopping (HashMap<String, String> map){
        //check if key exist in map
        if(map.containsKey("ice cream")){
            //change value of ice cream
            map.put("ice cream", "cherry");
        }
        //change value of bread
        map.put("bread", "butter");
        return map;
    }
}
