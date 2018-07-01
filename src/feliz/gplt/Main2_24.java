/**
 * Created by YuRacle on 2018/3/30.
 */
import java.util.*;

public class Main2_24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Tribe[] tribes = new Tribe[n];
        for (int i=0; i<n; i++) {
            tribes[i] = new Tribe(i);
        }
        for (int i=0; i<n; i++) {
            int flag = 0;
            int k =sc.nextInt();
            int[] humam = new int[k];
            for (int t=0; t<k; t++) {
                humam[t] = sc.nextInt();
            }
            for (int t=0; t <= i ; t++) {
                if (tribes[t].check(humam)) {
                    for (int j=0; j<k; j++) {
                        tribes[t].add(humam[j]);
                        flag = 1;
                    }
                }
            }
            if (flag == 0) {
                for (int t=0; t<k; t++) {
                    tribes[i].add(humam[t]);
                }
            }
        }

        int q = sc.nextInt();
        int[] flags = new int[q];
        int sum = 0,num = 0;
        for (int i=0; i<q; i++) {
            sum = 0;num = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j=0; j<n; j++) {
                if (tribes[j].num !=0) {
                    if (tribes[j].people.contains(a) && tribes[j].people.contains(b)) {
                        flags[i] = 1;
                    }
                    sum += tribes[j].num;
//                    System.out.println(tribes[j].num+"b");
                    num++;
                }
            }
        }
        System.out.println(sum+" "+num);
        for (int i=0; i<q; i++) {
            if (flags[i] == 1) {
                System.out.println("Y");
            }else {
                System.out.println("N");
            }
        }
    }
}

class Tribe {

    public int id;
    public int num;
    public LinkedHashSet<Integer> people = new LinkedHashSet<Integer>();

    public Tribe(int id) {
        this.id = id;
        num = 0;
    }

    public void add(int p) {
        if (people.contains(p)) {
            return;
        }
        people.add(p);
        this.num++;
    }

    public boolean check(int[] p) {
        for (int a : p) {
            if (people.contains(a)) {
                return true;
            }
        }
        return false;
    }
}
