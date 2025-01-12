// leetcode 1
import java.util.HashMap;
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int number = nums[i];
            int moreNeeded = target - number;
            if (mpp.containsKey(moreNeeded)) {
                ans[0] = mpp.get(moreNeeded);
                ans[1] = i;
                return ans;
            }
            mpp.put(nums[i], i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] ans = twoSum(arr, target);
        for (int element: ans) {
            System.out.print(element + " ");
        }
    }
}
