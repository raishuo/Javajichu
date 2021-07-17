import java.util.Scanner;

public class 浮点数 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int foot = ac.nextInt();
        double inch = ac.nextDouble();
        System.out.println((int)(((foot + inch) / 12.0) * 0.3048));
    }
}