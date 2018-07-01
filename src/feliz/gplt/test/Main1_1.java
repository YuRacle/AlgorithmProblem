/**
 * Created by YuRacle on 2018/3/25.
 */
/*import java.util.*;
public class Main1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        char[][] chars = new char[100][n];

        for (int i=0,j=0; i<str.length(); i++) {
            chars[j][i] = str.charAt(i);
            if (i%n==0) {
                j++;
            }

        }

        for (int i=0,j=0; i<n; i++,j++) {
                System.out.println(chars[i][j]);
        }

        *//*Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i< s.length(); i++) {
            System.out.println(s.charAt(i));
            stack.push(s.charAt(i));
        }

        while(stack.isEmpty()) {
            System.out.print(stack.peek());
            stack.pop();
            index++;
            while (index%4 ==0) {
                System.out.println();
            }
        }*//*

    }
}*/

import java.util.Scanner;

public class Main1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        if(in.hasNext()){
            int a = Integer.parseInt(in.nextLine());
            String st;
            char[] cr;
            if(a<100) {
                st=in.nextLine();
                cr = st.toCharArray();
                for(int i=0;i<a;i++)
                {
                    for(int j=(st.length()/4);j>=0;j--){
                        if(j*4+i < st.length())
                            System.out.printf("%c",cr[j*4+i]);
                        else
                            System.out.printf("%c",' ');
                        if(j==0&&(a!=i))
                            System.out.println();
                    }
                }

            }
        }
    }
}
