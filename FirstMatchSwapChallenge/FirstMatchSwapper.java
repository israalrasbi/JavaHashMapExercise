import java.util.Arrays;
import java.util.HashMap;

public class FirstMatchSwapper {
    public static void main(String[] args) {
        String[] arr1 = {"ab", "ac"};
        String[] arr2 = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[] arr3 = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};

        //print result
        System.out.println("Result of first array: " + Arrays.toString(firstSwap(arr1)));
        System.out.println("Result of second array: " + Arrays.toString(firstSwap(arr2)));
        System.out.println("Result of third array: " + Arrays.toString(firstSwap(arr3)));
    }

    public static String[] firstSwap(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            //get the first char from the current string
            String currentString = String.valueOf(arr[i].substring(0, 1));
            if (map.containsKey(currentString)) {
                int firstChar = map.get(currentString);
                //if the value is -1, then the swap already happened, so skip it
                if (firstChar == -1) {
                    continue;
                }
                int position = map.get(currentString);
                //swap
                String temp = arr[position];
                arr[position] = arr[i];
                arr[i] = temp;
                //update the char value to -1, indicating it has been swapped
                map.put(currentString, -1);
            } else {
                map.put(currentString, i);
            }
        }
        return arr;
    }
}
