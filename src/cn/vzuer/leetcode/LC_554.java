package cn.vzuer.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC_554 {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < wall.size(); ++i) {
            int sum = 0;
            List<Integer> row = wall.get(i);
            for (int j = 0; j < row.size() - 1; ++j) {
                sum += row.get(j);
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        int cnt = 0;
        for (Integer key : map.keySet()) {
            cnt = Math.max(cnt, map.get(key));
        }
        return wall.size() - cnt;
    }
}