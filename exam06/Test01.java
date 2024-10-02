//정숫값을 글룹별로 읽어서 합산

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 더합니다.");
        int total = 0;                      //전체 그룹의 합계


        Outer:
            for (int i =1; i <=10; i++) {
                System.out.println(i + "그룹");

                for (int j = 0; j < 5; j++) {
                    System.out.print("정수 :");
                    int t = stdIn.nextInt();
                    if ( t == 99999)
                        break Outer;
                    else if (t == 88888)
                        continue Outer;
                    total += t;
                }
            }
        System.out.println("\n n의 합계는" + total + "입니다.");
    }

}
