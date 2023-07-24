package chap04;
class Printer {
    private int numOfPaper = 10;

    public void print(int amount) {
        if (amount < numOfPaper) {
            numOfPaper -= amount;
            System.out.println(amount + "장 출력했습니다 " + numOfPaper + "장 남았습니다");
        }
        else if(numOfPaper > 0 && numOfPaper < amount)
        {
            numOfPaper -= amount;
            amount += numOfPaper;

            System.out.printf("모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다", numOfPaper*-1,amount);
        }
        else{
            System.out.printf("용지가 없습니다");
        }
    }

    class PrinterTest2 {

    }
}


public class PrinterTest {
    public static void main(String[] args) {
        Printer demoPrinter = new Printer();

        demoPrinter.print(2);
        demoPrinter.print(20);
        demoPrinter.print(10);
    }
}
