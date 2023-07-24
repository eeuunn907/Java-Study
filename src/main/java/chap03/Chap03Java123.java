package chap03;

public class Chap03Java123 {
    /*
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("숫자를 입력하세요");

        int number = in.nextInt();

        System.out.println((number % 2 == 0) ? "짝수" : "홀수");

        System.out.println("종료");
    }
     */
    /*
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String grade = " ";
        System.out.println("점수를 입력하세요");

        int score = in.nextInt();

        if (score >= 90)
            grade = "A";
        else if (score >= 80 && score <= 89)
            grade = "B";
        else if (score >= 70 && score <= 79)
            grade = "C";
        else grade = "D";

        System.out.println("당신의 학점은" + grade);
    }

     */
    /*
    public static void main(String[] args) {
        int a = 2;
        int b = 1;

        while (a <= 9) {
            while(b <= 9){
                System.out.println(a + "X" + b + "=" + (a * b));
                b++;
            }
            b=1;
            a++;
        }
    }

     */

    public static void main(String[] args){
        for(int i = 2; i <10;i++)
        {
            for(int j = 1;j<10;j++)
            {
                System.out.printf("%4d",i*j);
            }
            System.out.printf("\n");
        }
    }
}
