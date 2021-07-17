import java.util.Scanner;

public class 判断素数 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.print("请输入n的值：");
        int n = ac.nextInt();
        for (int i = 2; i <= n; i++) {
            boolean judgment = true;
            for (int j = 2; j < i; j++)
                if (i % j == 0) {
                    judgment = false;
                    break;
                }
            if (judgment)
                System.out.println(i);
        }
    }
}