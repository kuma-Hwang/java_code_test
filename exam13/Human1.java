// 앞 예제의 문제점들이 해결 되도록 수정, 클래스에 필드뿐 아니라 생성자와 메소드도 정의
public class Human1 {
    private String name; //이름
    private int height; //신장
    private int weight; //체중

    //생성자

    Human1(String n, int h, int w) {
        name = n; height = h; weight = w;
    }

    String getName() {return name;}   //이름가져오기
    int getHeight() {return height;}   //신장가져오기
    int getWeight() {return weight;}   //체중가져오기

    void gainWeight(int w) {weight += w;} //살이 찐다
    void reduceWeight(int w) {weight -= w;} //살이 빠찐다

}
