import java.util.Arrays;

/* 
 * 0-1 knapsack
 * unbounded knapsack
 * fibonnaci
 * LCS
 * LIS
 * kadane's algorithm
 * matrix chain multiplication
 * DP on trees
 * DP on grid
 * others 
 */

public class DP {
	// 1. learn to print path
	// 2. implement recursive solution as well of every problem
	public static void main(String[] args) {
		// int[][] mine = { { 2, 6, 0, 5 }, { 0, 7, 5, 2 }, { 3, 0, 3, 7 }, { 8,
		// 0, 2, 3 } };
		// System.out.println(minCostPathTabulated(costs));
		// System.out.println(goldMineTabulated(mine));
		// System.out.println(countBoardPath(10));
		// System.out.println(rodCuttingProblem(new int[] { 0, 3, 5, 6, 15, 10,
		// 25, 12, 24 }));
		// System.out.println(coinChangeCombination(new int[] { 2, 3, 5, 6
		// },10));
		// System.out.println(coinChangePermuatations(new int[] { 2, 3, 5, 6 },
		// 10));
		// coinChangePermutationsRecursion(new int[] { 2, 3, 5, 6 }, 10, "", 0);
		// coinChangeCombinationsRecursion(new int[] { 2, 3, 5, 6 }, 7, "", 0,
		// 0);
		// int[][] matrix = { { 1, 0, 1, 0, 0, 1 }, { 1, 0, 1, 1, 1, 1 }, { 1,
		// 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 0, 0 },
		// { 1, 1, 1, 1, 1, 1 }, { 0, 0, 1, 1, 1, 0 } };
		// System.out.println(maxSizeSquareSubMatrixTabulated(matrix));
		// LIS_Tabulated(new int[] { 10, 22, 9, 33, 21, 50, 41, 60, 80, 1 });
		// LBS_Tabulated(new int[] { 10, 22, 9, 33, 21, 50, 41, 60, 80, 1 });
		// System.out.println(matrixChainMultiplication(new int[] { 10, 20, 30,
		// 40, 50, 60 }));
	}

	// Fibonacci TABULATED
	// count board path TABULATED
	private static int countBoardPath(int d) {
		int ways[] = new int[d + 1];
		ways[d] = 1;
		for (int i = d - 1; i >= 0; i--) {
			for (int dice = 1; dice <= 6; dice++) {
				if (dice + i <= d) {
					ways[i] += ways[i + dice];
				}
			}
		}
		return ways[1];
	}

	// maze-path TABULATED
	private static int mazePathTabulated(int[][] matrix) {
		int result[][] = new int[matrix.length][matrix.length];
		result[matrix.length - 1][matrix.length - 1] = 1;
		for (int i = result.length - 1; i >= 0; i--) {
			for (int j = result.length - 1; j >= 0; j--) {
				if (i == result.length - 1 && j == result.length - 1) {
					result[i][j] = 1;
				} else if (i == result.length - 1) {
					result[i][j] = result[i][j + 1];
				} else if (j == result.length - 1) {
					result[i][j] = result[i + 1][j];
				} else {
					result[i][j] = result[i][j + 1] + result[i + 1][j];
				}
			}

		}
		return result[0][0];
	}

	// YAY!!!!! I DID IT IN ONE GO
	// BELIEVE IN YOURSELF
	// DEKHA APNE DIMAAG KO, AB KABHI KUDH PAR DOUBT MAT KRIO
	// !!!! NEVER EVER !!!!

	// min-cost-path TABULATED
	private static int minCostPathTabulated(int[][] costs) {
		int minCost[][] = new int[costs.length][costs.length];
		minCost[costs.length - 1][costs.length - 1] = costs[costs.length - 1][costs.length - 1];
		for (int i = minCost.length - 1; i >= 0; i--) {
			for (int j = minCost.length - 1; j >= 0; j--) {
				if (i == minCost.length - 1 && j == minCost.length - 1) {
					minCost[i][j] = costs[costs.length - 1][costs.length - 1];
				} else if (i == minCost.length - 1) {
					minCost[i][j] = costs[i][j] + minCost[i][j + 1];
				} else if (j == minCost.length - 1) {
					minCost[i][j] = costs[i][j] + minCost[i + 1][j];
				} else {
					minCost[i][j] = costs[i][j] + Math.min(minCost[i][j + 1], minCost[i + 1][j]);
				}
			}
		}
		return minCost[0][0];
	}

