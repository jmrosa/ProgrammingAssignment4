/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg232assignment4;

import java.util.ArrayList;

/**
 *
 * @author jessicarosa
 */
public class Change {
//    public static ArrayList<Integer> minCoin(int[] coins, int amount) {
//        
//        if(coins.length == 0) {
//            throw new IllegalArgumentException("Array of size 0 is not allowed");
//        }
//        
//        int[] a = new int[amount + 1];
//        //int[] c = new int[amount + 1];
//        ArrayList<Integer> values = new ArrayList<Integer>(amount + 1);
//        
//        a[0] = 0;
//        values.add(0);
//        for(int i = 0; i <= amount; i++) {
//            a[i] = Integer.MAX_VALUE;
//        }
//        
//        for(int i = 1; i <= amount; i++) {
//            if(a[i] > 0)
//            for(int j = 0; j < coins.length; j++) {
//                int b = i + values.get(j);
//                if(b <= amount) {
//                    if(a[b] == 0 || a[b] > a[i] + i) {
//                        a[b] = a[i] + 1;
//                        values.set(b, j);
//                        values.add(j);
//                    }
//                }
//            }
//        }
//
//        while(amount > 0) {
//            values.set(a[amount] - 2, coins[values.get(amount)]);
//            amount = amount - coins[values.get(amount)];
//        }
//        for(int i = 0; i < values.size(); i++) {
//            System.out.print(values.get(i) + " ");
//        }
//        System.out.println();
//        return(values);
//    }
//    
    public static ArrayList<Integer> minCoin(int[] coins, int amount) {
        
        if(coins.length == 0) {
            throw new IllegalArgumentException("Array of size 0 is not allowed");
        }
        
               
        int[] a = new int[amount + 1];        
        
        a[0] = 0;
        
        //populates array of size amount with the minimum number of coins needed to create the change
        for(int i = 1; i <= amount; i++) {
            a[i] = Integer.MAX_VALUE;
            for(int j = 0; j < coins.length; j++) {
                    if(i >= coins[j] && i - coins[j] >= 0 && a[i - coins[j]] + 1 < a[i]) {
                        a[i] = a[i - coins[j]] + 1;
                    }
            }
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        int val = coins.length - 1; 
        int check = a[amount];
        boolean X = false; 
        int newamount = amount; 
        int x = 0;
        ArrayList<Integer> denoms = new ArrayList<Integer>(); 
        
        //iterates through possible coin combinations to create change and if the number of coins does not match the number at spot in first array tries new combination
        while(newamount != 0){
            if(newamount >= coins[val])
            {
                 newamount = newamount - coins[val]; 
                 check--; 
                 denoms.add(coins[val]);
            }
            
            if(newamount < coins[val])
            {
                val--;
                
            } 

            if(check < 0)
            {
                check = a[amount];
                newamount = amount; 
                x++; 
                val = coins.length - x;
            }             
        }

        ArrayList<Integer> ans = new ArrayList<Integer>();
 
        for(int i = denoms.size()-1; i >= (denoms.size() - a[amount]); i--) 
        {
            
            //System.out.print(denoms.get(i) + " ");
            ans.add(denoms.get(i));
        }
       

        //System.out.println();
        System.out.println(a[amount]);
        System.out.print(ans);
        System.out.println();
        return(ans);
    }
    
//    public static void main(String args[]) {
//        int array[] = {1, 5, 12, 25};
//        int a = 16;
//        Change.minCoin(array, a);
//    }
    
}
