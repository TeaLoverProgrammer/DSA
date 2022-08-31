//Reverse a String

import java.util.Objects;

public class GoogleInterview_pairWithSum{

    public static void main(String[] args){
        String stringToReverse = "my name is Indu";
        System.out.println(reverseString_2(stringToReverse));
    }

    private static String reverseString(String stringToReverse){

        /**
         *bruteforce: Convert String to charArray. Parse through the array in reverse direction and store the value to another charArray. Convert Char array to String and return.
         *Time complexity would be O(n) since we need to go through every element during parsing.  O(n) space complexity because we are saving it to a new location during each parsing.
         *Anotherapproach: We could return it without saving to a temporary charArray.
         **/


        char[] charArrOfString = stringToReverse.toCharArray();
        char[] tempArr = new char[charArrOfString.length]; //O(1) spaceComplexity?
        int index=0;

        /**
         * "name" -> ['n', 'a', 'm', 'e']
         * what are the data structures with constant write and read?
         **/

        for(int i = charArrOfString.length - 1; i>=0; i--){ //O(n) time complexity
            tempArr[index] = charArrOfString[i]; //O(n) space complexity. additional n memory are taken up by n number of inputs
            index++; //O(1) space complexity
        }
        return  new String(tempArr);
    }

    /**
     * Is there is any way to reverse the whole String without going through all the elements? -> No. So time complexity will be O(n)
     * Array: read O(1)
     * How can i reverse without temporary memory?
     * What should be my thought process?
     **/



    //approach2:  ['n', 'a', 'm', 'e'], lastIndex = 3 , firstIndex =0 ,   char tempLocation = str[firstIndex]   str[fristIndex] = str[LastIndex]  str[lastIndex] = temLocation;
   // parse through the half of the array. Swap elements till half of the char array is reached.
    public static String reverseString_2(String stringToReverse){

        if (Objects.isNull(stringToReverse)) {
            return new String();
        }
        char[] charArrayOfString = stringToReverse.toCharArray();
        char tempChar = ' ';
        for(int i =0; i< (charArrayOfString.length)/2 ; i++){
            tempChar = charArrayOfString[i];
            charArrayOfString[i] = charArrayOfString[charArrayOfString.length-1-i];
            charArrayOfString[charArrayOfString.length-1-i] = tempChar;
        }

        return new String(charArrayOfString);

    }
}
