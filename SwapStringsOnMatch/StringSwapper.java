import java.util.*;

public class StringSwapper {
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
        System.out.println("Result after swaps: " + Arrays.toString(swapOnMatch(arr)));
    }

    public static String[] swapOnMatch(String[] arr) {
        Map<String, Integer> map = new HashMap<>();
        String firstChar = "";
        for (int i = 0; i < arr.length; i++) {
            //get the firstChar of current string
            firstChar = arr[i].substring(0, 1);

            //if the firstChar is not in the map, then add it to the map with its position
            if (!map.containsKey(firstChar)) {
                map.put(firstChar, i);
            }
            //check if the firstChar has been seen but not swapped
            else if (map.containsKey(firstChar) && map.get(firstChar) != arr.length) {
                int position = map.get(firstChar);
                //swap
                String temp = arr[position];
                arr[position] = arr[i];
                arr[i] = temp;

                //update the char value to arr.length, indicating it has been swapped
                map.put(firstChar, arr.length);
            }
            //if the firstChar has been swapped, then do nothing
            else {
                map.put(firstChar, i);
            }
        }
        return arr;
    }

}
