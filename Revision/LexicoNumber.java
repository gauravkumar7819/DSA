
package Revision;

import java.util.ArrayList;
import java.util.List;

public class LexicoNumber {
    public static void main(String[] args) {
        int n=16;
        List<Integer> list=new ArrayList<>();
        print(n,0,list);
        System.out.println(list);
    }

    private static void print(int n, int i, List<Integer> list) {
        if (i>n) {
            return;
        }
        if(i>0){
            list.add(i);
            
        }
       int j=0;
       if(j==0){

        j=0;
       }
        
        for ( j = 1; j <=9; j++) {
            print(n, i*10+j, list);
        }
    }
    
}
