/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author bradl
 */
public final class ChangeCalculator {
    public static int [] coins = {1, 5, 10,25};
    static int subSol;
    public static int n;
    public static int numCoins;
    
    
    public ChangeCalculator(int change)
    {
        int c = change; 
    }
    //A method which find the min number of coins needed to fill the change order. 
    public static int leastCoins(int coins[], int n, int c)
    {
        int coincount [] = new int [c + 1];
        coincount [0]= 0;
        if (coincount.length == 0)
        {
            throw new IllegalArgumentException("Array of size 0 is not allowed");
        }
        for(int i = 1; i <= c; i++)
        {
            coincount[i] = Integer.MAX_VALUE;
        }
        //Compute the minimum coins required to get change. 
            for(int i = 1; i <= c; i++)
            {
             for( int j = 0; j < n; j++)   
             
                 if (coins[j] <= i)
                 {
                     subSol = coincount[i - coins[j]];
                 }
                     if (subSol != Integer.MAX_VALUE && subSol + 1 < coincount[i])
                         coincount[i] = subSol + 1;
             }
        
        System.out.println("The least number of coins to give change for " + c + " cents is: " + coincount[c]);  
        numCoins = coincount[c];
        return numCoins; 
    }
    public static void populateRef(int [] coins, int nunCoins, int c)
    {
        int Reference [] = new int[100];
        for (int i = 0; i < c; i++)
        {
            
        }
    }
    //A method which gives you the most effiecent combination of coins.
    public static void getChange(int [] coins, int numCoins, int c)
    {
     //While there is still coins to be found. Exivute the code.
        while(numCoins > 0)
              
            for(int j = coins.length-1; j >= 0; --j)
            {
               // One of the test functions in my test class. 
                if (coins[coins.length-1] != 25)
                {
                     throw new IllegalArgumentException("Did Not test Largest Coin First");
                }
                
               if (c % coins[j] >= 0 && c >= coins[j])
               {
                   System.out.println((c/coins[j] + ": " + coins[j]) + " cent coins.");
                   c = c - ((c/coins[j])*(coins[j]));
               }
                 if (c == coins[j])
                 {
               
                   System.out.println(coins[j]);
                   numCoins = 0;
               }
            }
        
    }
    
public static void main(String [] args)
{
    int [] coins = {1,5,10,25};
    ChangeCalculator.leastCoins(coins,coins.length, 88);
    ChangeCalculator.getChange(coins,numCoins,88);
   
 
}
}

