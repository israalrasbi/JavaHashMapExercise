import java.util.*;

public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        countCharacterFrequency(str);
    }

    public static void countCharacterFrequency(String str) {
        Map<Character, Integer> vowelsMap = new HashMap<>();
        Map<Character, Integer> consonantsMap = new HashMap<>();
        Set<Character> vowelSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for (int i = 0; i < str.length(); i++) {
            char currentChar = Character.toLowerCase(str.charAt(i));
            //check if the current char is a letter
            if (Character.isAlphabetic(currentChar)) {
                //check if it's vowel
                if (vowelSet.contains(currentChar)) {
                    //check if it's in the vowels map
                    if (!vowelsMap.containsKey(currentChar)) {
                        vowelsMap.put(currentChar, 1);
                    } else {
                        int count = vowelsMap.get(currentChar);
                        vowelsMap.put(currentChar, count + 1);
                    }
                }
                //check if it's constant
                else {
                    if (!consonantsMap.containsKey(currentChar)) {
                        consonantsMap.put(currentChar, 1);
                    } else {
                        int count = consonantsMap.get(currentChar);
                        consonantsMap.put(currentChar, count + 1);
                    }
                }
            }
        }
        //print the result
        printCharacterFrequency(vowelsMap, "Vowels");
        printCharacterFrequency(consonantsMap, "Consonants");

    }

    public static void printCharacterFrequency(Map<Character, Integer> charMap, String label) {
        System.out.println(label + ":");
        List<Character> sortedChars = new ArrayList<>(charMap.keySet());
        Collections.sort(sortedChars);
        for (Character key : sortedChars) {
            System.out.println(key + ": " + charMap.get(key));
        }
    }
}
