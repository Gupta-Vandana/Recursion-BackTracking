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
		// System.out.println(subSetTargetRecursive(new int[] { 3, 34, 4, 12, 5,
		// 2 }, 9, 5));
		// System.out.println(subSetTargetTabulated(new int[] { 3, 34, 4, 12, 5,
		// 2 }, 89));
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
		// System.out.println(longestCommonSubsequenceRecursive("babab",
		// "babba"));
		// System.out.println(longestCommonSubsequenceTabulated("AGGTAB",
		// "ABCDGH"));
		// maxSumIncreasingSubsequence(new int[] {3, 2, 6, 4, 5, 1 });
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
		// System.out.println(breakNumberMaxSum(24));
		// System.out.println(maxValueByDividing(10));
		// System.out.println(maxValueByDividingTabulated(60));
		// int[][] matrix = { { 4, 2, 3, 4, 1 }, { 2, 9, 1, 10, 5 }, { 15, 1, 3,
		// 0, 20 }, { 16, 92, 41, 44, 1 },
		// { 8, 142, 6, 4, 8 } };
		// System.out.println(maxWeightPath(matrix, 0, 0, "") + matrix[0][0]);
		// System.out.println(possiblePathsinMNmatrix(3, 3, 0, 0));
		// System.out.println(possiblePathsinMNmatrixTabulated(3, 3));
		// System.out.println(noofWaysTileFloor(4));
		// System.out.println(noofWaysTileFloorTabulated(4));
		// System.out.println(waysToCoverADistance(3));
		// System.out.println(pathsFromOrigin(3, 0));
		// System.out.println(noOfWaysToScore(new int[] { 3, 5, 10 }, " ", 20,
		// 0));
		// System.out.println(noOfWaysToScoreTabulated(13, new int[] { 3, 5, 10
		// }));
		// System.out.println(waysToReachStair(4));
		// System.out.println(balancedBinaryTrees(4));
		// System.out.println(balancedBinaryTreesTabulated(4));
		// System.out.println(countingpairs(3));
		// System.out.println(countingpairsTabulated(3));
		// System.out.println(EulerianNumber(3, 1));
		// System.out.println(EulerianNumberTabulated(3, 1));
		// System.out.println(DelannoyNumber(4, 5));
		// System.out.println(DelannoyNumberTabulated(4, 5));
		// System.out.println(HighwayBillboard(new int[] { 6, 7, 12, 13, 14 },
		// new int[] { 5, 6, 5, 3, 1 }, 5, 20));
		// System.out.println(PartitionProblem(new int[] { 3, 1, 5, 9, 12 }, 0,
		// 15));
		// System.out.println(LongestCommonSubstring("forgeeksskeegfor",
		// "rofgeeksskeegrof", 0));
		// System.out.println(LongestCommonSubstringTabulated("forgeeksskeegfor",
		// "rofgeeksskeegrof"));
		// LongestOddEvenSubsequence(new int[] { 5, 6, 9, 4, 7, 8 });
		// System.out.println(mcm(new int[] { 40, 20, 30, 10, 30 }, 0, 4, new
		// int[][] { {} }));
		// String s = "ababbbabbababa";
		// System.out.println(PalindromePartitioning(s, 0, s.length() - 1));
		// System.out.println(UnboundedKnapsack(new int[] { 1, 3, 4, 5 }, new
		// int[] { 10, 40, 50, 70 }, 8, 0, " "));
		// System.out.println(zero_oneKnapsackTabulated(new int[] { 10, 20, 30
		// }, new int[] { 60, 100, 120 }, 50));
		// zero_oneKnapsack(7, new int[] { 2, 5, 1, 3, 4 }, new int[] { 15, 14,
		// 10, 45, 30 }, 0, 0, "", 0);
		// System.out.println( zero_oneKnapsackRecursive(7, new int[] { 2, 5, 1,
		// 3, 4 }, new int[] { 15, 14, 10, 45, 30 }, 0));
		// System.out.println(CountSubsetsGivenSum(new int[] { 1, 1, 1, 1 }, 1,
		// 3));
		// System.out.println(CountSubsetsGivenSumTabulated(new int[] { 2, 3, 5,
		// 6, 8, 10 }, 10));
		// System.out.println(DiceThrow(3, 4, 5, ""));
		// System.out.println(TileStackingRecursive(3, 3, 1, "", 1));
		// longestIncreasingConsecutive(new int[] { 6, 7, 8, 3, 4, 5, 9, 10 });
		// String a = "banana";
		// String b = "ban";
		// System.out.println(aOccursSubsequenceInb(a, b));
		// System.out.println(aOccursSubsequenceInbTabulated(a, b));
		// String a = "";
		// String b = " ";
		// System.out.println(a.length());
		// System.out.println(b.length());
		// System.out.println(NumberOfPathsKCoins(new int[][] { { 1, 2, 3 }, {
		// 4, 6, 5 }, { 3, 2, 1 } }, 12, 0, 0, ""));
		// System.out.println(MinCostPath(new int[][] { { 1, 2, 3 }, { 4, 8, 2
		// }, { 1, 5, 3 } }));
		// MinValueOfCoinsToGivenValue(new int[] { 25, 10, 5 }, 30);
		System.out.println(MinValueOfCoinsToGivenValue(new int[] { 9, 6, 5, 1 }, 11, 0, ""));
		System.out.println(MinValueOfCoinsToGivenValueTabulated(new int[] { 9, 6, 5, 1 }, 11));
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
	private static boolean subSetTargetTabulated(int[] arr, int target) {
		boolean[][] res = new boolean[arr.length + 1][target + 1];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				if (i == 0 && j == 0) {
					res[i][j] = true;
				} else if (i == 0) {
					res[i][j] = false;

				} else if (j == 0) {
					res[i][j] = true;
				} else {
					if (j >= arr[i - 1]) {
						res[i][j] = res[i - 1][j - arr[i - 1]] || res[i - 1][j];
					} else {
						res[i][j] = res[i - 1][j];
					}
				}
			}
		}
		for (int i = 0; i < res.length; i++) {
			System.out.println(Arrays.toString(res[i]));
		}
		return res[arr.length][target];

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
		if (a.charAt(0) == b.charAt(0)) {
			return 1 + longestCommonSubsequenceRecursive(a.substring(1), b.substring(1));
		} else {
			return Math.max(longestCommonSubsequenceRecursive(a.substring(1), b),
					longestCommonSubsequenceRecursive(a, b.substring(1)));
		}
	}

	// 32.Longest common subsequence tabulated
	private static int longestCommonSubsequenceTabulated(String a, String b) {
		int[][] res = new int[a.length() + 1][b.length() + 1];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				if (i == 0 || j == 0) {
					res[i][j] = 0;
				} else if (a.charAt(i - 1) == b.charAt(j - 1)) {
					res[i][j] = 1 + res[i - 1][j - 1];
				} else {
					res[i][j] = Math.max(res[i - 1][j], res[i][j - 1]);
				}
			}
		}
		return res[res.length - 1][res[0].length - 1];

	}

	// LCS related operations
	// Minimum Number of Insertion and Deletion to convert String a to String b
	private void insertionDeletionToTransform(String a, String b) {
		int lcs = longestCommonSubsequenceRecursive(a, b);
		System.out.println(a.length() - lcs + "deletions");
		System.out.println(b.length() - lcs + "insertions");
	}

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
	// return dyn(I+1,k) + dyn(I+1,k*A[I])

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

	// 53.Maximum sum of pairs with specific difference
	// 54.Maximum size square sub-matrix with all 1s
	// 56.Recursively break a number in 3 parts to get maximum sum
	private static int breakNumberMaxSum(int n) {
		if (n <= 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return Math.max(breakNumberMaxSum(n / 2) + breakNumberMaxSum(n / 3) + breakNumberMaxSum(n / 4), n);
	}

	// 57.Maximum value with the choice of either dividing or considering as it
	// is recursive
	private static int maxValueByDividing(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return Math.max(maxValueByDividing(n / 2) + maxValueByDividing(n / 3) + maxValueByDividing(n / 4)
				+ maxValueByDividing(n / 5), n);
	}

	// 57.Maximum value with the choice of either dividing or considering as it
	// is tabulated
	private static int maxValueByDividingTabulated(int n) {
		int[] res = new int[n + 1];
		res[0] = 0;
		res[1] = 1;
		for (int i = 2; i < res.length; i++) {
			res[i] = Math.max(res[i / 2] + res[i / 3] + res[i / 4] + res[i / 5], i);
		}

		return res[n];
	}

	// 58.Maximum weight path ending at any element of last row in a matrix
	// recursive
	private static int maxWeightPath(int[][] matrix, int i, int j, String asf) {
		if (i >= matrix.length - 1 || j >= matrix.length - 1) {
			System.out.println(asf);
			return 0;
		}

		return Math.max(matrix[i + 1][j] + maxWeightPath(matrix, i + 1, j, asf + matrix[i + 1][j] + " "),
				matrix[i + 1][j + 1] + maxWeightPath(matrix, i + 1, j + 1, asf + matrix[i + 1][j + 1] + " "));
	}

	// 58.Maximum weight path ending at any element of last row in a matrix
	// tabulated
	// 65.Min Cost Path
	private static int MinCostPath(int[][] costs) {
		int[][] res = new int[costs.length][costs.length];
		for (int i = costs.length - 1; i >= 0; i--) {
			for (int j = costs[i].length - 1; j >= 0; j--) {
				if (i == costs.length - 1 && j == costs[0].length - 1) {
					res[i][j] = costs[i][j];
				} else if (i == costs.length - 1) {
					res[i][j] = costs[i][j] + res[i][j + 1];
				} else if (j == costs[0].length - 1) {
					res[i][j] = costs[i][j] + res[i + 1][j];
				} else {
					res[i][j] = costs[i][j] + Math.min(res[i + 1][j], Math.min(res[i][j + 1], res[i + 1][j + 1]));
				}
			}
		}
		return res[0][0];

	}

	// 66.Minimum number of jumps to reach end
	// 73.Longest Common Substring recursive
	private static int LongestCommonSubstring(String a, String b, int c) {
		if (a.length() == 0 || b.length() == 0) {
			return c;
		}

		if (a.charAt(0) == b.charAt(0)) {
			c = LongestCommonSubstring(a.substring(1), b.substring(1), c + 1);
		}
		int l1 = LongestCommonSubstring(a.substring(1), b, 0);
		int l2 = LongestCommonSubstring(a, b.substring(1), 0);
		return Math.max(c, Math.max(l1, l2));

	}

	// 73.Longest Common Substring tabulated
	private static int LongestCommonSubstringTabulated(String a, String b) {
		int[][] res = new int[a.length() + 1][b.length() + 1];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				if (i == 0 || j == 0) {
					res[i][j] = 0;
				} else if (a.charAt(i - 1) == b.charAt(j - 1)) {
					res[i][j] = res[i - 1][j - 1] + 1;
				} else {
					res[i][j] = 0;
					// Math.max(res[i - 1][j - 1], Math.max(res[i - 1][j],
					// res[i][j - 1]));
				}
			}
		}
		for (int i = 0; i < res.length; i++) {
			System.out.println(Arrays.toString(res[i]));
		}
		return res[res.length - 1][res[0].length - 1];
	}

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

	// 77.Find n-th element from Stern’s Diatomic Series tabulated
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

	// 80.Count number of ways to reach a given score in a game recursive
	private static int noOfWaysToScore(int[] arr, String asf, int n, int li) {
		int res = 0;
		if (n < 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}
		for (int i = li; i < arr.length; i++) {
			res = res + noOfWaysToScore(arr, asf + arr[i] + " ", n - arr[i], i);
		}
		return res;
	}

	// 80.Count number of ways to reach a given score in a game tabulated
	private static int noOfWaysToScoreTabulated(int target, int[] coins) {
		int[] ways = new int[target + 1];
		ways[0] = 1;
		for (int coin = 0; coin < coins.length; coin++) {
			for (int way = coins[coin]; way < ways.length; way++) {
				ways[way] = ways[way] + ways[way - coins[coin]];
			}
		}
		return ways[target];
	}

	// 81.Count ways to reach the nth stair using step 1, 2 or 3 recursive
	private static int waysToReachStair(int n) {
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		return waysToReachStair(n - 1) + waysToReachStair(n - 2) + waysToReachStair(n - 3);
	}

	// 81.Count ways to reach the nth stair using step 1, 2 or 3 tabulated
	private static int waysToReachStairTabulated(int n) {
		int[] arr = new int[n + 1];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 2;
		for (int i = 3; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
		}
		return arr[n];
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

	// 83.
	// 84.Count Balanced Binary Trees of Height h recursive
	private static int balancedBinaryTrees(int h) {
		if (h == 0 || h == 1) {
			return 1;
		}
		if (h < 0) {
			return 0;
		}
		return balancedBinaryTrees(h - 1) * balancedBinaryTrees(h - 2)
				+ balancedBinaryTrees(h - 2) * balancedBinaryTrees(h - 1)
				+ balancedBinaryTrees(h - 1) * balancedBinaryTrees(h - 1);
	}

	// 84.Count Balanced Binary Trees of Height h recursive tabulated
	private static int balancedBinaryTreesTabulated(int h) {
		int[] res = new int[h + 1];
		res[0] = 1;
		res[1] = 1;
		for (int i = 2; i < res.length; i++) {
			res[i] = res[i - 1] * (2 * res[i - 2] + res[i - 1]);
		}
		return res[h];
	}

	// 85.Counting pairs when a person can form pair with at most one recursive
	private static int countingpairs(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return countingpairs(n - 1) + (n - 1) * countingpairs(n - 2);
	}

	// 85.Counting pairs when a person can form pair with at most one tabulated
	private static int countingpairsTabulated(int n) {
		int[] res = new int[n + 1];
		res[0] = 1;
		res[1] = 1;
		for (int i = 2; i < res.length; i++) {
			res[i] = res[i - 1] + (i - 1) * res[i - 2];
		}
		return res[n];
	}

	// 86.Counts paths from a point to reach Origin recursive
	private static int pathsFromOrigin(int n, int m) {
		if (n == 0 && m == 0) {
			return 1;
		}
		if (n < 0 || m < 0) {
			return 0;
		}
		return pathsFromOrigin(n - 1, m) + pathsFromOrigin(n, m - 1);
	}

	// 86.Counts paths from a point to reach Origin tabulated
	// 87.Count number of ways to cover a distance recursive
	private static int waysToCoverADistance(int n) {
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		return waysToCoverADistance(n - 1) + waysToCoverADistance(n - 2) + waysToCoverADistance(n - 3);
	}

	// 87.Count number of ways to cover a distance tabulated
	private static int waysToCoverADistanceTabulated(int n) {
		int[] res = new int[n + 1];
		res[0] = 1;
		res[1] = 1;
		res[2] = 2;
		res[3] = 4;
		for (int i = 1; i < res.length; i++) {
			res[i] = res[i - 1] + res[i - 2] + res[i - 3];
		}
		return res[n];
	}

	// 88.Count of arrays having consecutive element with different values
	// 90.Count the number of ways to tile the floor of size n x m using 1 x m
	// size tiles
	// 91.Count all possible paths from top left to bottom right of a mXn matrix
	// recursive
	private static int possiblePathsinMNmatrix(int m, int n, int i, int j) {
		if (i == m - 1 && j == n - 1) {
			return 1;
		}
		if (i > m || j > n) {
			return 0;
		}
		return possiblePathsinMNmatrix(m, n, i + 1, j) + possiblePathsinMNmatrix(m, n, i, j + 1);
	}

	// 91.Count all possible paths from top left to bottom right of a mXn matrix
	// tabulated
	private static int possiblePathsinMNmatrixTabulated(int m, int n) {
		int[][] res = new int[m][n];
		for (int i = m - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				if (i == m - 1 && j == n - 1) {
					res[i][j] = 1;
				} else if (i == m - 1) {
					res[i][j] = res[i][j + 1];
				} else if (j == n - 1) {
					res[i][j] = res[i + 1][j];
				} else {
					res[i][j] = res[i + 1][j] + res[i][j + 1];
				}
			}
		}
		return res[0][0];
	}

	// 92.Count number of ways to fill a “n x 4” grid using “1 x 4” tiles
	// recursive
	private static int noofWaysTileFloor(int n) {
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;

		}
		return noofWaysTileFloor(n - 1) + noofWaysTileFloor(n - 4);
	}

	// 92.Count number of ways to fill a “n x 4” grid using “1 x 4” tiles
	// tabulated
	private static int noofWaysTileFloorTabulated(int n) {
		int[] res = new int[n + 1];
		res[0] = 0;
		res[1] = 1;
		res[2] = 1;
		res[3] = 1;
		for (int i = 4; i < res.length; i++) {
			res[i] = res[i - 1] + res[i - 4];
		}
		System.out.println(Arrays.toString(res));
		return res[n];
	}

	// 93.Largest Sum Contiguous Subarray
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

	// 100.Unique paths in a Grid with Obstacles recursive
	// 102.Number of ways to arrange N items under given constraints
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

	// INTERMEDIATE
	// 1.Lobb Number
	// 2.Eulerian Number recursive

	private static int EulerianNumber(int n, int m) {
		if (m >= n || n == 0) {
			return 0;
		}
		if (m == 0) {
			return 1;
		}
		return (n - m) * EulerianNumber(n - 1, m - 1) + (m + 1) * EulerianNumber(n - 1, m);
	}

	// 2.Eulerian Number Tabulated
	private static int EulerianNumberTabulated(int n, int m) {
		int[][] res = new int[n + 1][m + 1];
		for (int i = 1; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				if (j >= i || i == 0) {
					res[i][j] = 0;
				} else if (j == 0) {
					res[i][j] = 1;
				} else {
					res[i][j] = (i - j) * res[i - 1][j - 1] + (j + 1) * res[i - 1][j];
				}
			}
		}

		return res[n][m];
	}

	// 3.Delannoy Number recursive
	private static int DelannoyNumber(int n, int m) {
		if (n == 0 || m == 0) {
			return 1;
		}
		return DelannoyNumber(n - 1, m - 1) + DelannoyNumber(n, m - 1) + DelannoyNumber(n - 1, m);
	}

	// 3.Delannoy Number tabulated
	private static int DelannoyNumberTabulated(int n, int m) {
		int[][] res = new int[n + 1][m + 1];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				if (i == 0 || j == 0) {
					res[i][j] = 1;
				} else {
					res[i][j] = res[i - 1][j - 1] + res[i - 1][j] + res[i][j - 1];
				}
			}
		}
		return res[n][m];
	}

	// 4.Entringer Number recursive
	// 5.Rencontres Number
	// 6.Jacobsthal and Jacobsthal-Lucas numbers
	// 7.
	// 8.Floyd Warshall Algorithm Graph Algo
	// 9.Bellman–Ford Algorithm Graph Algo

	// 10. 0/1 knapsack problem
	private static void zero_oneKnapsack(int W, int[] weights, int[] profits, int w, int profit, String asf, int vidx) {
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
		zero_oneKnapsack(W, weights, profits, w + weights[vidx], profit + profits[vidx],
				asf + "W->" + weights[vidx] + " " + "P->" + profits[vidx] + " ", vidx + 1);
		zero_oneKnapsack(W, weights, profits, w, profit, asf, vidx + 1);
	}

	// 10. 0/1 knapsack problem recursive
	private static int zero_oneKnapsackRecursive(int W, int[] weights, int[] profits, int vidx) {
		// if (vidx == profits.length - 1 && W == 0) {
		// return 0;
		// }
		if (vidx >= profits.length || W < 0) {
			return 0;
		}
		if (weights[vidx] <= W) {
			return Math.max(profits[vidx] + zero_oneKnapsackRecursive(W - weights[vidx], weights, profits, vidx + 1),
					zero_oneKnapsackRecursive(W, weights, profits, vidx + 1));
		} else
			return zero_oneKnapsackRecursive(W, weights, profits, vidx + 1);
	}

	// 10. 0/1 knapsack problem tabulated
	private static int zero_oneKnapsackTabulated(int[] weights, int[] profits, int W) {
		int[][] res = new int[weights.length + 1][W + 1];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				if (j == 0 || i == 0) {
					res[i][j] = 0;
				} else if (weights[i - 1] <= j) {
					res[i][j] = Math.max(profits[i - 1] + res[i - 1][j - weights[i - 1]], res[i - 1][j]);
				} else {
					res[i][j] = res[i - 1][j];
				}
			}
		}
		return res[weights.length][W];

	}

	// 12. Unbounded Knapsack (Repetition of items allowed)
	private static int UnboundedKnapsack(int[] weights, int[] profits, int W, int vidx, String asf) {
		// FOUND NEW APPROACH !
		// if (li >= profits.length || W < 0) {
		// return 0;
		// }
		// int res = 0;
		// for (int i = li; i < profits.length; i++) {
		// int include = profits[i] + UnboundedKnapsack(weights, profits, W -
		// weights[i], i + 1);
		// int exclude = UnboundedKnapsack(weights, profits, W, i + 1);
		// res = Math.max(include, exclude);
		// }
		// return res;
		if (W == 0) {
			count++;
			System.out.println(count + ". " + asf);
			return 0;
		}
		if (vidx >= profits.length || W < 0) {
			return 0;
		}
		if (weights[vidx] <= W) {
			return Math.max(
					profits[vidx] + UnboundedKnapsack(weights, profits, W - weights[vidx], vidx,
							asf + weights[vidx] + "->" + profits[vidx] + " "),
					UnboundedKnapsack(weights, profits, W, vidx + 1, asf));
		} else
			return UnboundedKnapsack(weights, profits, W, vidx + 1, asf);
	}

	// 15.Dice Throw recursive
	private static int DiceThrow(int n, int m, int x, String asf) {
		int res = 0;
		if (n == 0) {
			if (x == 0) {
				System.out.println(asf);
				return 1;
			} else {
				return 0;
			}
		}
		for (int i = 1; i <= m; i++) {
			res += DiceThrow(n - 1, m, x - i, asf + i);
		}
		return res;
	}

	// 15.Dice Throw tabulated
	// 18.Tile Stacking Problem recursive
	// wrong
	private static int TileStackingRecursive(int n, int m, int li, String asf, int k) {
		int res = 0;
		if (n == 0) {
			System.out.println(asf);
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		for (int i = li; i <= m; i++) {
			if (k > 0)
				res += TileStackingRecursive(n - 1, m, i, asf + i, k - 1);
		}

		return res;
	}

	// 20.Highway Billboard Problem tabulated
	private static int HighwayBillboard(int[] miles, int[] revenue, int t, int mile) {
		String[] path = new String[miles.length];
		Arrays.fill(path, "");
		path[0] = String.valueOf(miles[0]);
		int[] r = new int[miles.length];
		int max = 0;
		r[0] = revenue[0];
		for (int i = 1; i < r.length; i++) {
			for (int j = 0; j < i; j++) {
				if (miles[i] - miles[j] > t) {
					if (r[j] > r[i]) {
						r[i] = r[j];
						path[i] = path[j];
					}
				}
			}
			r[i] += revenue[i];
			path[i] += " " + miles[i];
			max = Math.max(max, r[i]);

		}
		System.out.println(Arrays.toString(path));
		System.out.println(Arrays.toString(r));
		return max;
	}

	// 22.Partition problem recursive
	private static boolean PartitionProblem(int[] arr, int vidx, int sum) {
		if (sum == 0) {
			return true;
		}
		if (sum < 0 || vidx >= arr.length) {
			return false;
		}
		return PartitionProblem(arr, vidx + 1, sum - arr[vidx]) || PartitionProblem(arr, vidx + 1, sum);
	}

	// 22.Partition problem tabulated
	private static boolean PartitionProblemTabulated(int[] arr, int sum) {
		boolean[][] res = new boolean[arr.length + 1][sum + 1];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				if (i == 0 && j == 0) {
					res[i][j] = true;
				} else if (i == 0) {
					res[i][j] = false;
				} else if (j == 0) {
					res[i][j] = true;
				} else {
					if (j >= arr[i - 1]) {
						res[i][j] = res[i - 1][j - arr[i - 1]] || res[i - 1][j];
					} else {
						res[i][j] = res[i - 1][j];
					}
				}
			}
		}
		return res[arr.length][sum];
	}

	// Count of subsets with sum equal to X recursion
	private static int CountSubsetsGivenSum(int[] arr, int sum, int vidx) {
		if (vidx == -1) {
			if (sum == 0) {
				return 1;
			} else {
				return 0;
			}
		}
		return CountSubsetsGivenSum(arr, sum - arr[vidx], vidx - 1) + CountSubsetsGivenSum(arr, sum, vidx - 1);
	}

	// Count of subsets with sum equal to X tabulated
	private static int CountSubsetsGivenSumTabulated(int[] arr, int sum) {
		int[][] res = new int[arr.length + 1][sum + 1];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				if (i == 0 && j == 0) {
					res[i][j] = 1;
				} else if (i == 0) {
					res[i][j] = 0;
				} else if (j == 0) {
					res[i][j] = 1;
				} else {
					if (j >= arr[i - 1]) {
						res[i][j] = res[i - 1][j - arr[i - 1]] + res[i - 1][j];
					} else {
						res[i][j] = res[i - 1][j];
					}
				}
			}
		}
		return res[arr.length][sum];
	}

	// 29.Longest Palindromic Subsequence
	// 32.Count All Palindromic Subsequence in a given String
	// 38.Maximum sum alternating subsequence
	// NOT DONE
	private static int maxSumAlternatingSubsequence(int[] arr) {
		int[] sum = new int[arr.length];
		sum[0] = arr[0];
		String[] path = new String[arr.length];
		path[0] = arr[0] + " ";
		boolean positive = arr[0] > arr[1];
		int max = Integer.MIN_VALUE;
		for (int i = 1; i < path.length; i++) {
			for (int j = 0; j < i; j++) {
				if (positive) {
					if (j % 2 == 1 && sum[j] < sum[i]) {
						sum[i] = sum[j];
						path[i] = path[j];
					}
				} else {
					if (j % 2 == 0 && sum[j] < sum[i]) {
						sum[i] = sum[j];
						path[i] = path[j];
					}
				}
			}
			sum[i] += arr[i];
			path[i] += arr[i];
			max = Math.min(max, sum[i]);
		}
		return max;
	}

	// 39.Longest alternating subsequence
	// 40.Shortest Uncommon Subsequence
	// 41.Longest Repeating Subsequence
	// 42.Given a string, find the count of distinct subsequences of it.
	private void distinctSubsequences() {
		// TODO Auto-generated method stub

	}

	// 43.Find number of times a string occurs as a subsequence in given string
	// recursive
	private static int aOccursSubsequenceInb(String a, String b) {
		if ((a.length() == 0 && b.length() == 0) || b.length() == 0) {
			return 1;
		}
		if (a.length() == 0) {
			return 0;
		}
		if (a.charAt(0) == b.charAt(0)) {
			return aOccursSubsequenceInb(a.substring(1), b.substring(1)) + aOccursSubsequenceInb(a.substring(1), b);
		} else {
			return aOccursSubsequenceInb(a.substring(1), b);
		}

	}

	// 43.Find number of times a string occurs as a subsequence in given string
	// tabulated
	private static int aOccursSubsequenceInbTabulated(String a, String b) {
		int[][] res = new int[a.length() + 1][b.length() + 1];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				if (i == 0 && j == 0) {
					res[i][j] = 1;
				} else if (j == 0) {
					res[i][j] = 1;
				} else if (i == 0) {
					res[i][j] = 0;
				} else if (a.charAt(i - 1) == b.charAt(j - 1)) {
					res[i][j] = res[i - 1][j - 1] + res[i - 1][j];
				} else {
					res[i][j] = res[i - 1][j];
				}

			}
		}
		return res[a.length()][b.length()];
	}

	// 47.Printing Maximum Sum Increasing Subsequence
	// Already did it in 38. of easy
	// 48.Longest Increasing Odd Even Subsequence
	private static void LongestOddEvenSubsequence(int[] arr) {
		int[] res = new int[arr.length];
		res[0] = 1;
		String[] path = new String[arr.length];
		path[0] = arr[0] + " ";
		for (int i = 1; i < path.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i] && arr[j] + arr[i] % 2 != 0) {
					if (res[j] > res[i]) {
						res[i] = res[j];
						path[i] = path[j];
					}
				}
			}
			res[i] += 1;
			path[i] += arr[i] + " ";
		}
		System.out.println(Arrays.toString(res));
		System.out.println(Arrays.toString(path));
	}

	// 49.Count number of increasing subsequences of size k
	// 50.Printing longest Increasing consecutive subsequence
	private static void longestIncreasingConsecutive(int[] arr) {
		int[] res = new int[arr.length];
		String[] path = new String[arr.length];
		Arrays.fill(path, "");
		res[0] = 1;
		path[0] = arr[0] + " ";
		for (int i = 1; i < path.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] - arr[j] == 1) {
					if (res[j] > res[i]) {
						res[i] = res[j];
						path[i] = path[j];
					}
				}
			}
			res[i] += 1;
			path[i] += arr[i] + " ";
		}
		System.out.println(Arrays.toString(res));
		System.out.println(Arrays.toString(path));

	}

	// 54.Find all distinct subset (or subsequence) sums of an array
	// NOTE -: array must not contain duplicates
	// 63.Number of paths with exactly k coins recursive
	private static int NumberOfPathsKCoins(int[][] matrix, int k, int i, int j, String asf) {
		if (i == matrix.length - 1 && j == matrix[0].length - 1) {
			if (k - matrix[i][j] == 0) {
				System.out.println(asf);
				return 1;
			} else
				return 0;
		}
		if (i >= matrix.length || j >= matrix[0].length) {
			return 0;
		}
		return NumberOfPathsKCoins(matrix, k - matrix[i][j], i + 1, j, asf + matrix[i][j] + " ")
				+ NumberOfPathsKCoins(matrix, k - matrix[i][j], i, j + 1, asf + matrix[i][j] + " ");

	}

	// 63.Number of paths with exactly k coins tabulated
	// NOT DONE
	// 64.Find minimum number of coins that make a given value
	private static int MinValueOfCoinsToGivenValue(int[] arr, int target, int vidx, String asf) {
		if (vidx == arr.length) {
			if (target == 0) {
				return 1;
			}
			return 0;
		}
		if (arr[vidx] <= target) {
			return 1 + Math.min(MinValueOfCoinsToGivenValue(arr, target - arr[vidx], vidx + 1, asf),
					(MinValueOfCoinsToGivenValue(arr, target, vidx + 1, asf)));
		} else {
			return MinValueOfCoinsToGivenValue(arr, target, vidx + 1, asf);
		}
	}

	// 63.Number of paths with exactly k coins tabulated
	private static int MinValueOfCoinsToGivenValueTabulated(int[] arr, int target) {
		int[][] res = new int[arr.length + 1][target + 1];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				if (i == 0 && j == 0) {
					res[i][j] = 1;
				} else if (i == 0) {
					res[i][j] = 0;
				} else if (j == 0) {
					res[i][j] = 1;
				} else {
					if (arr[i - 1] <= j) {
						res[i][j] = 1 + Math.min(res[i - 1][j - arr[i - 1]], res[i - 1][j]);
					} else {
						res[i][j] = res[i - 1][j];
					}
				}
			}
		}
		return res[arr.length][target];
	}

	private static int NumberOfPathsKCoinsTabulated(int[][] matrix, int k) {
		int[][] res = new int[matrix.length][matrix.length];
		for (int i = matrix.length - 1; i >= 0; i--) {
			for (int j = matrix[0].length - 1; j >= 0; j--) {
				if (i == matrix.length - 1 && j == matrix[0].length - 1) {
					if (k == matrix[matrix.length - 1][matrix[0].length - 1])
						res[i][j] = 1;
					else
						res[i][j] = 0;
				} else if (i == matrix.length - 1) {
					// res[i][j]=
				}
			}
		}
		return res[0][0];
	}
	// 141.Find length of longest subsequence of one string which is substring
	// of another string

	// f(i + 1, j) = max(f(i + 1, j), f(i, j)) //skip this character in X
	// if X[i] == Y[j] //add this character to current answer
	// f(i + 1, j + 1) = max(f(i + 1, j + 1), f(i, j) + 1)

	// 179.Partition a set into two subsets such that the difference of subset
	// sums is minimum

	// HARD
	// 1. Palindrome Partitioning
	private static int PalindromePartitioning(String s, int i, int j) {
		if (isPlalindrome(s, i, j)) {
			return 0;
		}
		int ans = Integer.MAX_VALUE;
		for (int k = i; k < j; k++) {
			int l = PalindromePartitioning(s, i, k);
			int r = PalindromePartitioning(s, k + 1, j);
			int tc = l + r + 1;
			ans = Math.min(tc, ans);
		}
		return ans;
	}

	private static boolean isPlalindrome(String s, int i, int j) {
		int l = i;
		int r = j;
		while (l < r) {
			if (s.charAt(l) != s.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}

	// 5.Boolean Parenthesization Problem
	// private static int BooleanParenthesization(String s, int i, int j,
	// boolean isTrue) {
	// int ways=0;
	// for (int k = i; k < j; k = k + 2) {
	// int lt = BooleanParenthesization(s, i, k - 1, true);
	// int rt = BooleanParenthesization(s, k + 1, j, true);
	// int lf = BooleanParenthesization(s, i, k - 1, false);
	// int rf = BooleanParenthesization(s, k + 1, j, false);
	// if (s.charAt(k) == '|') {
	// ways=lt*rt + lf*rt + lt*rf;
	// }
	// if (s.charAt(k) == '^') {
	//
	// }
	// if (s.charAt(k) == '&') {
	//
	// }
	//
	// }
	// }

	// 8.Matrix Chain Multiplication
	private static int mcm(int[] arr, int i, int j, int[][] qb) {
		if (j - i == 1) {
			return 0;
		}
		int min = Integer.MAX_VALUE;
		for (int k = i + 1; k < j; k++) {
			int l = mcm(arr, i, k, qb);
			int r = mcm(arr, k, j, qb);
			int tc = arr[i] * arr[j] * arr[k];
			min = Math.min(min, l + r + tc);
		}
		return min;
	}

}
