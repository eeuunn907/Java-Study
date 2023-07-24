package chap03;

import java.util.Scanner;
public class Chap03Project {
    /*
    public static void main(String[] args){
        int result=1;
        int n;
        System.out.print("숫자를 입력하세요");

        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        while(n>0){
            result*=n;
            n--;
        }
        System.out.printf("%d",result);
    }

     */

    /*
    public static void main(String[] args){
        int result=1; // result = 1;
        int n;
//        System.out.println("숫자를 입력하세요");
//        Scanner in = new Scanner(System.in);
//        n = in.nextInt();
        result = factorial(3,5);

        System.out.println(result);
    }
    public static int factorial(int x){
        int r = 1;
        while(x >0){
            r *= x;
            x--;
        }
        return r;
    }
    public static int factorial(int x, int y){
        int r =1;
        if(x > y)
        {
            while(x >=y)
            {
                r *= x;
                x--;
            }
        }
        else if (x<y) {
            while (y>=x){
                r *= y;
                y--;
            }
        }
        return r;
    }

     */

    /*
    프로그래밍 문제 01
    public static void main(String[] args){
        int num;

        System.out.print("정수를 입력하세요");
        Scanner in = new Scanner(System.in);

        num = in.nextInt();

        if(num >= 19)
        {
            System.out.print("성년");
        }
        else System.out.print("미성년");
    }
     */
    /*
    public static void main(String[] args){
        int rank;
        System.out.println("등수를 입력하세요");

        Scanner in = new Scanner(System.in);
        rank = in.nextInt();

        switch(rank){
            case 1:
                System.out.print("아주 잘했습니다");
                break;
            case 2,3:
                System.out.print("잘했습니다");
                break;
            case 4,5,6:
                System.out.print("보통입니다");
                break;
            default:
                System.out.print("노력해야겠습니다");
        }
    }

     */
    /*
    public static void main(String[] args){
        int num=0;
        int sum =0;
        do {
            System.out.print("양의 정수를 입력하세요");
            Scanner in = new Scanner(System.in);
            num = in.nextInt();

            if(num % 2 == 0)
            {
                sum += num;
            }

        }while(num > 0);

        System.out.println(sum);
    }

     */

    /*
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }

     */




}
