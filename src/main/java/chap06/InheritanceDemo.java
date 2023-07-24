package chap06;

class Circle {
    private void secret() {
        System.out.println("비밀이다.");
    }
    protected void findRadius() {
        System.out.println("반지름이 10.0센티이다.");
    }
    public void findArea() {
        System.out.println("넓이는 (파이 * 반지름 * 반지름) 이다");
    }
}
class Ball extends Circle {
    private String color;

    public Ball(String color) {
        this.color = color;
    }
    public void findColor() {
        System.out.println(color + "공이다");
    }
    public void findVolume() {
        System.out.println("부피는 4/3 * (4*파이 * 반지름 * 반지름)이다.");

    }
    public void findArea(){
        findRadius();

        super.findArea();

        System.out.println("부피는 4/3 * (4*파이 * 반지름 * 반지름)이다.");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Ball c2 = new Ball("빨간색");

        System.out.println("원");
        c1.findRadius();
        c1.findArea();

        System.out.println("\n공");
        c1.findRadius();
        c2.findColor();
        c2.findArea();
        c2.findVolume();
    }
}
