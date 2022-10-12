import java.util.Scanner;
//import java.util.ArrayList;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {

        System.out.println("EVEN ODD CHECK \nenter number. enter 0 to end.");
        while (true) {
            int i1 = s.nextInt();
            if (i1 ==0) {
                System.out.println("exiting method...");
                break;
            }
            if (i1 % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
            System.out.println("next...");
        }
    }

    public static void mean() {
        String iList = "";
        int iNum = 0;
        int iCount = 0;
        System.out.println("MEAN CALCULATOR \nenter number. enter 0 to end.");
        while (true) {
            int i2 = s.nextInt();
            if (i2 == 0) {
                System.out.println("Exiting method...");
                break;
            }
            iNum += i2;
            double dNum = iNum;
            iCount++;
            double dCount = iCount;
            double iMean = dNum / dCount;
            if (iCount > 1) {
                iList = (String) iList + ", " + i2;
            } else {
                iList = "" + i2;
            }
            System.out.println(iList);
            System.out.println("Mean = " + iMean);
        }
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
