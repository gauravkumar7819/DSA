package Revision;

import java.util.Arrays;

public class BestSellToSell {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int n=maximumProfit(arr);
        System.out.println(n);
        int k=0;}
    

            public static int maximumProfit(int[] arr) {
                int n = arr.length;
                int profit = 0;
                int minPrice = arr[0];
        
                for (int i = 1; i < n; ++i) {
                    if (arr[i] < minPrice) {
                        minPrice = arr[i];
                    } else {
                        profit = Math.max(profit, arr[i] - minPrice);
                    }
                }
        
                return profit;
            }
        
        }