	// gold mine TABULATED
	// work only if matrix is a square matrix
	private static int goldMineTabulated(int[][] mine) {
		int path[][] = new int[mine.length][mine.length];

		for (int i = 0; i < mine.length; i++) {
			path[i][path.length - 1] = mine[i][mine.length - 1];
		}
		for (int j = mine.length - 2; j >= 0; j--) {
			for (int i = mine.length - 1; i >= 0; i--) {
				if (i == 0) {
					path[i][j] = mine[i][j] + Math.max(path[i + 1][j + 1], path[i][j + 1]);
				} else if (i == mine.length - 1) {
					path[i][j] = mine[i][j] + Math.max(path[i - 1][j + 1], path[i][j + 1]);
				} else {
					path[i][j] = mine[i][j]
							+ Math.max(path[i + 1][j + 1], Math.max(path[i - 1][j + 1], path[i][j + 1]));
				}
			}
		}
		int maxResult = Integer.MIN_VALUE;
		for (int k = 0; k < path.length; k++) {
			if (maxResult < path[k][0]) {
				maxResult = Math.max(maxResult, path[k][0]);
			}
		}
		return maxResult;
	}

	// Rod cutting problem TABULATED
	private static int rodCuttingProblem(int[] prices) {
		int[] maxProfit = new int[prices.length];
		maxProfit[0] = 0;
		maxProfit[1] = prices[1];
		for (int i = 2; i < prices.length; i++) {
			maxProfit[i] = prices[i];
			int left = 1;
			int right = i - 1;
			while (left <= right) {
				if (maxProfit[left] + maxProfit[right] > maxProfit[i]) {
					maxProfit[i] = maxProfit[left] + maxProfit[right];
				}
				left++;
				right--;
			}
		}
		System.out.println(Arrays.toString(maxProfit));
		return maxProfit[maxProfit.length - 1];
	}

	// coin change combinations recursion
	private static void coinChangeCombinationsRecursion(int[] coins, int target, String asf, int sum, int li) {
		if (sum == target) {
			System.out.println(asf);
			return;
		}
		if (sum > target) {
			return;
		}
		for (int i = li; i < coins.length; i++) {
			coinChangeCombinationsRecursion(coins, target, asf + coins[i], sum + coins[i], i);
		}
	}

	// coin change TABULATED (only combinations)
	private static int coinChangeCombination(int[] coins, int target) {
		int[] ways = new int[target + 1];
		ways[0] = 1;
		for (int coin = 0; coin < coins.length; coin++) {
			for (int way = coins[coin]; way < ways.length; way++) {
				ways[way] = ways[way] + ways[way - coins[coin]];
			}
		}
		System.out.println(Arrays.toString(ways));
		return ways[target];

	}

	// coin change permutations recursion
	private static void coinChangePermutationsRecursion(int[] coins, int target, String asf, int sum) {
		if (sum == target) {
			System.out.println(asf);
			return;
		}
		if (sum > target) {
			return;
		}
		for (int i = 0; i < coins.length; i++) {
			coinChangePermutationsRecursion(coins, target, asf + coins[i], sum + coins[i]);
		}
	}

	// coin change TABULATED (only permutations)
	private static int coinChangePermuatations(int[] coins, int target) {
		int[] ways = new int[target + 1];
		ways[0] = 1;
		for (int way = 1; way < ways.length; way++) {
			for (int coin = 0; coin < coins.length; coin++) {
				if (way - coins[coin] >= 0)
					ways[way] = ways[way] + ways[way - coins[coin]];
			}
		}
		System.out.println(Arrays.toString(ways));
		return ways[target];
	}

	// HAVE TRUST IN YOURSELF
	// U KNOW U DID IT !! WITHOUT ANY HELP, ONLY BY LISTENING
	// U KNOW YOU WILL

