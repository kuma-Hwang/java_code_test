package num08;

//사람 클래스

public class Human {
    private String name; //이름
    private int height; //신장
    private int weight; //체중
    private Day birthday; //생일


    //생성자
    public Human(String name, int height, int weight, Day birthday) {
        this.name = name;    this.height = height;
        this.weight = weight;   this.birthday = new Day(birthday);
    }

    public String getName() {return name;}                  //이름 불러오기
    public int getHeight() {return height;}                 //신장 불러오기
    public int getWeight() {return weight;}                 //체중 불러오기
    public Day getBirthday() {return new Day(birthday);}   //생일 불러오기

    public void gainWeight(int w) {weight += w;} //살이 찐다
    public void reduceWeight(int w) {weight -= w;} //살이 빠찐다

    //데이터 표시
    public void putData () {
        System.out.println("이름 :" +name);
        System.out.println("신장 :" +height + "cm");
        System.out.println("체중 :" +weight + "kg");
    }

    public String toString() {
        return "{" + name + ":" +height+"cm"+weight+"kg" +birthday +"출생}";
    }
}
