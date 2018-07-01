/**
 * Created by YuRacle on 2018/3/25.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag=0,index=0;
        String s,s1 = null,s2 = null;
        while(flag == 0) {
            s = sc.nextLine();
            if (s.equals(".")) {
                flag = 1;
            }
            index++;
            if (index==2) {
              s1 = s;
            }
            if (index == 14) {
                s2 = s;
            }
        }
        if (s1 != null) {
            if (s2 != null) {
                System.out.println(s1+" and "+s2+" are inviting you to dinner...");
                return;
            }else {
                System.out.println(s1+" is the only one for you...");
                return;
            }
        }else {
            System.out.println("Momo... No one is for you ...");
            return;
        }

    }
}