	// max size square submatrix of all 1s TABULATED
	private static int maxSizeSquareSubMatrixTabulated(int[][] matrix) {
		int rows = matrix.length;
		int columns = matrix[0].length;
		int[][] result = new int[rows][columns];
		for (int row = 0; row < result.length; row++) {
			for (int column = 0; column < result.length; column++) {
				if (row == rows - 1) {
					result[row][column] = matrix[row][column];
				} else if (column == columns - 1) {
					result[row][column] = matrix[row][column];
				} else if (matrix[row][column] == 0) {
					result[row][column] = 0;
				} else {
					result[row][column] = -1;
				}
			}
		}

		int maxSize = 0;
		for (int column = columns - 2; column >= 0; column--) {
			for (int row = rows - 2; row >= 0; row--) {
				if (result[row][column] == -1) {
					result[row][column] = 1 + Math.min(result[row][column + 1],
							Math.min(result[row + 1][column + 1], result[row + 1][column]));
					if (maxSize < result[row][column]) {
						maxSize = result[row][column];
					}
				}

			}
		}

		return maxSize;
	}

	// longest increasing subsequence TABULATED
	private static void LIS_Tabulated(int[] arr) {
		int[] lis = new int[arr.length];
		String[] plis = new String[arr.length];
		lis[0] = 1;
		plis[0] = arr[0] + "";
		int omax = 0;
		String opath = "";
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j <= i - 1; j++) {
				if (arr[j] < arr[i]) {
					if (lis[j] > lis[i]) {
						lis[i] = lis[j];
						plis[i] = plis[j];
					}
				}
			}
			lis[i] += 1;
			plis[i] = plis[i] + " " + arr[i];
			if (lis[i] > omax) {
				omax = lis[i];
				opath = plis[i];

			}

		}
		System.out.println(opath);
		System.out.println(omax);
		System.out.println(Arrays.toString(plis));
	}

	// longest bitonic subsequence TABULATED
	private static void LBS_Tabulated(int[] arr) {
		int[] lis = new int[arr.length];
		String[] plis = new String[arr.length];
		lis[0] = 1;
		plis[0] = arr[0] + "";

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j <= i - 1; j++) {
				if (arr[j] < arr[i]) {
					if (lis[j] > lis[i]) {
						lis[i] = lis[j];
						plis[i] = plis[j];
					}
				}
			}
			lis[i] += 1;
			plis[i] = plis[i] + " " + arr[i];

		}
		System.out.println(Arrays.toString(lis));
		System.out.println(Arrays.toString(plis));
		System.out.println();
		int max = 0;
		String path = " ";
		int[] lds = new int[arr.length];
		String[] plds = new String[arr.length];
		lds[lds.length - 1] = 1;
		plds[plds.length - 1] = arr[arr.length - 1] + "";

		for (int i = arr.length - 2; i >= 0; i--) {
			for (int j = arr.length - 1; j >= i + 1; j--) {
				if (arr[j] < arr[i]) {
					if (lds[j] > lds[i]) {
						lds[i] = lds[j];
						plds[i] = plds[j];
					}
				}
			}
			lds[i] += 1;
			plds[i] = arr[i] + " " + plds[i];
			if (max < lds[i] + lis[i] - 1) {
				max = lds[i] + lis[i] - 1;
				path = plis[i] + "|" + plds[i];
			}

		}
		System.out.println(max);
		System.out.println(path);
		System.out.println(Arrays.toString(lds));
		System.out.println(Arrays.toString(plds));
	}

	// matrix chain multiplication TABULATED
	private static int matrixChainMultiplication(int dims[]) {
		int[][] mcm = new int[dims.length][dims.length];

		for (int gap = 1; gap < dims.length; gap++) {
			int i = 0;
			int j = gap + i;
			while (j < dims.length) {
				if (gap == 1) {
					mcm[i][j] = 0;
				} else {
					int min = Integer.MAX_VALUE;

					for (int cp = i + 1; cp <= j - 1; cp++) {
						int fp = mcm[i][cp];
						int sp = mcm[cp][j];
						int factor = dims[i] * dims[cp] * dims[j];

						int totalCost = fp + sp + factor;
						min = Math.min(min, totalCost);

						mcm[i][j] = min;
					}
				}
				i++;
				j++;
			}

		}
		for (int i = 0; i < mcm.length; i++) {
			System.out.println(Arrays.toString(mcm[i]));
		}
		return mcm[0][mcm.length - 1];
	}
}
