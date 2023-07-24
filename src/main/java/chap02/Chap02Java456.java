package chap02;


public class Chap02Java456 {
    /*
    public static void main(String[] args){
        int i = 97;
        String s = "Java";
        double f = 3.14;

        System.out.printf("%d\n",i);
        System.out.printf("%o\n",i);
        System.out.printf("%x\n",i);
        System.out.printf("%c\n",i);
        System.out.printf("%5d\n",i);
        System.out.printf("%05d\n",i);
        System.out.printf("%s\n",s);
        System.out.printf("%5s\n",s);
        System.out.printf("%-5s\n",s);
        System.out.printf("%f\n",f);
        System.out.printf("%e\n",f);
        System.out.printf("%4.1f\n",f);
        System.out.printf("%04.1f\n",f);
        System.out.printf("%-4.1f\n",f);
    }
     */
    /*
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        System.out.println(x + "출력");
    }

     */

    /*
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
    }

     */

    /*
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        System.out.printf("%d * %d은 %d입니다\n", x, y, x * y);
    }

     */

    public static void main(String[] args) {

        int x = 0, y = 1;
        System.out.println(x < 1 || y-- < 1);
        System.out.println("x= " + x + ", y= " + y);


        x = 0;
        y = 1;
        System.out.println(x < 1 | y-- < 1);
        System.out.println("x= " + x + ", y= " + y);
    }
}
