package Revision;

import java.util.Arrays;

public class Frequency {

public static void main(String[] args) {
    int[] arr={1,2,1,3,3,3,};
System.out.println(    majorityElement(arr));
}
    public static int majorityElement(int[] nums) {
    Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int n = nums.length;
        return nums[n/2];
    }
}