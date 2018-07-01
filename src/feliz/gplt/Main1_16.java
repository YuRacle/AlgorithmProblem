/**
 * Created by YuRacle on 2018/3/24.
 * L1-016. 查验身份证
 */
import java.util.*;
public class Main1_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag=0;
        int n = sc.nextInt();
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i=0; i < n; i++) {
            String s = sc.next();
            arrayList.add(s);
        }

        for (String str : arrayList) {
            for (int j=0; j<18; j++) {
                try{
                    new Integer(Integer.valueOf(str.charAt(j)));
                }catch (Exception e) {
                    flag = 1;
                }
            }

            double  z = ((((str.charAt(0)-'0')*7 + (str.charAt(1)-'0')*9 + (str.charAt(2)-'0')*10 + (str.charAt(3)-'0')*5
                    + (str.charAt(4)-'0')*8 + (str.charAt(5)-'0')*4 + (str.charAt(6)-'0')*2 + (str.charAt(7)-'0')*1
                    + (str.charAt(8)-'0')*6 +(str.charAt(9)-'0')*3 + (str.charAt(10)-'0')*7 + (str.charAt(11)-'0')*9
                    + (str.charAt(12)-'0')*10 + (str.charAt(13)-'0')*5 + (str.charAt(14)-'0')*8 + (str.charAt(15)-'0')*4
                    + (str.charAt(16)-'0')*2))) % 11;
            switch ((int)z) {
                case 0 :
                    if (str.charAt(17) == '1') {
                        break;
                    }
                    System.out.println(str);
                    flag = 1;
                    break;
                case 1 :
                    if (str.charAt(17) == '0') {
                        break;
                    }
                    System.out.println(str);
                    flag = 1;
                    break;
                case 2 :
                    if (str.charAt(17) == 'X') {
                        break;
                    }
                    System.out.println(str);
                    flag = 1;
                    break;
                case 3 :
                    if (str.charAt(17) == '9') {
                        break;
                    }
                    System.out.println(str);
                    flag = 1;
                    break;
                case 4 :
                    if (str.charAt(17) == '8') {
                        break;
                    }
                    System.out.println(str);
                    flag = 1;
                    break;
                case 5 :
                    if (str.charAt(17) == '7') {
                        break;
                    }
                    System.out.println(str);
                    flag = 1;
                    break;
                case 6 :
                    if (str.charAt(17) == '6') {
                        break;
                    }
                    System.out.println(str);
                    flag = 1;
                    break;
                case 7 :
                    if (str.charAt(17) == '5') {
                        break;
                    }
                    System.out.println(str);
                    flag = 1;
                    break;
                case 8 :
                    if (str.charAt(17) == '4') {
                        break;
                    }
                    System.out.println(str);
                    flag = 1;
                    break;
                case 9 :
                    if (str.charAt(17) == '3') {
                        break;
                    }
                    System.out.println(str);
                    flag = 1;
                    break;
                case 10 :
                    if (str.charAt(17) == '2') {
                        break;
                    }
                    System.out.println(str);
                    flag = 1;
                    break;
            }
        }
        if (flag == 0) {
            System.out.println("All passed");
        }
    }
}
