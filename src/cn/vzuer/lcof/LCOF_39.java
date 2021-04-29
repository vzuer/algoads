package cn.vzuer.lcof;

import java.util.Arrays;

public class LCOF_39 {
/*    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = 0, res = -1;
        for (; i < nums.length; ++i) {
            if (nums[j] != nums[i]) {
                if (i - j > nums.length / 2) {
                    res = nums[j];
                    break;
                }
                j = i;
            }
        }
        if (i - j > nums.length / 2) {
            res = nums[j];
        }
        return res;
    }*/

    public int majorityElement(int[] nums) {
        int cnt = 0, res = 0;
        for (int num : nums) {
            if (cnt == 0) {
                res = num;
            }
            cnt += (num == res) ? 1 : -1;
        }
        return res;
    }
}
