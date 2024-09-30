//정숫값 제곱 표시 다른 방법

import java.util.Scanner;

public class Test01b {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("정숫값 :");
        int n= stdIn.nextInt();
        for (int i = 1, j = 1; i <=n; i++, j = i * i)
            System.out.println(i + "의 제곱은" + j + "입니다.");
    }
}
