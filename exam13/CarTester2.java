//클래스 car를 이용하는 프로그램 작성

import java.util.Scanner;

public class CarTester2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("차량 데이터를 입력하세요.");
        System.out.print("이  름 :"); String name = stdIn.next();
        System.out.print("번  호 :"); String number = stdIn.next();
        System.out.print("전  폭 :"); int width = stdIn.nextInt();
        System.out.print("전  고 :"); int height = stdIn.nextInt();
        System.out.print("전  장 :"); int length = stdIn.nextInt();
        System.out.print("탱크용량 :"); double  tankage = stdIn.nextDouble();
        System.out.print("연료량 :");  double fuel = stdIn.nextDouble();
        System.out.print("연  비 :"); double  sfc = stdIn.nextDouble();

        Car myCar = new Car(name,number,width,height,length,tankage,fuel,sfc);

        while(true) {
            System.out.printf("현재 위치 :(%.2f,%.2f)\n",myCar.getX(),myCar.getY());
            System.out.printf("남은 연료 : %.2f\n",myCar.getFuel());
            System.out.print("이동하시겠습니까?[0..No/1..Yes]:");
            if (stdIn.nextInt() == 0) break;

            System.out.print("X방향으로의 이동거리 :");
            double dx = stdIn.nextInt();

            System.out.print("Y방향으로의 이동거리 :");
            double dy = stdIn.nextInt();

            if (!myCar.move(dx,dy))
                System.out.println("연료 부족!!");

        }
    }
}
