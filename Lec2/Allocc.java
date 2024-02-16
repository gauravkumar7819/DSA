package Lec2;


public class Allocc {
public static void main(String[] args) {
	
	
//	int target=3;
//	int arr[]= {1,2,3,2,3,3};
//	int idx=0;
//	int count=0;
//
//int ans[]=first(arr,target,idx,count);
//System.out.println(Arrays.toString(ans));
//}
//
//private static int [] first(int[] arr, int target ,int idx ,int count) {
//
//	
//	if(idx==arr.length) {
//		System.out.println(count);
//		return new int[count];
//	}
//	
//	if(arr[idx] ==target) {
//		
//	
//	count++;
//	}
//	
// int []ans=first(arr,target,idx+1,count);
// 
// if(arr[idx]==target)
// {
//	 
//	 
//	 ans[count-1]=idx;
//	 
// }
// return ans;
//}
//	
	
//}
	int idx=0;
	int target=2;
	int arr[]= {1,2,3,4,3,2,2};
	
	int count =0;
	allFind(idx,target,arr,count);
	
	
}

private static void allFind(int idx, int target, int[] arr, int count) {
	if(arr.length==idx) {
		
		return;
	}
	if(arr[idx]==target) {
		
		count++;
		System.out.println(idx);
	}
	allFind(idx+1,target,arr,count);
	
	
}}
