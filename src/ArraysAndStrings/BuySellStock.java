package ArraysAndStrings;

/*
* You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time
* . However, you can buy it then immediately sell it on the same day.
*  [7,1,5,3,6,4]
* i,j single iteration
*  i=0, j=i, input[0] >input[1]
* next iteration i=1, j=2, (1,5 ) input[i]<input[j] : we could buy at i because there is a profit event at j
* profit =[4, 2,5,3]: What is the factor that gets to decide that we should buy at 3 and sell at 6?
* is the problem based on recursion?
*
* */
public class BuySellStock {
}
