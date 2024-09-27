//입력한 정숫값의 모든 약수 표시

import java.util.Scanner;

public class Teat10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("정숫값 :");
        int n = stdIn.nextInt();
        int count = 0;          //약수의 갯수
        for (int i = 1; i <= n; i++)
            if (n % i == 0) {       // 나누어 떨어지면
                System.out.print(i+ " ");   //표시
                count++;
            }
        System.out.println( "\n"+ n +"의 약수는" + count + "개입니다."); //갯수를 표시

    }
}
