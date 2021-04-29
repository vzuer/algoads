package cn.vzuer.leetcode;

// 青蛙过河
public class LC_403 {
    public boolean canCross(int[] stones) {
        res = new Boolean[stones.length][stones.length];
        return dfs(stones, 0, 0);
    }

    // 简单暴力 dfs 会超时
    public boolean dfs(int[] stones, int idx, int k) {
        int n = stones.length;
        for (int i = idx + 1; i < n; ++i) {
            int step = stones[i] - stones[idx];
            if (step < k - 1) {
                continue;
            } else if (step > k + 1) {
                break;
            } else {
                if (dfs(stones, i, step) == true) {
                    return true;
                }
            }
        }
        return idx == n - 1;
    }

    // 记忆化 dfs
    // dfs with memorization
    private Boolean[][] res;

    public boolean dfs_with_memo(int[] stones, int idx, int k) {

        if (!res[idx][k]) {
            return false;
        } else {
            res[idx][k] = false; // 只是判断 Boolean 对象是否存在，其值为 true or false 均可
        }
        for (int i = idx + 1; i < stones.length; ++i) {
            int step = stones[i] - stones[idx];
            if (step < k - 1) {
                continue;
            } else if (step > k + 1) {
                break;
            } else {
                if (dfs(stones, i, step)) {
                    return true;
                }
            }
        }
        return idx == stones.length - 1;
    }
}
