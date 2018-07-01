/**
 * Created by YuRacle on 2018/3/28.
 * n个数全排列
 */
import java.util.*;
public class Main1_0 {

    public static int[] arr;//装数字
    public static int n;

    public static void swap(int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void dfs(int index) {

        if (index == n) {
            for (int a : arr) {
                System.out.print(a);
            }
            System.out.println();
            return;
        }else {
            for (int i=index; i < n; i++) {
                swap(index, i);//交换
                dfs(index+1);//递进1
                swap(index, i);//溯回
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        dfs(0);
    }
}
