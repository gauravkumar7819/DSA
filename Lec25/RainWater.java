package Lec25;
public class RainWater {
    public static void main(String[] args) {
        int arr[]={4,2,0,3,2,5};
        int left[]=new int[arr.length];
        int right[]=new int[arr.length];

        left[0]=arr[0];
     
        for (int i = 1; i < right.length; i++) {
            if (arr[i]>left[i-1]) {
            left[i]=arr[i];
                
            }
            else{
                left[i]=left[i-1];
            }
        }
        int n=arr.length;
        right[n-1]=arr[n-1];
        for (int i = n-2; i >=0; i--) {
            if (arr[i]>right[i+1]) {
                right[i]=arr[i];
                
            }
            else{
                right[i]=right[i+1];
            }
            
        }
        int water =0;
        for (int i = 0; i < right.length; i++) {
           water+=Math.min(left[i],right[i])-arr[i];
                
            }
            
        System.out.println(water);


        
    }

}