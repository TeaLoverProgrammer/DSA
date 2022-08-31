package ArraysAndStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

//nums1: [1,2,2,3]
//nums2: [1,1,3]  output: [1,3]
public class M1_E_1_IntersectionOfArrays {

    public static void main(String[] args){
        //how could we do it using for loop? we would need an additional O(n) Space complexity to keep track of the indexes visited in nums2

        //other approach
        //insert nums1 into a hashMap k->  number v->no of repeats
        //take out numbers from the map as it appears in num2 array.

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,1,2}; //expected output: {1,2,2} in any order

       Integer[] response =  findIntersectionOfArrays(nums1, nums2);

       for(Integer n : response){
           System.out.print( n+" ");
       }


    }

    private static Integer[] findIntersectionOfArrays(int[] nums1, int[] nums2){

         HashMap<Integer, Integer> numberCountMap = new HashMap<>();
         Integer INITIAL_COUNT =1;
         ArrayList<Integer> listIntersection = new ArrayList<>();

        for(int num : nums1){
            if(numberCountMap.containsKey(num)){
                numberCountMap.put(num, numberCountMap.get(num)+1);
            }else{
                numberCountMap.put(num, INITIAL_COUNT);
            }
        }

        for(int num: nums2){
            if(Objects.nonNull(numberCountMap.get(num)) && numberCountMap.get(num) != 0){
                listIntersection.add(num);
                numberCountMap.put(num, numberCountMap.get(num)-1);
            }
        }

        Integer[]  arrayIntersection = new Integer[listIntersection.size()];
        arrayIntersection = listIntersection.toArray(arrayIntersection);

        return arrayIntersection;
    }
}
