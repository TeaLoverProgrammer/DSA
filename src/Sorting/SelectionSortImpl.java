package Sorting;

public class SelectionSortImpl {
    public static void main(String[] args){
        int[] nums = {26, 20, 5, 1,0};
        selectionSort(nums);
        for(int i: nums){
            System.out.print(i +" ");
        }
    }

    private static int[] selectionSort(int[] nums){

        int smallest, temp;
        int index = -1;
        for(int i=0; i<nums.length; i++){
            smallest = nums[i]; // or just use the index. smallest variable not required.  We could access it with the index.
            index = i; // setting the index to the current position.
            for(int j=i; j<nums.length-1; j++){

                if(smallest > nums[j+1]){
                    smallest =  nums[j+1];
                    index = j+1; // not clearing up index from the previous swap!
                }

            }
            temp = nums[i];
            nums[i] = smallest;
            nums[index] = temp;

        }

        return nums;
    }
}
