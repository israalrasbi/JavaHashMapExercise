import java.util.*;

public class FirstCharacterStringGrouper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> inputList = new ArrayList<>();
        String input;
        System.out.println("Enter the elements of the array, when finish enter -q: ");
        //take user input
        input = sc.nextLine();
        //keep looping until the user enter -q
        while (!input.equalsIgnoreCase("-q")) {
            //check if the string is empty
            if (!input.trim().isEmpty()) {
                inputList.add(input);
            }
            else {
                System.out.println("Invalid input! please enter a non-empty string.");
            }
            //ask for the next input
            input = sc.nextLine();
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
        System.out.println("Result: " + (groupFirstChar(arr)));
    }
    public static Map<String, String> groupFirstChar(String[] arr) {
        Map<String,String>map = new HashMap<>();
        for (String currentString : arr) {
            //get the firstChar which is the key
            String firstChar = currentString.substring(0, 1);
            //if the key doesn't exist then add it to the map
            if (!map.containsKey(firstChar)) {
                map.put(firstChar, currentString);
            }
            //if the key already exist, then concat the value and add it to the key
            else {
                String value = map.get(firstChar) + currentString;
                map.put(firstChar,value );
            }
        }
        return map;
    }

}
