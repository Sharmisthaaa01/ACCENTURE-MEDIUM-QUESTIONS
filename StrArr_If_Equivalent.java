
/*
   Check if two string Arrays are equivalent. { String Builder concept}

   Input: word1 = ["ab","c"], word2 = ["a","bc"]
 */

package Mediumprb;

public class StrArr_If_Equivalent {
    public static boolean areStringsEquivalent (String [] word1, String [] word2) {

        //use stringBuilder to concatenate all strings in each array

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        // append each word in word1 to sb1
        for ( String s : word1 ) {
            sb1.append(s);
        }

        // Append each word in word2 to sb2
        for (String s : word2) {
            sb2.append(s);
        }

        // compare the two concatenated strings
        return sb1.toString().contentEquals(sb2);
    }
    public static void main(String[] args) {

        // test the given inputs
        String [] word1 = { "ab", "c" };
        String [] word2 = { "a" , "bc" };

        // call the function to display the result
        boolean result = areStringsEquivalent(word1, word2);

        if (result) {
            System.out.println("Strings are equivalent");
        } else {
            System.out.println("Strings are not equivalent");
        }
    }
}
