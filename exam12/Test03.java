<<<<<<< HEAD
//배열에서 연속되는 n개의 요소를 삭제한 배열 반환

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test03 {
    //배열 a에서 a[idx]를 삭제한 배열을 반환
    static int[] arrayRmv0fN(int[] a, int idx, int n) {
        if (n < 0 || idx < 0 || idx > a.length)
            return a.clone();
        else {
            if(idx+ n > a.length)
                n = a.length - idx;
            int [] c = new int[a.length-n];
            int i =0;
            for(; i <idx; i++)
                c[i] = a[i];
            for (; i < a.length - n; i++)
                c[i] = a[i+n];
            return  c;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("요수 수 :");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] :");
            x[i] = stdIn.nextInt();
        }

        System.out.print("삭제를 시작할 인덱스 :");
        int idx = stdIn.nextInt();

        System.out.print("삭제할 요소의 개수:");
        int n = stdIn.nextInt();

        //배열 x의 x[idx]부터 n개의 요소를 삭제한 배열 생성
        int[] y = arrayRmv0fN(x, idx, n);

        for (int i = 0; i < y.length; i++)    //배열 y 표시
            System.out.println("y[" + i + "] :" + y[i]);
    }

}
=======
//배열에서 연속되는 n개의 요소를 삭제한 배열 반환

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test03 {
    //배열 a에서 a[idx]를 삭제한 배열을 반환
    static int[] arrayRmv0fN(int[] a, int idx, int n) {
        if (n < 0 || idx < 0 || idx > a.length)
            return a.clone();
        else {
            if(idx+ n > a.length)
                n = a.length - idx;
            int [] c = new int[a.length-n];
            int i =0;
            for(; i <idx; i++)
                c[i] = a[i];
            for (; i < a.length - n; i++)
                c[i] = a[i+n];
            return  c;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("요수 수 :");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] :");
            x[i] = stdIn.nextInt();
        }

        System.out.print("삭제를 시작할 인덱스 :");
        int idx = stdIn.nextInt();

        System.out.print("삭제할 요소의 개수:");
        int n = stdIn.nextInt();

        //배열 x의 x[idx]부터 n개의 요소를 삭제한 배열 생성
        int[] y = arrayRmv0fN(x, idx, n);

        for (int i = 0; i < y.length; i++)    //배열 y 표시
            System.out.println("y[" + i + "] :" + y[i]);
    }

}
>>>>>>> f587013ed8c715a80976896655b2ebc6b3a1a7aa
