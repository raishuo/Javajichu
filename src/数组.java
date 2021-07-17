public class 数组 {
    public static void main(String[] args) {

        int[] number = new int[11];
        int i;
        for (i = 0; i <= 10; i++) {
            number[i] = i;
        }
        for (i = 0; i <= 9; i++)
            System.out.println(number[i]);

        int[][] numbers = new int[3][4];
        numbers[1][2] = 2;
        System.out.println(numbers[1][2]);
    }
}