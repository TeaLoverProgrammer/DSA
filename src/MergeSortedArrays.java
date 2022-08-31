import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] numbers = {4};
        System.out.println(singleNumber(numbers));

    }

    public Object[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> result = new ArrayList<>();

        if(nums1 == null || nums2 == null){
            return null;
        }
        if(nums1.length == 0 || nums2.length == 0){
            return null;
        }

        boolean[] visitedNodes = new boolean[nums2.length];

        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if((nums1[i] == nums2[j]) && !visitedNodes[j]){
                    result.add(nums1[i]);
                    visitedNodes[j] = true;
                }
            }
        }

        return result.toArray(new Integer[result.size()]);

    }
        public static int singleNumber(int[] nums) {

            //brute force?
            //For each element run through the array to find the count. If count is 1 stop the iteration and return.

            ArrayList<Integer> result = new ArrayList<>();
            result.toArray();

            HashMap<Integer,Integer> numberCountMap = new HashMap<Integer,Integer>();

            for(int num : nums){
                if(numberCountMap.containsKey(num)){
                    numberCountMap.put(num, 2);
                }else{
                    numberCountMap.put(num,1);
                }

            }

            numberCountMap.forEach((k,v) ->{
                if(v == 1){
                    final int oddOne = k;
                }
            });

            return 0;
        }

}
