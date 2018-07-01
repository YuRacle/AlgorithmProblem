/**
 * Created by YuRacle on 2018/3/29.
 * L2-007 家庭房产（运用并查集）
 */
import java.util.*;
public class Main2_7 {

    public static int[] parent = new int[10001];
    public static int[] visit = new int[10001];
    public static Family[] families = new Family[10001];

    public static int findParent(int son) {
        int rootIndex = son;
        while (parent[rootIndex] != rootIndex) {
            rootIndex = parent[rootIndex];
        }

        int i = son;
        while (i != rootIndex) {
            i = parent[i];
            parent[i] = rootIndex;
        }
        return rootIndex;
    }

    public static void join(int a,int b) {

        int pa = findParent(a);
        int pb = findParent(b);
        if (pa != pb) {
            if (pa > pb) {
                parent[pa] = b;
            }else {
                parent[pb] = a;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] persons = new Person[n];

        for (int i=0; i<10001; i++) {
            parent[i] = i;
        }

        for (int i=0; i<n; i++) {
            int id = sc.nextInt();
            int fuId = sc.nextInt();
            if (fuId != -1) {
                join(fuId, id);
            }
            int muId = sc.nextInt();
            if (muId != -1) {
                join(muId, id);
            }
            int cNum = sc.nextInt();
            int[] cId = new int[cNum];
            for (int j=0; j<cNum; j++) {
                cId[j] = sc.nextInt();
                join(cId[j],id);
            }
            int hNum = sc.nextInt();
            double hArea = sc.nextDouble();
            persons[i] = new Person(id, hNum, hArea);
            persons[i].pNum += cNum;
        }

        for (int i=0; i<10001; i++) {
            families[i] = new Family(0);
        }

        for (int i=0; i<n; i++) {
            int rootIndex = findParent(persons[i].id);
            visit[rootIndex] = 1;

            families[rootIndex].id = rootIndex;
            families[rootIndex].pNum += persons[i].pNum;
            families[rootIndex].sumhNum += persons[i].hNum;
            families[rootIndex].sumhArea += persons[i].hArea;
            families[rootIndex].avehArea = families[rootIndex].sumhArea / families[rootIndex].pNum;
            families[rootIndex].avehNum = families[rootIndex].sumhNum / families[rootIndex].pNum;
        }

        //Arrays.sort(families);
        for (int i=0; i<10001; i++) {
            if (visit[i] == 1) {
                Family s = families[i];
                System.out.printf("%04d",s.id);
                System.out.print(" "+s.pNum+" "+s.avehNum+" "+s.avehArea);
                System.out.println();
            }
        }


    }
}

class Person {
    public int id;
    public int pNum = 1;
    public int hNum;
    public double hArea;

    public Person(int id, int hNum, double hArea) {
        this.id = id;
        this.hArea = hArea;
        this.hNum = hNum;
    }

    public int getId() {
        return id;
    }

    public double gethArea() {
        return hArea;
    }

    public int gethNum() {
        return hNum;
    }
}

class Family implements Comparable<Family>{
    public int id;
    public int pNum = 0;
    public double sumhArea = 0;
    public int sumhNum = 0;
    public double avehArea = 0;
    public double avehNum = 0;

    public Family(int id) {
        this.id = id;
    }

    public double getAvehArea() {
        return avehArea;
    }

    @Override
    public int compareTo(Family o) {
        return (int)(this.avehArea - o.avehArea);
    }
}
