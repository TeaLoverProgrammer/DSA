import java.util.HashSet;

public class FindCommonFruit{

    public static void main(String[] args){
        //fruits= ["apple","banana","papaya"]
        //seasonalFruit = ["papaya"]
        //returns true

        //fruits= ["apple","banana","papaya"]
        //seasonalFruit = ["gauva"]
        //returns false

        String[] fruits = {"apple","","papaya"};
        String[] seasonalFruits = {""};


       if(findCommonFruit(fruits, seasonalFruits)){
           System.out.println("Found!");
       }else{
           System.out.println("Not present");
       }

    }

    public static  boolean findCommonFruit(String[] fruits, String[] seasonalFruits){
        //brute force solution: two nested loops.
        for(int i=0; i < fruits.length; i++){
            for(int j=0; j<seasonalFruits.length; j++){

                if(fruits[i] == seasonalFruits[j]){
                    return true;
                }
            }
        }
        return false;
    }
    /**
     public boolean findCommonFruit2(String[] fruits, String[] seasonalFruits){
     //Array of boolean values. if the inputs were char , we could assign an index for each char and assign it's value as true in the checklistOfFruits. But
     //since we have String, this approach wouldn't work.
     boolean[] checkListForFruits = new boolean[fruits.length];

     }
     **/
//hashset
    public static boolean findCommonFruit3(String[] fruits, String[] seasonalFruits){
        //Loop through fruits. Assign the fruits to a HashSet.
        HashSet<String> fruitsCheckList= new HashSet<>();
        for(String fruit: fruits){
            if(!fruitsCheckList.contains(fruit)){
                fruitsCheckList.add(fruit);
            }
        }

        //Loop through the second fruit list and check any of the fruit is in the hashset.
        for(String fruit: seasonalFruits){
            if(fruitsCheckList.contains(fruit)){
                return true;
            }
        }
        return false;
    }


}