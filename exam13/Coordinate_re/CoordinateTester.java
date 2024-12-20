package Coordinate_re;

import java.util.Scanner;

public class CoordinateTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("좌표 p를 입력하세요.");
        System.out.print("X좌표:");
        double x = stdIn.nextDouble();
        System.out.print("Y좌표:");
        double y = stdIn.nextDouble();

        Coordinate p = new Coordinate(x,y);
        System.out.println("p =" +p);
        Coordinate q = new Coordinate(p); //p와 같은 좌표

        System.out.println("q와 p를 동일 좌표로 만들었습니다.");
        System.out.println("q =" + q);

        if (p.equalTo(q))
            System.out.println("p와 q가 같습니다.");
        else
            System.out.println("p와 q가 다릅니다.");

        Coordinate c1 = new Coordinate();
        Coordinate c2 = new Coordinate(1.1,2.2);

        System.out.println("c1 =" + c1);
        System.out.println("c2 =" + c2);
        Coordinate[] a = new Coordinate[3]; //요소 수가 3인 Coordinate형 배열
        for (int i = 0; i< a.length; i++)
            a[i] = new Coordinate();        //모든 요소를 (0.0,0.0)로 설정

        for (int i =0; i <a.length; i++)
            System.out.println("a["+i+"]"+a[i]);

    }
}
