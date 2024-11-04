//은행 계좌 클래스 (버전2)
public class Account {
    private  String name;      //계좌 명의
    private  String no;      //계좌 번호
    private  long balance;      //예금 잔고
    private Day openDay;      //계좌 개설일

    // 생성자

    public Account(String n, String num, long z, Day d) {
        name = n;                 //계좌 명의
        no = num;                //계좌 번호
        balance = z;             //예금 잔
        openDay = new Day(d);    //계좌 개설일
    }

    //계좌 명의 확인
    public String getName() {
        return name;
    }
    //계좌 번호 확인
    public String getNo() {
        return no;
    }
    //예금 잔고 확인
    public long getBalance() {
        return balance;
    }
    //계좌 개설일 확인
    public Day getOpenDay() {
        return openDay;
    }
    //k원 입금
    void deposit(long k){
        balance += k;
    }
    //k원 출금
    void withdraw(long k){
        balance -= k;
    }

    //문자열로 표현해 계좌 기본 정보 변환
    public String toString() {
        return "{" + name + "," + no + "," + balance + "}";
    }

}
