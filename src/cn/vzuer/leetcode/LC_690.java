package cn.vzuer.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC_690 {
    // Definition for Employee.
    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }

    //    输入：[[1, 5, [2, 3]], [2, 3, []], [3, 3, []]], 1
//    输出：11
/*
    根据输入的 id 如果能快速的找到该员工，进而就可以得到他的直接下属的 id 这样就可重复下去，也就是深度优先搜索
    所以现在问题的关键是 如何将 id 和 id 所对应的员工这个数据结构 给对应起来，又因为 id 是唯一的
    所以我们可以用 哈希表 来建立两者之间的映射关系 <key = id, value = 员工类>, 并可以实现快速查找
 */
    class Solution {
        private Map<Integer, Employee> map = new HashMap<>();

        public int getImportance(List<Employee> employees, int id) {
            for (Employee worker : employees) {
                map.put(worker.id, worker);
            }
            return dfs(id);
        }

        private int dfs(int id) {
            Employee worker = map.get(id);
            int total = worker.importance;
            for (int subId : worker.subordinates) {
                total += dfs(subId);
            }
            return total;
        }
    }
}
