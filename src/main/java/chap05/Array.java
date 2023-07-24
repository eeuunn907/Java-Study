package chap05;


import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score[] = new int[5];
        int sum = 0;

        for(int i =0; i < score.length; i++){
            score[i] =in.nextInt();
            sum += score[i];
        }
        System.out.println("평균 : " + sum /5.0);
    }
}
