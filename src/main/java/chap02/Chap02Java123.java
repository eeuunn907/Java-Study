package chap02;

public class Chap02Java123 {
    // float pi = 3.145f;

    /* public static void main(String[] args) {
        int mach;
        int distance;

        mach = 340;
        distance = mach * 60 * 60;
        System.out.println("소리가 1시간 동안 가는 거리 : " + distance + "m");

        double radius;
        double area;
        radius = 10.0;
        area = radius * radius * 3.14;
        System.out.println("반지름이" + radius + "인 원의 넓이 : " + area);

        boolean condition = true;
    }
    */
    /*
    public static void main(String[] args) {
        char ga1 = '가';
        char ga2 = '\uac00';

        boolean cham = true;
        boolean geojit = false;
        byte a = (byte)300;

        System.out.println(a);
        System.out.println(ga1);
        System.out.println((int) ga1);
        System.out.println(ga2);
        System.out.println(++ga2);
        System.out.println(cham + "가 아니면 " + geojit + "입니다.");

    }
    */

    public static void main(String[] args) {
        int i;
        double d;
        byte b;

        i = 7 / 4;
        System.out.println(i);
        d = 7 / 4;
        System.out.println(d);
        d = 7 / (double) 4;
        System.out.println(d);

        i = 300;
        if (i < -128 || i > 127)
            System.out.println("byte 타입으로 변환할 수 없습니다.");
        else
            b = (byte) i;

    }

}
