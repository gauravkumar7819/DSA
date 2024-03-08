package Lec12;


import java.util.*;
public class ToweOfHanoi {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();  
                                move(N, 'A', 'B', 'C'); 
                                    }
                                    public static void move(int n, char from, char to, char helper) {
                                        if (n == 0) return; 
                                                move(n-1, from, helper, to); 
                                                        System.out.println("Moving ring " + n + " from " + from + " to " + to); 
                                                                move(n-1, helper, to, from);
                                        
                                                                            
                                                                            
    }
}
