import java.util.*;

public class MultiplicityChecker {
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
            } else {
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
        System.out.println("Result: " + (wordMultiple(arr)));

    }

    public static Map<String, Boolean> wordMultiple(String[] arr) {
        Map<String, Boolean> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            //get the current string
            String currentString = String.valueOf(arr[i]);
            //if the key doesn't exist in the map, then return false
            if (!map.containsKey(currentString)) {
                map.put(currentString, false);
            }
            //otherwise, return ture
            else {
                map.put(currentString, true);
            }
        }
        return map;
    }
}
