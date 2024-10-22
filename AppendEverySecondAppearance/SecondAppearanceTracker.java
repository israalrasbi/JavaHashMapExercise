import java.util.*;

public class SecondAppearanceTracker {
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
        System.out.println("Result: " + (wordAppend(arr)));

    }

    public static String wordAppend(String[] arr) {
        Map<String, Integer> map = new HashMap<>();
        String result = "";
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            String currenetString = String.valueOf(arr[i]);
            //if the map doesn't contain the key, then add it
            if (!map.containsKey(currenetString)) {
                //this is the first occurrences
                map.put(currenetString, 1);
            }
            //if it already exists, then increase the count
            else {
                count = map.get(currenetString);
                map.put(currenetString, count + 1);
            }
            //check if appears 2nd, 4th, 6th, etc times
            if (map.get(currenetString) % 2 == 0) {
                result += currenetString;
            }
        }
        return result;
    }
}
