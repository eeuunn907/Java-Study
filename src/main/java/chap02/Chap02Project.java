package chap02;


import java.util.Scanner;
public class Chap02Project {
    /*
    public static void main(String[] args) {
        double w, h, area;
        Scanner in = new Scanner(System.in);


        System.out.print("직사각형의 가로의 길이를 입력하세요");
        w = in.nextDouble();
        System.out.print("직사각형의 세로의 길이를 입력하세요");
        h = in.nexDouble();

        area = w*h;
        System.out.printf("%f * %f = %f 입니다\n", w, h, area);
    }

     */
    public static void main(String[] args){
        int num;
        Scanner in= new Scanner(System.in);

        System.out.print("정수를 입력하세요");
        num = in.nextInt();
        System.out.println((num % 2 == 0) ? "짝수" : "홀수");

    }
}
