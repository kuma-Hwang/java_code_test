//이등변 삼각형을 나타내는 클래스 작성


import java.awt.*;

public abstract class AbstTriangle extends Shape {
    //한편의 길이를 나타내는 int 형 필드

    private int length;

    /* 직각 이등변 삼각형을 생성하는 생성자
    한변의 길이를 인수로 받는다.
    @param length 생성할 이등변 삼각형의 한 변의 길이 */

    public AbstTriangle(int length) {
        setLength(length);
    }

    /*
    * 한 변의 길이를 반환한다
    * @return 한 변의 길이
    */

    public int getLength () {
        return length;
    }

    /*
     * 한 변의 길이를 설정한다.
     * @param length 설정한 한 변의 길이
     */
    public void setLength(int length) {
        this.length = length;
    }



    /*
     * toString 메서드는 이등변 삼각형과 관련된 정보를 문자열로 반환
     * @return 문자열 "AbstTriangle(length:3)"를 반환
     * 3 부분은 한 별의 길이에 해당하는 값이다.
     */
    public String toString() {
        return "AbstTriangle(length:"+length+")";
    }

}
