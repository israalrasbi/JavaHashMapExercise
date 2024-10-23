import java.util.*;

public class FirstLastCharMatcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> inputList = new ArrayList<>();
        String input = ""; //initialize the input variable
        System.out.println("Enter the elements of the array, when finished enter -q: ");

        //keep looping until the user enter -q
        while (!input.equalsIgnoreCase("-q")) {
            //take uer input
            input = sc.nextLine();

            //if not empty, and not -q, then add the elements to the list
            if (!input.trim().isEmpty() && !input.equalsIgnoreCase("-q")) {
                inputList.add(input);
            }
            else if (input.trim().isEmpty()) {
                System.out.println("Invalid input! please enter a non-empty string.");
            }
        }

        //convert the list to an array
        String[] arr = inputList.toArray(new String[0]);

        //if the array is empty, print a message and exit
        if (arr.length == 0) {
            System.out.println("No valid elements were entered.");
            return;
        }

        //print the result
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Result: " + matchChar(arr));
    }


    public static Map<String, String> matchChar(String[] arr){
        Map<String, String>map = new HashMap<>();
        for(String s: arr){
            //get the key which is the firstChar, and the value which is the last char
            String key = s.substring(0,1);
            String value = s.substring(s.length()-1);
            //add to map
            map.put(key,value);
        }
        return map;
    }
}
