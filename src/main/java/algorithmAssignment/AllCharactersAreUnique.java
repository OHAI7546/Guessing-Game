package algorithmAssignment;

import java.util.HashSet;

public class AllCharactersAreUnique {

//    Write a program to determine if a string contains all unique characters. Return true if it does and false otherwise.
//
//    The string may contain any of the 128 ASCII characters.
//
//    Specification
//        Challenge.hasUniqueChars(s)
//    Parameters
//    s: String - The string that may or may not contain all unique characters
//
//    Return Value
//    boolean - True if all characters in the string are unique
//
//            Examples
//    s   Return Value
////        "abcdefg"   true
//                "abbcdefg"  false


        public static void main(String[] args) {// test your code here
            System.out.println(hasUniqueChars("abcdefg"));
        }

        /**
    1. import HashSet from the java.util package, which allows us to store unique characters.
    2. The hasUniqueChars method takes a string str as input and returns a boolean indicating whether all characters are unique.
    3. create a HashSet<Character> called seenCharacters to keep track of characters encountered.
    4. convert the string to a character array and iterate through each character:
    If the character is already in the set, we return false, indicating a duplicate.
    If not, we add the character to the set.
    5. if the loop finishes without finding duplicates, return true.
         */

        public static boolean hasUniqueChars(String str) {
            HashSet<Character> seenCharacters = new HashSet<>();

            for (char c : str.toCharArray()) {
                if (seenCharacters.contains(c)) {
                    return false;
                }
                seenCharacters.add(c);
            }

            return true;
        }



}
