import java.util.Scanner;

public class A1113362_0317_1 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.println("請輸入n值：");
        n = sc.nextInt();
        System.out.println("請輸入m值：");
        m = sc.nextInt();

        int[][] a = new int[n][m];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int k = i * j;
                a[i - 1][j - 1] = k;
            }
        }

        for (int[] r : a) {
            for (int sr : r) {
                System.out.printf("%d\t", sr);
            }
            System.out.printf("\n");
        }
    }
}