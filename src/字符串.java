import java.util.Scanner;

public class 字符串 {

    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        String a = "fasdSDasdfasfasd";
        String b = "fasd";
        String d = ac.next();
        System.out.print("比较字符串的大小ab:");
        System.out.println(b.compareTo(a));     //比较字符串的大小
        System.out.print("得出长度a:");
        System.out.println(a.length());     //得出长度
        System.out.print("输出a,位置3往后的字符串:");
        System.out.println(a.substring(3));     //输出位置3往后的字符串
        System.out.print("a字符串0-2位置上的数");
        System.out.println(a.substring(0,3));      //输入从0到2的字符串
        System.out.print("判断a在字符串a第一次出现的位置");
        int position = a.indexOf("a");      //判断字符在字符串第一次出现的位置
        System.out.print("得出长度a");
        System.out.println(a.indexOf("a", position + 1));    //判断字符在字符串第一次出现的位置后+1往后寻找
        System.out.print("得出长度a");
        System.out.println(a.startsWith(d));    //判断b是否以在s前面
        System.out.print("得出长度a");
        System.out.println(a.endsWith(d));    //判断b是否以在s后面
        System.out.print("得出长度a");
        String c = "  asd  ";
        System.out.print("得出长度a");
        System.out.println(c.trim());    //去掉字符串两边的空格
        System.out.print("得出长度a");
        System.out.println(c.toLowerCase());    //小写字符串
        System.out.print("得出长度a");
        System.out.println(c.toUpperCase());    //大写字符串
        System.out.print("得出长度a");
        System.out.println(a.replace("a" , "@"));    //大写字符串
    }
}
