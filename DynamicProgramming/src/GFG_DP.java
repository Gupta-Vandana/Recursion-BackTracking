import java.util.Arrays;

public class GFG_DP {

	public static void main(String[] args) {
		// System.out.println(catalanNumberRecursive(8));
		// System.out.println(catalanNumberTabulization(8));
		// System.out.println(stirlingNumber(3, 2));
		// System.out.println(binomialCoefficientRecursive(0, 3));
		// System.out.println(binomialCoefficientTabulization(12, 10));
		// System.out.println(permutationCoefficientRecursive(10, 3));
		// System.out.println(permutationCoefficientTabulaization(8, 3));
		// tilingProblemRecursive(3, 2, "");
		// tilingProblemTabulated(3, 2);
		// zero_oneKnapsackRecursive(7, new int[] { 2, 5, 1, 3, 4 }, new int[] {
		// 15, 14, 10, 45, 30 }, 0, 0, "", 0);
		// System.out.println(subSetTargetRecursive(new int[] { 3, 34, 4, 12, 5,
		// 2 }, 9, 5));
		// System.out.println(subSetTargetTabulated(new int[] { 3, 34, 4, 12, 5,
		// 2 }, 10));
		// System.out.println(newmanWilliamsRecursive(7));
		// System.out.println(newmanWilliamstabulated(7));
		// for (int i = 0; i < 10; i++) {
		// for (int j = 0; j < 3; j++) {
		// System.out.print(nCrPRecursive(i, j, 13));
		// System.out.print(",");
		// }
		// System.out.println();
		// }
		// System.out.println(nCrPTabulated(10, 2, 13));
		// System.out.println(" ".length());
		System.out.println(longestCommonSubsequenceRecursive("AGGTAB","GXTXAYB"));
	}

	// EASY
	// 1.ugly numbers
	// 2.fibonacci numbers
	// 3.nth Catalan Number recursive
	private static int catalanNumberRecursive(int n) {
		int res = 0;

		if (n == 0 || n == 1) {
			return 1;
		}
		for (int i = 0; i < n; i++) {
			int c1 = catalanNumberRecursive(i);
			int c2 = catalanNumberRecursive(n - i - 1);
			res = res + (c1 * c2);
		}
		return res;
	}

