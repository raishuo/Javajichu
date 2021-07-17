import java.util.Scanner;

public class 输入整数有多少位数 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = in.nextInt(), sum = 0;
        while (number > 0){
            number = number/10;
            sum = sum + 1;
        }
        System.out.println(sum);
    }
}
