package DynamicAlgorithims;

public class Knapsackproblem {

	//Knapsack problem: It is a problem in combinatorial optimization where one has to maximize the value of items included in a knapsack of limited weight capacity. 
	//It has multiple variations such as 0/1 knapsack and unbounded knapsack.
	
	public int knapsack(int[] wt, int[] val, int W) {
		   int n = wt.length;
		   int[][] dp = new int[n + 1][W + 1];
		   
		   for (int i = 1; i <= n; i++) {
		      for (int j = 1; j <= W; j++) {
		         if (wt[i - 1] <= j) {
		            dp[i][j] = Math.max(dp[i - 1][j], val[i - 1] + dp[i - 1][j - wt[i - 1]]);
		         } else {
		            dp[i][j] = dp[i - 1][j];
		         }
		      }
		   }
		   return dp[n][W];
		}
	
}