	// 3.nth Catalan Number tabulaization
	private static int catalanNumberTabulization(int n) {
		int[] qb = new int[n + 1];
		qb[0] = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				qb[i] += qb[j] * qb[i - j - 1];
			}
		}
		System.out.println(Arrays.toString(qb));
		return qb[n];
	}

	// Stirling Number of the Second Kind
	private static int stirlingNumber(int n, int k) {
		if (n == 0 || k == 0 || k > n)
			return 0;
		if (k == 1 || k == n)
			return 1;

		return stirlingNumber(n - 1, k - 1) + k * stirlingNumber(n - 1, k);

	}

	// 4.Bell Numbers (Number of ways to Partition a Set) recursive
	// 5.Binomial Coefficient recursive
	private static int binomialCoefficientRecursive(int n, int k) {
		if (k == n || k == 0) {
			return 1;
		}
		if (n < k) {
			return 0;
		}
		return binomialCoefficientRecursive(n - 1, k - 1) + binomialCoefficientRecursive(n - 1, k);
	}

	// 5.Binomial Coefficient tabulaization
	private static int binomialCoefficientTabulization(int n, int k) {
		int[][] matrix = new int[n + 1][k + 1];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (i < j) {
					matrix[i][j] = 0;
				} else if (j == i || j == 0) {
					matrix[i][j] = 1;
				} else {
					matrix[i][j] = matrix[i - 1][j] + matrix[i - 1][j - 1];
				}
			}
		}
		// for (int i = 0; i < matrix.length; i++) {
		// System.out.println(Arrays.toString(matrix[i]));
		// }
		return matrix[n][k];
	}

	// 6.Permutation Coefficient recursive
	private static int permutationCoefficientRecursive(int n, int k) {
		if (k > n) {
			return 0;
		}
		if (k == 0) {
			return 1;
		}
		return permutationCoefficientRecursive(n - 1, k) + k * permutationCoefficientRecursive(n - 1, k - 1);
	}

	// 6.Permutation Coefficient tabulaization
	private static int permutationCoefficientTabulaization(int n, int k) {
		int[][] matrix = new int[n + 1][k + 1];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (j > i) {
					matrix[i][j] = 0;
				} else if (j == 0) {
					matrix[i][j] = 1;
				} else {
					matrix[i][j] = matrix[i - 1][j] + j * matrix[i - 1][j - 1];
				}
			}
		}
		// for (int i = 0; i < matrix.length; i++) {
		// System.out.println(Arrays.toString(matrix[i]));
		// }
		return matrix[n][k];
	}

	// 7.Tiling Problem (floor size n x m,tile size 1 x m)
	private static void tilingProblemRecursive(int n, int m, String asf) {
		if (n == 0) {
			System.out.println(asf);
			return;
		}
		if (n < 0) {
			return;
		}
		tilingProblemRecursive(n - 1, m, asf + "v");
		tilingProblemRecursive(n - m, m, asf + m + "xh");
	}

	// 7.Tiling Problem tabulated
	private static void tilingProblemTabulated(int n, int m) {
		int[] result = new int[n + 1];
		result[0] = 0;
		result[1] = 1;
		for (int i = 2; i <= n; i++) {
			if (i <= m)
				result[i] = i;
			else
				result[i] = result[i - 1] + result[i - m];
		}
		System.out.println(Arrays.toString(result));
		System.out.println(result[n]);

	}

	// 8.Gold mine
	// 9.coin change
	// 10.Friends Pairing Problem
	// 11.Subset Sum Problem Recursive
	private static boolean subSetTargetRecursive(int[] arr, int target, int vidx) {
		if (vidx == 0) {
			if (target == 0) {
				return true;
			} else {
				return false;
			}
		}
		return subSetTargetRecursive(arr, target - arr[vidx], vidx - 1) || subSetTargetRecursive(arr, target, vidx - 1);
	}

	// 11.Subset Sum Problem tabulated
	// WRONG
	private static boolean subSetTargetTabulated(int[] arr, int target) {
		boolean[][] matrix = new boolean[arr.length + 1][target + 1];

		return matrix[arr.length][target];
	}

	// 12.
	// 13.
	// 14.
	// 15.
	// 16.Compute nCr % p recursive
	private static int nCrPRecursive(int n, int r, int p) {
		if (r == n || r == 0) {
			return 1;
		}
		if (n < r) {
			return 0;
		}
		return (nCrPRecursive(n - 1, r - 1, p) % p + nCrPRecursive(n - 1, r, p) % p) % p;
	}

	// 16.Compute nCr % p tabulated
	private static int nCrPTabulated(int n, int r, int p) {
		int[][] result = new int[n + 1][r + 1];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				if (i == j || j == 0) {
					result[i][j] = 1;
				} else if (i < j) {
					result[i][j] = 0;
				} else {
					result[i][j] = (result[i - 1][j - 1] % p + result[i - 1][j] % p) % p;
				}
			}
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(Arrays.toString(result[i]));
		}
		return result[n][r];

	}

	// 17.Choice of Area
	// 21.Newman–Shanks–Williams prime recursive
	private static int newmanWilliamsRecursive(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}
		return 2 * newmanWilliamsRecursive(n - 1) + newmanWilliamsRecursive(n - 2);
	}

	// 21.Newman–Shanks–Williams prime tabulated
	private static int newmanWilliamstabulated(int n) {
		int[] result = new int[n + 1];
		result[0] = 1;
		result[1] = 1;
		for (int i = 2; i < result.length; i++) {
			result[i] = 2 * result[i - 1] + result[i - 2];
		}
		System.out.println(Arrays.toString(result));
		return result[result.length - 1];
	}

	// 22.Assembly Line Scheduling recursive
	// 22.Assembly Line Scheduling tabulated
	// 23.
	// 24.
	// 25.Newman-Conway Sequence recursive
	private static int NewmanConwayRecursive(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return NewmanConwayRecursive(NewmanConwayRecursive(n - 1))
				+ NewmanConwayRecursive(n - NewmanConwayRecursive(n - 1));
	}

	// 25.Newman-Conway Sequence recursive
	private static int NewmanConwayTabulated(int n) {
		int result[] = new int[n + 1];
		result[0] = 0;
		result[1] = 1;
		result[2] = 1;
		for (int i = 3; i < result.length; i++) {
			result[i] = result[result[i - 1]] + result[i - result[i - 1]];
		}
		return result[n];
	}

	// 32.Longest common subsequence recursion
	private static int longestCommonSubsequenceRecursive(String a, String b) {
		if (a.length() == 0 || b.length() == 0) {
			return 0;
		}
		int i = 0;
		if (a.charAt(i) == b.charAt(i)) {
			return 1 + longestCommonSubsequenceRecursive(a.substring(1), b.substring(1));
		} else {
			return Math.max(longestCommonSubsequenceRecursive(a.substring(1), b),
					longestCommonSubsequenceRecursive(a, b.substring(1)));
		}
	}
	// 32.Longest common subsequence tabulated
	private void longestCommonSubsequenceTabulated(String a, String b) {
          
	}

	// INTERMEDIATE
	// 10. 0/1 knapsack problem recursive
	static int max = 0;

	private static void zero_oneKnapsackRecursive(int W, int[] weights, int[] profits, int w, int profit, String asf,
			int vidx) {
		if (vidx == profits.length) {
			if (w == W) {
				if (max < profit) {
					max = profit;
					System.out.println(asf);
					System.out.println(max);
				}
			}

			return;
		}
		zero_oneKnapsackRecursive(W, weights, profits, w + weights[vidx], profit + profits[vidx],
				asf + "W->" + weights[vidx] + " " + "P->" + profits[vidx] + " ", vidx + 1);
		zero_oneKnapsackRecursive(W, weights, profits, w, profit, asf, vidx + 1);
	}
	// 10. 0/1 knapsack problem tabulated

}
