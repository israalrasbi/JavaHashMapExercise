import java.util.*;

public class StringSwapper {
    public static void main(String[] args) {
        //get the input for the array using getInputArray
        String[] arr = getInputArray();

        //if the array is empty, exit
        if (arr.length == 0) {
            System.out.println("No valid elements were entered");
            return;
        }

        //print the result
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Result: " + Arrays.toString(swapOnMatch(arr)));
    }

    public static String[] swapOnMatch(String[] strings) {
        Map<String, Integer> firstCharIndexMap = new HashMap<>();
        String firstChar = "";
        for (int i = 0; i < strings.length; i++) {
            //get the firstChar of current string
            firstChar = strings[i].substring(0, 1);

            //if the firstChar is not in the firstCharIndexMap, then add it to the firstCharIndexMap with its position
            if (!firstCharIndexMap.containsKey(firstChar)) {
                firstCharIndexMap.put(firstChar, i);
            }
            //check if the firstChar has been seen but not swapped
            else if (firstCharIndexMap.containsKey(firstChar) && firstCharIndexMap.get(firstChar) != strings.length) {
                int position = firstCharIndexMap.get(firstChar);
                //swap
                String temp = strings[position];
                strings[position] = strings[i];
                strings[i] = temp;

                //update the char value to arr.length, indicating it has been swapped
                firstCharIndexMap.put(firstChar, strings.length);
            }
            //if the firstChar has been swapped, then do nothing
            else {
                firstCharIndexMap.put(firstChar, i);
            }
        }
        return strings;
    }

    public static String[] getInputArray() {
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
                System.out.println("Invalid input! Please enter a non-empty string.");
            }
        }
        //convert the list to an array and return it
        return inputList.toArray(new String[0]);
    }
}
