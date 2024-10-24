import java.util.*;

public class DuplicatesFinder {
    public static void main(String[] args) {
        //get the input for the array using getInputArray
        int[] arr = getInputArray();

        //if the array is empty, exit
        if (arr.length == 0) {
            System.out.println("No valid elements were entered");
            return;
        }

        //print the result
        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) {
        Map<Integer, Integer> numOfOccurrencesMap = new HashMap<>();
        Map<Integer, List<Integer>> positionMap = new HashMap<>();
        Set<Integer> distinctElementSet = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int currentNum = arr[i];
            //check how many times it the number occurred
            if (!numOfOccurrencesMap.containsKey(currentNum)) {
                numOfOccurrencesMap.put(currentNum, 1);
            }
            else {
                int count = numOfOccurrencesMap.get(currentNum);
                numOfOccurrencesMap.put(currentNum, count + 1);
            }

            //track the position
            //if key position is not in the map, then add it
            if (!positionMap.containsKey(currentNum)) {
                positionMap.put(currentNum, new ArrayList<>());
            }
            //get the list of positions for the current number
            positionMap.get(currentNum).add(i);
        }
        //iterate through the numOfOccurrencesMap
        for (Map.Entry<Integer, Integer> number : numOfOccurrencesMap.entrySet()) {
            int key = number.getKey();
            int value = number.getValue();

            //only include the values occurred more than 1
            if (value > 1) {
                System.out.println(key + ": Occurs " + value + " times at positions " + positionMap.get(key));
                //added to distinctElementSet to be used for calculation later
                distinctElementSet.add(key);
            }
        }
        //calculate the sum
        int sum = 0;
        for (int duplicate: distinctElementSet){
            sum += duplicate;
        }
        System.out.println("Sum of distinct duplicate numbers: " + sum);
    }

    public static int[] getInputArray() {
        Scanner sc = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<>();
        String input = ""; // initialize the input variable
        System.out.println("Enter the elements of the array (integers), when finished enter -q:");

        //keep looping until the user enters -q
        while (!input.equalsIgnoreCase("-q")) {
            input = sc.nextLine();

            //if not empty, and not -q, then add the elements to the list
            if (!input.trim().isEmpty() && !input.equalsIgnoreCase("-q")) {
                try {
                    int num = Integer.parseInt(input);  // convert string to integer
                    inputList.add(num);  // add the integer to the list
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a valid integer.");
                }
            } else if (input.trim().isEmpty()) {
                System.out.println("Invalid input! Please enter a non-empty string.");
            }
        }

        //convert the list to an int array
        int[] arr = new int[inputList.size()];
        for (int i = 0; i < inputList.size(); i++) {
            arr[i] = inputList.get(i);
        }
        return arr;
    }


}
