import java.util.*;

public class Find_The_Middle_Index_in_Array_1991 {
    public static void main(String args[]) {
        System.out.println(findMiddleIndex(new int[] { 2, 5 }));
    }

    public static int findMiddleIndex(int[] nums) {
        int index = -1;

        int last = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = Arrays.stream(nums, i + 1, nums.length).sum();

            if (count == last) {
                index = i;
                break;
            }

            last += nums[i];
        }

        return index;
    }
}