/**
 * Created by YuRacle on 2018/3/24.
 */
import java.util.*;
public class Main1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = String.valueOf(n);
        for (int i=0;i<str.length();i++) {
            switch(str.charAt(i)) {
                case '-' :
                    System.out.print("fu");
                    break;
                case '0' :
                    System.out.print("ling");
                    break;
                case '1' :
                    System.out.print("yi");
                    break;
                case '2' :
                    System.out.print("er");
                    break;
                case '3' :
                    System.out.print("san");
                    break;
                case '4' :
                    System.out.print("si");
                    break;
                case '5' :
                    System.out.print("wu");
                    break;
                case '6' :
                    System.out.print("liu");
                    break;
                case '7' :
                    System.out.print("qi");
                    break;
                case '8' :
                    System.out.print("ba");
                    break;
                case '9' :
                    System.out.print("jiu");
                    break;
            }
            if (i != str.length()-1) {
                System.out.print(" ");
            }
        }
    }
}
