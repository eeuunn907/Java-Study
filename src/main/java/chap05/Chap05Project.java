package chap05;

import java.util.Scanner;

public class Chap05Project {
    public static void main(String[] args) {
        int numOfStudents = 0;
        int[] scores;
        Scanner in = new Scanner(System.in);

        numOfStudents = in.nextInt();
        scores = new int[numOfStudents];

        System.out.println(numOfStudents + "명의 학생 성적을 입력하세요");
        for (int i = 0; i < numOfStudents; i++) {
            scores[i] = in.nextInt();
        }
        System.out.println(numOfStudents + "명의 학생 성적은 다음과 같습니다");
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println(scores[i]);
            if (90 <= scores[i]) {
                System.out.println((i + 1) + "번 학생의 등급은 A입니다.");
            } else if (80 <= scores[i]) {
                System.out.println((i + 1) + "번 학생의 등급은 B입니다.");
            } else if (70 <= scores[i]) {
                System.out.println((i + 1) + "번 학생의 등급은 C입니다.");
            } else {
                System.out.println((i + 1) + "번 학생의 등급은 D입니다.");
            }
        }

    }
}

