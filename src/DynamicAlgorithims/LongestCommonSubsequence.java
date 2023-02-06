package DynamicAlgorithims;

public class LongestCommonSubsequence {

	//Longest Common Subsequence (LCS) : It is a problem of finding the longest subsequence that is common to two or more sequences.
	//It is widely used in areas such as DNA sequencing, document revision control systems, and spell checkers.
	
	public int LCS(String X, String Y) {
		   int m = X.length();
		   int n = Y.length();
		   int[][] dp = new int[m + 1][n + 1];
		   
		   for (int i = 1; i <= m; i++) {
		      for (int j = 1; j <= n; j++) {
		         if (X.charAt(i - 1) == Y.charAt(j - 1)) {
		            dp[i][j] = dp[i - 1][j - 1] + 1;
		         } else {
		            dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
		         }
		      }
		   }
		   return dp[m][n];
		}
}
