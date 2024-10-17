//입력한 정수의 부호를 판정

import java.util.Scanner;

public class Test09 {
    // n의 부호 판정
    static int signOf(int n) {
        int sign =0;

        if (n>0)
            sign = 1;
        else if (n <0)
            sign = -1;

        return sign; //sign 값 반환

//        static int signOf2(int n) {
//            if (n>0)
//                return  = 1;
//            else if (n <0)
//                return  = -1;
//
//            return 0; //sign 값 반환
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 x :");
        int x = stdIn.nextInt();

        int s = signOf(x);
        System.out.println("signOf(x)는"+s+"입니다.");
    }
}
