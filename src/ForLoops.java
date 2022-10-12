import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        System.out.println("FOR SUM\nPlease enter number to sum...");
        int i1 = s.nextInt();
        int iSum = 0;
        for (int i = 0;i <= i1;i++) {
            iSum += i;
            System.out.println(iSum);
        }
    }

    public static void rangeSum() {
        System.out.println("RANGE SUM\nPlease enter two numbers to find their range sum.\nFirst?");
        int i1 = s.nextInt();
        System.out.println("Second?");
        int i2 = s.nextInt();
        int iSum = 0;
        if (i1 < i2) {
            for (int i = i1;i<=i2;i++) {
                iSum += i;
                System.out.println(iSum);
            }
        } else {
            for (int i = i2;i<=i1;i++) {
                iSum += i;
                System.out.println(iSum);
            }
        }
    }

    public static void factorial() {
        System.out.println("FACTORIAL CALCULATOR\nPlease enter number to factorial...");
        int i1 = s.nextInt();
        int iFac = 1;
        for (int i = 1;i <= i1;i++) {
            iFac = iFac * i;
            System.out.println(iFac);
        }
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
