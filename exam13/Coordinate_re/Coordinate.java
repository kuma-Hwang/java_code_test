package Coordinate_re;

public class Coordinate {

    private double x = 0.0;  //X좌표
    private double y = 0.0;  //Y좌표

    //생성자
    public Coordinate() {}
    public Coordinate(double x, double y) {set(x,y);}
    public Coordinate(Coordinate c) {this(c.x,c.y);}

    double getX() {return x;}         //X좌표 가져오기
    double getY() {return y;}         //Y좌표 가져오기

    public void setX(double x) {this.x =x;}    //X좌표 설정
    public void setY(double y) {this.y =y;}    //Y좌표 설정

    public void set(double x, double y) {this.x = x; this.y=y;}  //좌표설정

    public boolean equalTo(Coordinate c) { return x == c.x && y == c.y;}

    public String toString() {return "(" + x + "," + y + ")";}
}
