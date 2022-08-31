package Recursion;

import java.util.ArrayList;

public class PowerSetOfString {

    public static void main(String[] args){
        String myString =  "abc";
        ArrayList<String> result = new ArrayList<>();
        result.add(" ");
        System.out.println(printPowerSet(myString, result));
    }

    private static ArrayList<String> printPowerSet(String inputString, ArrayList<String> result){

        //what could be the simplest input
        if(inputString.length() == 1){
              result.add(inputString);
              return result;
        }

        //base condition 2: inputString is " "
        if (inputString == " ") {
            return result;
        }
       String tset = Character.toString(inputString.charAt(0));
        result.add(tset);
        return printPowerSet(inputString.substring(1), result.);
        return printPowerSet(inputString.substring(1), result);


      /*  System.out.println(inputString.length() +" "+ inputString);
        if(inputString.length() == 1){
            return inputString + " ,\"  \" " ;
        }
        String modifiedInput = inputString.substring(1);
        //consider it with n-1
        System.out.println( "Final return -- >" +inputString + ", " +printPowerSet(modifiedInput));
        return inputString + ", " +printPowerSet(modifiedInput) ;
*/

    }

    //consider if i have only 2 characters
}


