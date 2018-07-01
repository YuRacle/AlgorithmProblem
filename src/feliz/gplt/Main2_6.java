/**
 * Created by YuRacle on 2018/3/29.
 * 树的遍历（后序，中序->层序）
 * Arrays.binarySearch() 查看数组元素，数组必需有序
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main2_6 {

    public static TreeNode2 createTree(int[] postOrder, int[] inOrder) {

        int len = postOrder.length;
        if (len <= 0) {
            return null;
        }

        TreeNode2 root = new TreeNode2(postOrder[len-1]);
        int rootIndex = 0;

        for (int i=0; i < inOrder.length; i++) {
            if (inOrder[i] == postOrder[len-1]) {
                rootIndex = i;
            }
        }

        root.setLeft(
                createTree(
                        Arrays.copyOfRange(postOrder, 0, rootIndex),
                        Arrays.copyOfRange(inOrder, 0, rootIndex)
                )
        );
        if (rootIndex != len-1) {
            root.setRight(
                    createTree(
                            Arrays.copyOfRange(postOrder, rootIndex, len-1),
                            Arrays.copyOfRange(inOrder, rootIndex+1,inOrder.length)
                    )
            );
        }

        return root;
    }

    public static void print(TreeNode2 root) {

        if (root == null) {
            return ;
        }
        LinkedList<TreeNode2> queue = new LinkedList<TreeNode2>();
        queue.add(root);

        int flag = 0;
        while (!queue.isEmpty()) {
            TreeNode2 temp = queue.poll();
            if (temp.getLeft() != null) {
                queue.add(temp.getLeft());
            }
            if (temp.getRight() != null) {
                queue.add(temp.getRight());
            }
            flag++;
            if ( flag != 1) {
                System.out.print(" ");
            }
            System.out.print(temp.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n <= 0) {
            return;
        }
        int[] postOrder = new int[n];
        int[] inOrder = new int[n];

        for (int i = 0; i<n; i++) {
            postOrder[i] = sc.nextInt();
        }
        for (int i = 0; i<n; i++) {
            inOrder[i] = sc.nextInt();
        }

        TreeNode2 tree = createTree(postOrder,inOrder);
        print(tree);
    }
}

class TreeNode2 {
    public final int value;
    public TreeNode2 left;
    public TreeNode2 right;

    public TreeNode2(int value) {
        this.value = value;
    }

    public void setLeft(TreeNode2 left) {
        this.left = left;
    }

    public void setRight(TreeNode2 right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public TreeNode2 getLeft() {
        return left;
    }

    public TreeNode2 getRight() {
        return right;
    }
}
