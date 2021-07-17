import java.util.Scanner;

public class 输入输出 {
    //  main是程序的入口，代码从main开始
    public static void main(String[] args){
        System.out.println("HelloWorld");
        Scanner in = new Scanner(System.in);
        int price, amount;
        amount = in.nextInt();
        System.out.print("输入被减数：");
        price = in.nextInt();
        System.out.println(amount / price);
    }
}