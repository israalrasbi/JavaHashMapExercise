import java.util.*;

public class WordCounter {
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
        System.out.println("Result: " + countWords(arr));
    }

    public static Map<String,Integer> countWords(String[] arr){
        Map<String,Integer>map = new HashMap<>();
        for (String s : arr){
            //if the map doesn't contain the key, then add it, and the number of occurrences is 1
            if(!map.containsKey(s)){
                map.put(s, 1);
            }
            //otherwise, update the value
            else {
                int count = map.get(s);
                map.put(s, count+1);
            }
        }
        return map;
    }


}
