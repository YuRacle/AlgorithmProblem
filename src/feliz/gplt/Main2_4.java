/**
 * Created by YuRacle on 2018/3/29.
 */
import java.util.*;
public class Main2_4 {

    private static int flag;
    private static int size=0;
    private static boolean isMirror;

    public static TreeNode3 createTree(int[] arr) {

        TreeNode3 root = new TreeNode3(arr[0]);
        size++;
        if (root == null) {
            return null;
        }
        if (arr.length == 1) {
            return root;
        }
        int index = 0;
        if (!isMirror) {
            for (int i=1,j=1; i< arr.length; i++) {
                if (arr[i] >= root.getValue()) {
                    if (j==1) {
                        index = i;
                    }
                    j++;
                }
                if (j != arr.length) {
                    isMirror = true;
                    return null;
                }
            }
            if (index !=0 && index != 1) {
                root.setLeft(
                        createTree(Arrays.copyOfRange(arr,1,index))
                );
                root.setRight(
                        createTree(Arrays.copyOfRange(arr,index,arr.length))
                );
            }else if (index == 0) {
                root.setLeft(
                        createTree(Arrays.copyOfRange(arr,1,arr.length))
                );
            }else {
                root.setRight(
                        createTree(Arrays.copyOfRange(arr,1,arr.length))
                );
            }
        }else {
            for (int i=1,j=1; i< arr.length; i++) {
                if (arr[i] <= root.getValue()) {
                    if (j==1) {
                        index = i;
                    }
                    j++;
                }
                if (j != arr.length) {
                    isMirror = false;
                    return null;
                }
            }
            if (index !=0 && index != 1) {
                root.setLeft(
                        createTree(Arrays.copyOfRange(arr,1,index))
                );
                root.setRight(
                        createTree(Arrays.copyOfRange(arr,index,arr.length))
                );
            }else if (index == 0) {
                root.setLeft(
                        createTree(Arrays.copyOfRange(arr,1,arr.length))
                );
            }else {
                root.setRight(
                        createTree(Arrays.copyOfRange(arr,1,arr.length))
                );
            }
        }

        return root;
    }

    public static void postPrint(TreeNode3 root) {

        if (root == null) {
            return;
        }
        postPrint(root.getLeft());
        postPrint(root.getRight());
        if (flag != 0) {
            System.out.print(" ");
        }
        System.out.print(root.getValue());
        flag++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        isMirror = false;

        TreeNode3 tree = createTree(arr);
        if ( size != n) {
            size = 0;
            isMirror = true;
            TreeNode3 tree2 = createTree(arr);
            System.out.println("YES");
            postPrint(tree2);
        }
        if (size == n){
            System.out.println("YES");
            postPrint(tree);
        }else {
            System.out.println("NO");
        }
    }
}

class TreeNode3 {
    public final int value;
    public TreeNode3 left;
    public TreeNode3 right;

    public TreeNode3(int value) {
        this.value = value;
    }

    public void setLeft(TreeNode3 left) {
        this.left = left;
    }

    public void setRight(TreeNode3 right) {
        this.right = right;
    }

    public int getValue() {
        return value;

    }

    public TreeNode3 getLeft() {
        return left;
    }

    public TreeNode3 getRight() {
        return right;
    }
}
