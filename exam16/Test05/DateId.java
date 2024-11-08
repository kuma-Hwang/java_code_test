package Test05;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.util.Calendar.*;

public class DateId {
    private static int counter;     //몇 번까지 식별 번호를 부여했는가
    private int id;                 //식별 번호


    static {
        GregorianCalendar today = new GregorianCalendar();
        int y = today.get(YEAR);        //연
        int m = today.get(MONTH)+1;     //월
        int d = today.get(DATE);        //일

        System.out.printf("오늘은 %04d년 %02d월 %02d일입니다.\n",y, m, d);

        counter = y * 1000000 + m * 10000 + d * 100;
    }

    public DateId() {
        id = ++counter;         //식별 번호
    }

    //식별 번호 가져오기
    public int getId() {
        return id;
    }
}
