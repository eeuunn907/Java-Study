package chap04;

class Triangle { // 클래스 Triangle
    double s; // 밑변
    double h; // 높이

    double ar; // 넓이
    Triangle(double a, double b) { // 생성자 선언
        s = a; // s에 a을 대입
        h = b;
    }

    double findArea() { // 매서드 (넓이 구하는 매서드)
        return s * h * 0.5; // 넓이를 구하여 반환
    }
    boolean isSameArea(Triangle d){ // 두개의 삼각형 넓이가 동일한지 비교하는 매서드 추가
        if(d.findArea() == findArea()){ // t1의 넓이와 t2의 넓이 비교 같다면 ture 다르면 false
            return true;
        }
        else {
            return false;
        }
    }
}


public class TriangleTest {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(10.0, 5.0);
        Triangle t2 = new Triangle(5.0, 10.0);
        Triangle t3 = new Triangle(8.0, 8.0);

        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));
    }
}
