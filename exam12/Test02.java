<<<<<<< HEAD
// 배열에서 요소를 삭제한 배열을 반환

import java.util.Scanner;

public class Test02 {

    //배열 a에서 a[idx]를 삭제한 배열을 반환
    static int[] arrayRmv0f(int[] a, int idx) {
        if (idx < 0 && idx >= a.length -1)
            return a.clone();       //a의 복사본을 그대로 반환
        else {
            int[] c = new int[a.length -1];
            int i = 0;
            for(; i < idx; i++)
                c[i] = a[i];
            for(; i < a.length -1; i++)
                c[i] = a[i+1];
            return  c;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요수 수 :");
        int num = stdIn.nextInt();
        int [] x = new int[num];  //요소 수가 num 인 배열

        for(int i =0; i < num; i++) {
            System.out.print("x["+ i +"] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("삭제할 요소의 인덱스 :");
        int idx = stdIn.nextInt();

        int[] y = arrayRmv0f(x, idx);   //배열 x에서 x[idx]를 삭제한 배열 생성
        for (int i = 0; i < y.length; i++)  //배열 y 표시
            System.out.println("y["+ i +"] : " + y[i]);
    }

}
=======
// 배열에서 요소를 삭제한 배열을 반환

import java.util.Scanner;

public class Test02 {

    //배열 a에서 a[idx]를 삭제한 배열을 반환
    static int[] arrayRmv0f(int[] a, int idx) {
        if (idx < 0 && idx >= a.length -1)
            return a.clone();       //a의 복사본을 그대로 반환
        else {
            int[] c = new int[a.length -1];
            int i = 0;
            for(; i < idx; i++)
                c[i] = a[i];
            for(; i < a.length -1; i++)
                c[i] = a[i+1];
            return  c;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요수 수 :");
        int num = stdIn.nextInt();
        int [] x = new int[num];  //요소 수가 num 인 배열

        for(int i =0; i < num; i++) {
            System.out.print("x["+ i +"] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("삭제할 요소의 인덱스 :");
        int idx = stdIn.nextInt();

        int[] y = arrayRmv0f(x, idx);   //배열 x에서 x[idx]를 삭제한 배열 생성
        for (int i = 0; i < y.length; i++)  //배열 y 표시
            System.out.println("y["+ i +"] : " + y[i]);
    }

}
>>>>>>> f587013ed8c715a80976896655b2ebc6b3a1a7aa
