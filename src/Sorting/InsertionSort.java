package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort {
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(19);
        nums.add(1);
        nums.add(0);
        List<Integer> result = insertionSort(nums);
        for(int i: result){
            System.out.print(i+" ");
        }
    }
    private static List<Integer> insertionSort(List<Integer> nums){

        for(int i=1; i<nums.size(); i++){
           compareToSortedAndPlace(nums, i);
        }
        return nums;
    }

    private static void compareToSortedAndPlace(List<Integer> nums, int index){
        for(int i=0; i<index; i++){
         /*   figure out where the number should go */
            if ( nums.get(i) > nums.get(index)) {
                int temp = nums.get(index);
                nums.remove(index);
                nums.add(i,temp);
                return;
            }
        }
    }
}
