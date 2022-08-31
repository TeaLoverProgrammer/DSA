package Recursion;

//Given a number N return the index value of the Fibanocci sequence, where the sequence is
//0,1,1,2,3,5,8,13,21,..

import java.util.ArrayList;

public class Fibanocci {

   public static void main(String[] args){
       System.out.println("Recursive: "+fibanocciRecursive(7));
       System.out.println("Iterative: "+fibanocciIterative(7));

       // better approach
       System.out.println("Better approach recursive: "+ betterRecursionFibanocci(7));//Exponential time O(2^n)
       //better approach for iteration
       System.out.println("Better approach for iteration: "+ betterIterationFibanocci(7));//O(n)
   }

   private static int betterIterationFibanocci(int n){
       ArrayList<Integer> fibanocciSeries = new ArrayList<>();
       fibanocciSeries.add(0);
       fibanocciSeries.add(1);
       if(n <2){
           return fibanocciSeries.get(n);
       }
       int counter = 1;
       while(n != counter){
           counter++;
           fibanocciSeries.add(fibanocciSeries.get(counter-1)+fibanocciSeries.get(counter-2));
       }
       return fibanocciSeries.get(n);
   }
   // 0(n:0),1(n:1),1(n:2),2(n:3),3(n:4),5(n:5),8(n:6)
   private static int betterRecursionFibanocci(int n){
       if(n < 2){
           //if n = 0, return 0
           //if n=1, return 1
           //for n=2, the result should be 1 not 2. therefore it won't work.
           return n;
       }
       return betterRecursionFibanocci(n-1)+betterRecursionFibanocci(n-2);
   }


   private static int index = 2;
   private static int first = 0;
   private static int second = 1;

   private static int fibanocciRecursive(int n){
       if(n == 0){
           return first;
       }
       if(n ==1){
           return second;
       }
       if(n == index ){
           return first + second;
       }
       int temp = first;
       first = second;
       second = first + temp;
       index ++;
       return fibanocciRecursive(n);

   }

   private static int fibanocciIterative(int n){
       int first = 0;
       int second = 1;
       int index = 2;
       int temp = 0;
       if(n == 0){
           return first;
       }
       if(n==1){
           return second;
       }
       if(n == 2){
           return first + second;
       }

       while(n != index){
           temp = first;
           first = second;
           second = first + temp;
           index++;
       }

       return first+second;

   }
}
