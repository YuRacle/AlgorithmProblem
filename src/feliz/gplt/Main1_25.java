/**
 * Created by YuRacle on 2018/3/27.
 */
import java.io.*;
public class Main1_25 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        String s = in.readLine();
        System.out.println(s);
        String[] str = s.split(" ",2);
        int a=0,b=0;

        try {
            if (Integer.valueOf(str[0]) >=1 && Integer.valueOf(str[0]) <=1000) {
                a = Integer.valueOf(str[0]);
            }else {
                a = -1;
            }
        }catch (Exception e) {
            a = -1;
        }
        try {
            if (Integer.valueOf(str[1]) >=1 && Integer.valueOf(str[1]) <=1000) {
                b = Integer.valueOf(str[1]);
            }else {
                b = -1;
            }
        }catch (Exception e) {
            b = -1;
        }

        if (a != -1 && b != -1) {
            System.out.println(a+" + "+b+" = "+(a+b));
        }else if (a == -1 && b != -1) {
            System.out.println("?"+" + "+b+" = ?");
        }else if (a != -1 && b == -1) {
            System.out.println(a+" + ? = ?");
        }else if (a == -1 && b == -1) {
            System.out.println("? + ? = ?");
        }
    }
}
