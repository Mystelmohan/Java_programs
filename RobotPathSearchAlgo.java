import java.util.Scanner;

public class RobotPathSearchAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(ways(m, n, 0, 0));
        sc.close();
    }

    static int ways(int m, int n, int st1, int st2) {
        if (st1 == m - 1 && st2 == n - 1) {
            return 1;
        }
        if (st1 >= m || st2 >= n) {
            return 0;
        }
        return ways(m, n, st1 + 1, st2) + ways(m, n, st1, st2 + 1);
    }
}
