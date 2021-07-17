import java.util.Scanner;

public class 循环判断 {
    public static void main(String[] args) {
        int balance = 0;
        Scanner ac = new Scanner(System.in);
        while (true) {
            System.out.println("请投币：");
            int amount = ac.nextInt();
            balance = balance + amount;
            System.out.println("已投：" + balance + "元");
            if (balance >= 10) {
                System.out.println("*************");
                System.out.println("*    CJZX   *");
                System.out.println("*   票价十元  *");
                System.out.println("*************");
                System.out.println("找零：" + (balance - 10));
                break;
            }
        }
    }
}