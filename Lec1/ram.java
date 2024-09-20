package Lec1;



public class ram {
    public static void main(String[] args) {

        int arr[]={1,3,-1,-3,5,3,6,7};
        int left=0;
        int right=1;
        int forword=2;
int n=arr.length;
int maxm=0;
        while(n>forword){
            maxm=Math.max(arr[left], arr[right]);
            maxm=Math.max(maxm, arr[forword]);
            int sum=arr[left]+arr[right]+arr[forword];
            left++;
            right++;
            forword++;
                   System.out.println(maxm);



        }
       
    }

    }
