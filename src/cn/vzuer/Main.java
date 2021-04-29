package cn.vzuer;
//import cn.vzuer.leetcode.*;
//import cn.vzuer.algoads.sort.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello IntelliJ IDEA, this is a test!");
//      Solution sl = new LC_633();
//      boolean ans = sl.judgeSquareSum(100);
//      System.out.println(ans);
//        Selection<Integer> selection = new Selection<>();
        Integer[] arr = {1, 5, 0, 3, 9, 7, 2, 8, 4, 6};
//        selection.sort(arr);
//        for(Integer x : arr){
//            System.out.println(x);
//        }
        Queue<Integer> Q = new LinkedList<>(){{ add(arr[1]); }};
        System.out.println(Q.peek());
    }
}
