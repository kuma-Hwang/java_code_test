import java.util.Random;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

                String[] dayKorean = {"일", "월", "화", "수", "목", "금", "토"};
                String[] daysEnglish = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};

                System.out.println("요일명을 영어 소문자로 입력하세요.");

                int retry;
                int last = -1; // 이전 요일

                do {
                    int day;
                    do {
                        day = rand.nextInt(7); // 0~6 사이의 난수 생성
                    } while (day == last);

                    last = day;

                    while (true) {
                        System.out.print(dayKorean[day] + "요일: ");
                        String s = stdIn.next();

                        if (s.equals(daysEnglish[day])) {
                            System.out.println("정답입니다!");
                            break;
                        } else {
                            System.out.println("틀렸습니다.");
                        }
                    }

                    System.out.print("다시 한번? 1...Yes/0...No: ");
                    retry = stdIn.nextInt();
                } while (retry == 1);

            }
        }
