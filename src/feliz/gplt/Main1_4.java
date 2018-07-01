/**
 * Created by YuRacle on 2018/3/24.
 * L1-004 计算摄氏度
 */
import java.util.*;
public class Main1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int c = 5*(f-32)/9;
        System.out.println("Celsius = "+c);
    }
}
