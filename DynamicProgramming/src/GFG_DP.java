import java.util.Arrays;

public class GFG_DP {

	public static void main(String[] args) {
		// System.out.println(catalanNumberRecursive(4));
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
		// System.out.println(longestCommonSubsequenceRecursive("AGGTAB",
		// "GXTXAYB"));
		// maxSumIncreasingSubsequence(new int[] { 10, 4, 5, 3 });
		// maxProductIncreasing(new int[] { 10, 22, 9, 33, 21, 50, 41, 60 });
		// System.out.println(subsequencesProductLessThanK(new int[] { 1, 2, 3,
		// 4 }, 10, 0, 1));
		// System.out.println(Math.max(maxSumWithNoTwoAdjacent(new int[] { 5, 6,
		// 10, 100, 10, 6 }, 0, "", 0),
		// maxSumWithNoTwoAdjacent(new int[] { 5, 6, 10, 100, 10, 6 }, 1, "",
		// 0)));
		// System.out.println(maxSumWithNoTwoAdjacentTabulated(new int[] { 5, 6,
		// 10, 100, 10, 6 }));
		// System.out.println(longestSubAdjDiffOne(new int[] { 1, 2, 3, 2, 3, 7,
		// 2, 1 }));
		// System.out.println(diffWaysToSumN(10, 5, ""));
		// diffWaysToSumNTabulated(5);
		// System.out.println(diffWaysToExpressN(3, ""));
		// System.out.println(diffWaysToExpressNTabulated(10));
		// System.out.println(waysToSumNArrElements(14, new int[] { 12, 3, 1, 9
		// }, ""));
		// waysToSumNArrElementsTabulated(14, new int[] { 12, 3, 1, 9 });
		// f(6, "");
		// diffWaysToSumN(6, 1, "");
		// fTabulated(6);
		// System.out.println(strensDiatomicSeries(15));
		// strensDiatomicSeriesTabulated(15);
	}

	static int count = 0;
	static int max = 0;

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

	// 7.Tiling Problem (floor size n x m,tile size 1 x m) recursive
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

	// 22.
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

	// 25.Newman-Conway Sequence tabulated
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
	// 38.Maximum Sum Increasing Subsequence recursive
	// 38.Maximum Sum Increasing Subsequence tabulated
	private static void maxSumIncreasingSubsequence(int[] arr) {
		int[] mssf = new int[arr.length];
		String[] paths = new String[arr.length];
		mssf[0] = arr[0];
		paths[0] = arr[0] + " ";
		int max = arr[0];
		for (int i = 1; i < paths.length; i++) {
			for (int j = 0; j <= i - 1; j++) {
				if (arr[j] < arr[i]) {
					if (mssf[j] > mssf[i]) {
						mssf[i] = mssf[j];
						paths[i] = paths[j];
					}
				}
			}
			mssf[i] = mssf[i] + arr[i];
			paths[i] = paths[i] + arr[i] + " ";
			max = Math.max(max, mssf[i]);
		}
		System.out.println(Arrays.toString(mssf));
		System.out.println(Arrays.toString(paths));
		System.out.println(max);

	}

