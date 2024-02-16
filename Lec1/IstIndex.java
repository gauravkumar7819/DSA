package Lec1;

public class IstIndex {

	
	public static void main(String[] args) {
		
		int target=3;
		int arr[]= {1,2,3,2,3};
		int idx=arr.length-1;
		System.out.println(first(arr,target,idx));
		
	}

	private static int  first(int[] arr, int target ,int idx) {
		
		if(idx==arr.length) {
			
			return -1;
		}
		if(arr[idx] ==target) {
			
			return idx;
		}
		
	return first(arr,target,idx-1);
		
	}

	

}
