/**
 * Created by YuRacle on 2018/3/27.
 */
import java.io.*;
import java.util.*;

public class Main1_11 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String a = bf.readLine();
        String b = bf.readLine();

        StringTokenizer st = new StringTokenizer(a,b);
        while (st.hasMoreElements()) {
            System.out.print(st.nextElement());
            //out.flush();
        }
        bf.close();
        //out.close();
    }
}
