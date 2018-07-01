package LanJiaoBei;

/**
 * Created by YuRacle on 2018/3/31.
 */
public class Main2 {

    public static void main(String[] args) {
        int flag = 1;
        double sum = 0;
        for(int i=1,k=1; i<=100;i++,k+=2) {
            if (flag == 1) {
                sum += 4.0/k;
                flag = 0;
            }else {
                sum -= 4.0/k;
                flag = 1;
            }
        }
        System.out.printf("%.2f",Math.rint(sum*100)/100);

    }
}
