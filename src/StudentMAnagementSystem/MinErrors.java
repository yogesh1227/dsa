//package StudentMAnagementSystem;
//
//public class MinErrors {
//
//    public int solve(String s, int x, int y) {
//        int n = s.length();
//        if (n == 0) {
//            return 0;
//        }
//
//        int[][] dp = new int[n + 1][n + 1];
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= n; j++) {
//                dp[i][j] = Integer.MAX_VALUE;
//            }
//        }
//        dp[0][0] = 0;
//
//        for (int i = 1; i <= n; i++) {
//            if (s.charAt(i - 1) == '0' || s.charAt(i - 1) == '!') {
//                for (int j = 0; j <= i; j++) {
//                    if (dp[i - 1][j] < Integer.MAX_VALUE) {
//                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + j * y);
//                    }
//                }
//            }
//            if (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '!') {
//                for (int j = 1; j < i; j++) {
//                    if (dp[i - 1][j - 1] < Integer.MAX_VALUE) {
//                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1] + x * (i - j));
//                    }
//                }
//            }
//        }
//
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i <= n; i++) {
//            min = Math.min(min, dp[n][i]);
//        }
//
//        return min;
//    }
//
//    public static void main(String[] args) {
//        MinErrors minErrors = new MinErrors();
//        String errorString = "101!1";
//        int x = 2, y = 3;
//        System.out.println(minErrors.solve(errorString, x, y)); // Expected output: 8
//    }
//}
