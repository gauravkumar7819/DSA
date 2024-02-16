package Revision;

public class FirstIndex {
public static void main(String[] args) {
	int [] arr= {1,2,3,2};
	int target=2;
	
	print(arr,0,target);
}

private static void print(int[] arr, int idx, int target) {
if(arr.length==idx)	{
	
	return;
}

if(arr[idx]==target) {
	
	System.out.println(idx);
	return;
}
print(arr,idx+1,target);
}
}
