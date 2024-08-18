import java.util.Scanner;

class Solution {
    public long maxEnergyBoost(int[] A, int[] B) {
        int n = A.length;
        long[][] dp = new long[n + 5][2];
        for (int i = n - 1; i >= 0; i--) {
            dp[i][0] = Math.max(B[i] + dp[i + 1][0], dp[i + 1][1]);
            dp[i][1] = Math.max(A[i] + dp[i + 1][1], dp[i + 1][0]);
        }
        return Math.max(dp[0][0], dp[0][1]);
    }
}

public class MaxEnergy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] A = new int[n];
            int[] B = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                B[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            System.out.println(obj.maxEnergyBoost(A, B));
            t--;
        }
        sc.close();
    }
}