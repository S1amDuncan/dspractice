package cn.sliew.dspractice.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 * 给定一个二叉树，返回它的 前序 遍历
 *
 */
public class PreOrderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        LinkedList<TreeNode> nodeStore = new LinkedList<TreeNode>();
        if (root == null) {
            return result;
        }
        nodeStore.add(root);
        // 递归遍历处理
        while (!nodeStore.isEmpty()) {
            TreeNode current = nodeStore.pollLast();
            result.add(current.value);
            if (current.right != null) {
                nodeStore.add(current.right);
            }
            if (current.left != null) {
                nodeStore.add(current.left);
            }
        }
        return result;
    }


}
