package Lec9;

import java.util.*;

public class SplitArray {

    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }
        splitEqualGroups(nums, 0, new ArrayList<>(), new ArrayList<>());
        System.out.println("Total ways: " + count);
    }

    static void splitEqualGroups(int[] nums, int index, List<Integer> group1, List<Integer> group2) {
        if (index == nums.length) {
            int sum1 = group1.stream().mapToInt(Integer::intValue).sum();
            int sum2 = group2.stream().mapToInt(Integer::intValue).sum();
            if (sum1 == sum2) {
                System.out.print(String.join(" ", group1.toString()) + " and " + String.join(" ", group2.toString()) + "\n");
                count++;
            }
            return;
        }

        // Add nums[index] to group1 and recurse
        group1.add(nums[index]);
        splitEqualGroups(nums, index + 1, group1, group2);
        group1.remove(group1.size() - 1);

        // Add nums[index] to group2 and recurse
        group2.add(nums[index]);
        splitEqualGroups(nums, index + 1, group1, group2);
        group2.remove(group2.size() - 1);
    }
}
