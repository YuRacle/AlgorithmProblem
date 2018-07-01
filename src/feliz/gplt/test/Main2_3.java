/**
 * Created by YuRacle on 2018/3/25.
 */
import java.util.*;
public class Main2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int id,fu,mu,k,home=0,area=0;
        //String[] childs = new String[];
        int[] ids  = new int[1000];
        int num=0,nums=0;

        for (int i =0; i<n; i++) {

            ids[num++] = sc.nextInt();
            ids[num++] = sc.nextInt();
            ids[num++] = sc.nextInt();

            k = sc.nextInt();
            for (int j=0; j<k;j++) {
                ids[num++] = sc.nextInt();
            }

            home += sc.nextInt();
            area += sc.nextInt();
        }
        Arrays.sort(ids);
        System.out.println(ids[0]);
        for (int a : ids) {
            if (a!=-1) {
                nums++;
            }
        }
        System.out.println(nums);

    }
}
