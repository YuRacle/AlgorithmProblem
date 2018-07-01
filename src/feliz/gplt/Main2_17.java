/**
 * Created by YuRacle on 2018/3/30.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main2_17 {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());
        Integer[] act = new Integer[n];
        int outNum = 0, inNum = 0;

        String str = in.readLine();
        String[] strings = str.split(" ");
        for (int i=0; i<n; i++) {
            act[i] = Integer.valueOf(strings[i]);
        }

        Arrays.sort(act,Collections.reverseOrder());

        int outSum = 0,inSum = 0,diff;
        if (n%2==0) {
            outNum = n/2;
            inNum = n/2;
            for (int i=0; i<n/2; i++) {
                outSum += act[i];
            }
            for (int i=n/2; i<n; i++) {
                inSum += act[i];
            }
            diff = Math.abs(outSum-inSum);
        }else {
            outNum = n/2;
            inNum = n/2 + 1;
            for (int i=0; i<n/2; i++) {
                outSum += act[i];
            }
            for (int i=n/2; i<n; i++) {
                inSum += act[i];
            }
            diff = Math.abs(outSum-inSum);

            outNum = n/2 + 1;
            inNum = n/2;
            outSum = 0;
            inSum = 0;
            for (int i=0; i<n/2+1; i++) {
                outSum += act[i];
            }
            for (int i=n/2+1; i<n; i++) {
                inSum += act[i];
            }

            if (Math.abs(outSum-inSum) > diff) {
                diff = Math.abs(outSum-inSum);
            }
        }
        System.out.println("Outgoing #: "+outNum);
        System.out.println("Introverted #: "+inNum);
        System.out.println("Diff = "+diff);
    }
}