	// 39.Maximum product of an increasing subsequence recursive
	// 39.Maximum product of an increasing subsequence tabulated
	private static void maxProductIncreasing(int[] arr) {
		int[] mpsf = new int[arr.length];
		String[] paths = new String[arr.length];
		mpsf[0] = arr[0];
		paths[0] = arr[0] + " ";
		for (int i = 1; i < paths.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i]) {
					if (mpsf[j] > mpsf[i]) {
						mpsf[i] = mpsf[j];
						paths[i] = paths[j];
					}
				}
			}
			mpsf[i] = mpsf[i] * arr[i];
			paths[i] = paths[i] + arr[i] + " ";
		}
		System.out.println(Arrays.toString(mpsf));
		System.out.println(Arrays.toString(paths));

	}

	// 40.Count all subsequences having product less than K recursive
	private static int subsequencesProductLessThanK(int[] arr, int k, int vidx, int sum) {
		// if (vidx == arr.length) {
		// if (sum < k) {
		// count++;
		// System.out.println(count + ". " + asf);
		// return;
		// } else {
		// return;
		// }
		// }
		// subsequencesProductLessThanK(arr, k, vidx + 1, sum, asf);
		// subsequencesProductLessThanK(arr, k, vidx + 1, sum * arr[vidx], asf +
		// arr[vidx] + " ");
		if (vidx == arr.length) {
			if (sum < k)
				return 1;
			if (sum >= k)
				return 0;
		}

		return subsequencesProductLessThanK(arr, k, vidx + 1, sum)
				+ subsequencesProductLessThanK(arr, k, vidx + 1, sum * arr[vidx]);

	}

	// Maximum sum such that no two elements are adjacent recursive
	private static int maxSumWithNoTwoAdjacent(int[] arr, int vidx, String asf, int sum) {
		if (vidx >= arr.length) {
			System.out.println(asf);
			return sum;
		}
		return Math.max(maxSumWithNoTwoAdjacent(arr, vidx + 2, asf + arr[vidx] + " ", sum + arr[vidx]),
				maxSumWithNoTwoAdjacent(arr, vidx + 2, asf, sum));
	}

	// Maximum sum such that no two elements are adjacent tabulated
	private static int maxSumWithNoTwoAdjacentTabulated(int[] arr) {
		int[] zero = new int[arr.length];
		zero[0] = arr[0];

		int[] one = new int[arr.length];
		one[1] = arr[1];

		for (int i = 2; i < zero.length; i = i + 2) {
			zero[i] = Math.max(zero[i - 2], zero[i - 2] + arr[i]);
		}
		for (int i = 3; i < one.length; i = i + 2) {
			one[i] = Math.max(one[i - 2], one[i - 2] + arr[i]);
		}
		System.out.println(Arrays.toString(zero));
		System.out.println(Arrays.toString(one));
		int max = 0;
		for (int i = 0; i < one.length; i++) {
			max = Math.max(zero[i], one[i]);
		}
		return max;
	}

	// dyn (I k)
	// if I == N: return 1
	// if k >= K: return 0
	// return dyn(I+1,k)+dyn(I+1,k*A[I])
	// 42.Longest subsequence such that difference between adjacents is one
	private static int longestSubAdjDiffOne(int[] arr) {
		int[] lengths = new int[arr.length];
		lengths[0] = 1;
		String[] paths = new String[arr.length];
		Arrays.fill(paths, "");
		paths[0] = arr[0] + "";
		int max = 0;
		String path = "";
		for (int i = 1; i < paths.length; i++) {
			for (int j = 0; j < i; j++) {
				if (Math.abs(arr[j] - arr[i]) == 1) {
					if (lengths[j] > lengths[i]) {
						lengths[i] = lengths[j];
						paths[i] = paths[j];
					}
				}
			}
			lengths[i] += 1;
			paths[i] = paths[i] + " " + arr[i];
			if (max < lengths[i]) {
				max = lengths[i];
				path = paths[i];

			}
		}
		System.out.println(Arrays.toString(lengths));
		System.out.println(Arrays.toString(paths));
		return max;
	}

	// 66.Minimum number of jumps to reach end
	// 77.Find n-th element from Stern’s Diatomic Series recursive
	private static int strensDiatomicSeries(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (n % 2 == 0) {
			return strensDiatomicSeries(n / 2);
		} else {
			return strensDiatomicSeries((n - 1) / 2) + strensDiatomicSeries((n + 1) / 2);
		}
	}

	private static void strensDiatomicSeriesTabulated(int n) {
		int[] res = new int[n + 1];
		res[0] = 0;
		res[1] = 1;
		for (int i = 2; i < res.length; i++) {
			if (i % 2 == 0) {
				res[i] = res[i / 2];
			} else {
				res[i] = res[(i - 1) / 2] + res[(i + 1) / 2];
			}
		}
		System.out.println(Arrays.toString(res));

	}

	// 82.Count of different ways to express N as the sum of 1, 3 and 4
	// recursive
	private static int diffWaysToExpressN(int n, String asf) {
		if (n == 0) {
			System.out.println(asf);
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		return diffWaysToExpressN(n - 1, asf + 1 + " ") + diffWaysToExpressN(n - 3, asf + 3 + " ")
				+ diffWaysToExpressN(n - 4, asf + 4 + " ");

	}

	// 82.Count of different ways to express N as the sum of 1, 3 and 4
	// tabulated
	private static int diffWaysToExpressNTabulated(int n) {
		int[] res = new int[n + 1];
		res[0] = 1;
		res[1] = 1;
		res[2] = 1;
		res[3] = 2;
		for (int i = 4; i < res.length; i++) {
			res[i] = res[i - 1] + res[i - 3] + res[i - 4];
		}
		System.out.println(Arrays.toString(res));
		return res[n];
	}

	// 99.Ways to sum to N using array elements with repetition allowed
	// recursive
	private static int waysToSumNArrElements(int n, int[] arr, String asf) {
		int res = 0;
		if (n == 0) {
			System.out.println(asf);
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		for (int i = 0; i < arr.length; i++) {
			res = res + waysToSumNArrElements(n - arr[i], arr, asf + arr[i] + " ");
		}
		return res;
	}

	// 99.Ways to sum to N using array elements with repetition allowed
	// tabulated
	private static void waysToSumNArrElementsTabulated(int n, int[] arr) {
		int res[] = new int[n + 1];
		res[0] = 1;
		for (int i = 1; i < res.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i >= arr[j]) {
					res[i] = res[i] + res[i - arr[j]];
				}
			}
		}
		System.out.println(Arrays.toString(res));
	}

	private static int f(int n, String asf) {
		int res = 0;
		if (n == 0) {
			count++;
			System.out.println(count + ". " + asf);
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		for (int i = 1; i <= n; i++) {
			res = res + f(n - i, asf + i + " ");
		}
		return res;
	}

	private static void fTabulated(int n) {
		int[] res = new int[n + 1];
		res[0] = 1;
		for (int i = 1; i < res.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (i >= j)
					res[i] = res[i] + res[i - j];
			}
		}
		System.out.println(Arrays.toString(res));
	}

	// 106.Different ways to sum n using numbers greater than or equal to m
	// recursive
	private static int diffWaysToSumN(int n, int m, String asf) {
		int res = 0;
		if (n == 0) {
			System.out.println(asf);
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		for (int i = m; i <= n; i++) {
			res = res + diffWaysToSumN(n - i, i, asf + i + " ");
		}
		return res;
	}

	// 106.Different ways to sum n using numbers greater than or equal to m
	// tabulated
	private static void diffWaysToSumNTabulated(int n) {

	}

	// INTERMEDIATE
	// 10. 0/1 knapsack problem recursive

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
