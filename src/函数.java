import java.util.Scanner;

public class 函数 {
    //  判断是否为素数
    public static boolean isprimeNumbers(int i) {
        boolean judgment = true;
        for (int j = 2; j < i; j++)
            if (i % j == 0) {
                judgment = false;
                break;
            }
        return judgment;
    }

    //  遍历1-n
    public static void traverse(int n){
        StringBuilder number = new StringBuilder("素数");
        for (int i = 2; i <= n; i++)
            if (isprimeNumbers(i)) {
                 number.append(",").append(i);
            }
        System.out.println(number);
    }

    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.print("请输入n的值：");
        int n = ac.nextInt();
        traverse(n);
    }
}
