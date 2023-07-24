package chap04;


class CircleTest{
    String color;
    static int CircleTest_num =0;
    public static void staticPrint(){
        System.out.println("정적 매서드");
    }
    void instancePrint(){
        System.out.println("인스턴스 매서드");
    }

}
public class StaticTest {
    public static void main(String[] args){
        System.out.println(CircleTest.CircleTest_num);
        CircleTest.staticPrint();
        CircleTest c = new CircleTest();
        //color = "Yellow";
        //instancePrint();

        c.color = "yellow";  // 객체를 생성한 후 사용
        c.instancePrint();
    }
}
