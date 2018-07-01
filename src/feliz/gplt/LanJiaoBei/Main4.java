package LanJiaoBei;

/**
 * Created by YuRacle on 2018/3/31.
 */
public class Main4 {

    static int[] a = new int[] { 0, 7, 4, 0, 0, 0, 0, 4, 0, 7, 0, 0, 0, 0, 0 };
    public static void get(int index) {
        if (index == 4) {
            index++;
        }
        if (index>= 7) {
            for (int i=1; i<a.length;i++) {
                System.out.print(a[i]);
            }
            return;
        }

        for (int i =3; i<14; i++) {
            if (i+index+1<=14 && a[i] ==0 && a[i+index+1] ==0) {
                a[i] = a[index+i+1] = index;
                get(index+1);
                a[i] = a[index+i+1] = 0;
            }
        }
    }
    public static void main(String[] args) {
        get(1);
    }

}
