package Recursion;

public class Factorial {

    public static void main(String[] args){

        System.out.println("Recursive approach: "+findFactorialRecursive(5));
        System.out.println("Iterative approach: "+ findFactorialIterative(5));
    }
  // The recursive case has time complexity of O(n) since we are calling the function n times.
    private static int findFactorialRecursive(int number){
        //base case
        if(number == 1){
            return 1;
        }

        return number * findFactorialRecursive(number-1);
    }
// the iterative approach also has O(n) complexity
    private static int findFactorialIterative(int number){
        int result = 1;
        while(number > 1){
            result = result * number;
            number--;
        }
        return result;
    }
}
