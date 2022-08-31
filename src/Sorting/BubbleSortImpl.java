package Sorting;

public class BubbleSortImpl {
    public static void main(String[] args){
        int[] nums = {23,1,20,33,32};
        bubbleSort(nums);
        for(int i : nums){
            System.out.print(i+ " ");
        }
    }

    private static int[] bubbleSort(int[] numArray){
        int temp = 0;
        // The i is just for keeping the count of how many times the loop has to go.
        //if there are 4 elements there would be 3 comparisons for the sort completion.
        for(int i=0; i<numArray.length; i++){
            for(int j=0; j<numArray.length-1; j++){
                //Compare the two immediate numbers
                if(numArray[j] > numArray[j+1]){
                     temp = numArray[j];
                     numArray[j] = numArray[j+1];
                    numArray[j+1] = temp;

                }
            }
        }

        return numArray;
    }
}
