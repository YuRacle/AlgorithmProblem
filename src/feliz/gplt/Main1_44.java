/**
 * Created by YuRacle on 2018/3/28.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main1_44 {

    public static String action(String s) {
        if ("ChuiZi".equals(s)) {
            return "Bu";
        }else if ("Bu".equals(s)) {
            return "JianDao";
        }else {
            return "ChuiZi";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.valueOf(in.readLine());
        ArrayList<String> arrayList = new ArrayList<String>();
        String str;
        int i = 0;
        while (!((str = in.readLine()).equals("End"))) {

            if ( i == k) {
                i = 0;
                arrayList.add(str);
                continue;
            }
            arrayList.add(action(str));
            i++;
        }
        for (String s: arrayList) {
            System.out.println(s);
        }
    }
}
