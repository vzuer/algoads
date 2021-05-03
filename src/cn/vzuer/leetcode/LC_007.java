package cn.vzuer.leetcode;

public class LC_007 {
    public int reverse(int x) {
        boolean isPositive = true;
        if (x < 0) {
            isPositive = false;
        }
        int res = 0;
        while (x != 0) {
            if (isPositive) {
                if (res < 214748364 || (res == 214748364 && x % 10 <= 7)) {
                    res = res * 10 + (x % 10);
                } else {
                    return 0;
                }
            } else {
                if (res > -214748364 || (res == -214748364 && x % -10 >= -8)) {
                    res = res * 10 + (x % 10);
                } else {
                    return 0;
                }
            }
            x /= 10;
        }
        return res;
    }
}
