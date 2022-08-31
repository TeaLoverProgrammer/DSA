package Recursion;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args){
        reverseString("en dhu");
    }

    private static void reverseString(String str){
        if(str.length() ==1){
            System.out.print(str);
        }else{//since we are not returning but only printing, we would need a else condition when we are done reversing or length == 1

            System.out.print(str.charAt(str.length()-1));
            reverseString(str.substring(0,str.length()-1));
        }

    }
}
