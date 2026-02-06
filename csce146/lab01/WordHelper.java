/* 
 * code by Cayden Barnett
 */

public class WordHelper {
   public static String[] sortByVowels(String[] words) {
      // init a new array with 2 rows
      int[][] intermediate = new int[2][words.length];
      // going through each string in the words array 
      // checking each letter in that string to see if a vowel 
      // adding to a number if yes 
      // adding that number to the above array in row 1 
      // putting the index to that word in the above array in row 2
      for (int i = 0; i < words.length; i++) {
         int number = 0;
         for (char c : words[i].toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
               number++;
            }
         }
         intermediate[0][i] = number;
         intermediate[1][i] = i;
      }
      // passing to a function to sort
      int[][] intermediateSorted = bubbleSort(intermediate);

      // assigning each word in words to a spot in the final array 
      // based on the sorted intermediate list
      String[] finalArr = new String[words.length];
      for (int i = 0; i < intermediate[0].length; i++) {
         finalArr[i] = words[intermediateSorted[1][i]];
      }
      // return the final array
      return finalArr;
   }

   public static String[] sortByConsonants(String[] words) {
      // all of this is the same as the vowel one 
      // just switched to NOT and AND instead of equals and OR
      int[][] intermediate = new int[2][words.length];
      for (int i = 0; i < words.length; i++) {
         int number = 0;
         for (char c : words[i].toCharArray()) {
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'y') {
               number++;
            }
         }
         intermediate[0][i] = number;
         intermediate[1][i] = i;
      }
      int[][] intermediateSorted = bubbleSort(intermediate);

      String[] finalArr = new String[words.length];
      for (int i = 0; i < intermediate[0].length; i++) {
         finalArr[i] = words[intermediateSorted[1][i]];
      }
      return finalArr;
   }

   public static String[] sortByLength(String[] words) {
      // mostly the same as the other 2 
      // just skipping iterating through each letter 
      // and adding the length as the number
      int[][] intermediate = new int[2][words.length];
      for (int i = 0; i < words.length; i++) {
         int number = words[i].length();
         intermediate[0][i] = number;
         intermediate[1][i] = i;
      }
      int[][] intermediateSorted = bubbleSort(intermediate);

      String[] finalArr = new String[words.length];
      for (int i = 0; i < intermediate[0].length; i++) {
         finalArr[i] = words[intermediateSorted[1][i]];
      }
      return finalArr;
   }

   public static int[][] bubbleSort(int[][] arr) {
      // simple bubble sorting algorithm, except sorting 
      // a 2 row array only by row 1, keeping row 2 intact 
      // since that row is the index to the word
      Boolean swapped;
      do {
         swapped = false;
         for (int i = 0; i < arr[0].length - 1; i++) {
            if (arr[0][i] > arr[0][i + 1]) {
               int temp = arr[0][i];
               int temp2 = arr[1][i];
               arr[0][i] = arr[0][i + 1];
               arr[0][i + 1] = temp;
               arr[1][i] = arr[1][i + 1];
               arr[1][i + 1] = temp2;
               swapped = true;
            }
         }
      } while (swapped);
      return arr;
   }
}
