package Test05;

public class DateIdTester {
    public static void main(String[] args) {
        DateId a = new DateId();
        DateId b = new DateId();
        DateId c = new DateId();

        System.out.println("a의 식별 번호:" + a.getId());
        System.out.println("a의 식별 번호:" + b.getId());
        System.out.println("a의 식별 번호:" + c.getId());
    }
}
