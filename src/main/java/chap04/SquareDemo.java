package chap04;

public class SquareDemo {
    public static void main(String[] args) {
        Square s1 = new Square(10.0, "빨강");

        Square s2 = new Square(5.0);

        Square s3 = new Square("노랑");

        Square s4 = new Square();

        System.out.println(s1.radius + s1.color);
        System.out.println(s2.radius + s2.color);
        System.out.println(s3.radius + s3.color);
        System.out.println(s4.radius + s4.color);
    }
}

class Square {
    double radius;
    String color;

    public Square(double r, String c) {
        radius = r;
        color = c;
    }

    public Square(double r) {
        radius = r;
        color = "파랑";
    }

    public Square(String c){
        radius = 10.0;
        color = c;
    }

    public Square(){
        radius = 10.0;
        color = "빨강";
    }

}
