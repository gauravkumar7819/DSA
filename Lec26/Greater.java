package Lec26;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Greater {
    public static void main(String[] args) {
        int arr[]={1,3,2,10,4,5};
        int num[]=new int[arr.length];
        int k=0;
    List<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){

                    // num[k]=arr[j];
                    list.add(arr[j]);
                    k++;
                     
break;
                }
                else if (arr[i]<arr[j]) {
                    list.add(-1);
                    break;
                }
                break;
                // else{
                //     num[k]=-1;
                //     k++;
                // }
               
            }
        }
        System.out.println(list);
    }
}
