package HashMap;

//Given an array = [2,5,1,2,4,5] output: 2
//input:[2,5,5,2,4,5] output: 5   // The typical nested forloop would give us 2 as output since first i=2 and j=2 during iteration.
//input:[1,1,2,2]  output: 1
//input: [2,3,4,5]  output: undefined

//key points: unsorted, can we have null or special characters, -ve numbers?
//inputs and outputs example
//are we trying to optimize space or time?
//brute force -> find drawback -> think how to rectify the drawback.
//Remove any repetition, O(n2), or unnecessary code. Break big logic into small parts.
//Understand what you are going to code and how things are going to workout  before you code.
//think about how you could break your code. Think about error checks.  Assume people are trying to break your code.
//Comment in the code and the checks you want to do.
//Use sensible names.
//Test your code with sample input, null, no params, async code.

import java.util.HashSet;
import java.util.Objects;

public class FirstRepeatingNumber {

    public static void main(String[] args){

        int[] input = {2,5,5,1,1,2,4,5};


        findRepeatedElement(input);
        findRepeatedElement2(input);

        //brute force: two nested for loop.  O(n^2)
        //second approach: iterate through the input and insert the elements into a hashset. As we insert if the element is in the hashset then return that element.
    }

    private static void findRepeatedElement2(int[] inputs){

        int firstRecurringIntSpan = Integer.MAX_VALUE;
        int firstRecurringInt = -1;
        int spanCount = 0;

        for(int i=0; i<inputs.length; i++){
            for(int j=i+1; j<inputs.length; j++){
                spanCount++;
                if(inputs[i] == inputs[j]){
                    if(spanCount < firstRecurringIntSpan){
                        firstRecurringInt = inputs[i];
                        firstRecurringIntSpan = spanCount;
                        System.out.println("Iteration -> firstRecurringInt :"+ firstRecurringInt
                                +" firstRecurringIntSpan :"+firstRecurringIntSpan);
                    }
                    break;

                }
            }
            spanCount = 0;
        }

        System.out.println("Response from second method : "+firstRecurringInt );
    }

    private static void findRepeatedElement(int[] inputs){

        //input validation
        if(inputs.length == 0 || Objects.isNull(inputs)){
            System.out.println("Please provide a valid input");
        }
        HashSet<Integer> inputSet = new HashSet<>();
        for(int i=0; i<inputs.length; i++){
            if( inputSet.contains(inputs[i]) ){
                System.out.println(inputs[i]) ;
                break;
            }
            inputSet.add(inputs[i]);
        }


    }

}
