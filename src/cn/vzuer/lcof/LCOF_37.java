package cn.vzuer.lcof;

import java.util.LinkedList;
import java.util.Queue;

// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class LCOF_37 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "[]";
        StringBuilder res = new StringBuilder("[");
        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(root);
        while (!Q.isEmpty()) {
            TreeNode node = Q.poll();
            if (node == null) {
                res.append("null,");
            } else {
                res.append(node.val + ",");
                Q.add(node.left);
                Q.add(node.right);
            }
        }
        if (res.charAt(res.length() - 1) == ',') {
            res.deleteCharAt(res.length() - 1);
        }
        res.append("]");
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("[]")) return null;
        String[] vals = data.substring(1, data.length() - 1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(root);
        int i = 1;
        while (!Q.isEmpty()) {
            TreeNode node = Q.poll();
            if (!vals[i].equals("null")) {
                node.left = new TreeNode(Integer.parseInt(vals[i]));
                Q.add(node.left);
            }
            ++i;
            if (!vals[i].equals("null")) {
                node.right = new TreeNode(Integer.parseInt(vals[i]));
                Q.add(node.right);
            }
            ++i;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));