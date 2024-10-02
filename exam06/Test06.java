//float형 변수와 double 형 변수에 실숫값을 읽어서 표시

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("변수 x는 float형입니다. 변수 y는 double형입니다.");
        System.out.print("x :");
        float x = stdin.nextInt();
        System.out.print("y :");
        double y = stdin.nextInt();


        System.out.println("x =" + x);
        System.out.println("y =" + y);
    }
}
