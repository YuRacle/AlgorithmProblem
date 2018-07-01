/**
 * Created by YuRacle on 2018/3/30.
 * L2-009 抢红包
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main2_9 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        int n = sc.nextInt();
        int n = Integer.valueOf(in.readLine());
        Person2[] person2s = new Person2[n+1];

        for (int i=0; i<=n; i++) {
            person2s[i] = new Person2(i);
        }
        for (int i=1; i<=n; i++) {
            String str = in.readLine();
            String[] strings = str.split(" ");
//            int k = sc.nextInt();
            int k = Integer.valueOf(strings[0]);
            int[] ids = new int[k];
            int[] moneys = new int[k];
            for (int x=0,j=1; x < k; x++,j += 2) {
                ids[x] = Integer.valueOf(strings[j]);
                moneys[x] = Integer.valueOf(strings[j+1]);
                person2s[ids[x]].money += moneys[x];
                person2s[ids[x]].num ++;
                person2s[i].money -= moneys[x];

            }
            /*for (int j =0; j<k; j++) {
                int id = sc.nextInt();
                int money = sc.nextInt();
                person2s[i].money -= money;
                person2s[id].num++;
                person2s[id].money += money;
            }*/

        }

        Arrays.sort(person2s,1,n+1);
        for (int i=1; i<=n; i++) {
            System.out.printf("%d %.2f\n", person2s[i].id, (double)person2s[i].money/100);
        }
    }
}

class Person2 implements Comparable<Person2>{
    public int id=0;
    public int money=0;
    public int num=0;

    public Person2(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Person2 o) {
        if (this.money != o.money) {
            return o.money - this.money;
        }else if (this.num != o.num) {
            return o.num - this.num ;
        }else {
            return this.id - o.id ;
        }
    }
}
