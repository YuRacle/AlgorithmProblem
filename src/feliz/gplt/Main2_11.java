/**
 * Created by YuRacle on 2018/3/25.
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String per = sc.nextLine();
        String in = sc.nextLine();
        String[] perOrder = per.split(" ");
        String[] inOrder = in.split(" ");

        TreeNode root = createTree(perOrder, inOrder);
        print(root, n);
    }

    public static TreeNode createTree(String[] inOrder, String[] preOrder) {
        if (preOrder.length == 0) {
            return null;
        }

        String rootValue = preOrder[0];
        int rootIndex = 0;
        for (int i=0; i < inOrder.length; i++) {
            if (inOrder[i].equals(rootValue)) {
                rootIndex = i;
            }
        }

        TreeNode root = new TreeNode(rootValue);
        root.setLeft(
                createTree(
                        Arrays.copyOfRange(inOrder, 0, rootIndex),
                        Arrays.copyOfRange(preOrder, 1, rootIndex + 1)
                )
        );
        root.setRight(
                createTree(
                        Arrays.copyOfRange(inOrder, 1+rootIndex, inOrder.length),
                        Arrays.copyOfRange(preOrder, rootIndex+1, inOrder.length)
                )
        );
        return root;
    }

    public static void print(TreeNode root, int n) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);


        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.getValue());
            if (n != 1) {
                System.out.print(" ");
                n--;
            }
            if (temp.getRight() != null) {
                queue.add(temp.getRight());
            }
            if (temp.getLeft() != null) {
                queue.add(temp.getLeft());
            }
        }
    }
}

class TreeNode {
    public final String value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}


