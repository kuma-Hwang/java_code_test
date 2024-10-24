public class Human1Tester {
    public static void main(String[] args) {
        Human1 gildong = new Human1("길동",170,60);
        Human1 chulsu = new Human1("철수",166,72);

        gildong.gainWeight(3);   //길동이 3kg 찜
        chulsu.reduceWeight(5);  //철수가 5kg 빠찜

        System.out.println("이름 :" +gildong.getName());
        System.out.println("신장 :" +gildong.getHeight() + "cm");
        System.out.println("체중 :" +gildong.getWeight() + "kg");
        System.out.println();

        System.out.println("이름 :" +chulsu.getName());
        System.out.println("신장 :" +chulsu.getHeight() + "cm");
        System.out.println("체중 :" +chulsu.getWeight() + "kg");
        System.out.println();
    }
}
