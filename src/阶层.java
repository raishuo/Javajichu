import java.util.Scanner;

public class 阶层 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        int num = 1;
        System.out.println("请输入需要做阶层的数：");
        int end = in.nextInt();
        for (number = 1; number <= end; number++) {
            num = number * num;
        }
        System.out.println(num);
    }
}
