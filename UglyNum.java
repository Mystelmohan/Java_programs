import java.util.Scanner;

public class UglyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int count = 1;
        int i = 1;

        while (n > count) {
            i++;
            if (isUgly(i)) {
                count++;
            }
        }

        System.out.println(i); 
        sc.close();
    }

    static boolean isUgly(int num) {
        num = maxDivide(num, 2);
        num = maxDivide(num, 3);
        num = maxDivide(num, 5);
        return num == 1;
    }
    static int maxDivide(int a, int b) {
        while (a % b == 0)
            a = a / b;
        return a;
    }
}
