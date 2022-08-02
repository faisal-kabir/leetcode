import java.util.*;
import java.util.stream.IntStream;

public class Find_Pivot_Index_724 {
    public static void main(String args[]) {
        System.out.println(pivotIndex(new int[] { 2, 1, -1 }));
    }

    public static int pivotIndex(int[] nums) {
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
