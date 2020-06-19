import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

import javax.print.StreamPrintService;
import javax.security.auth.Subject;

public class Step_Two {

	public static void main(String[] args) {

		// subString("abcd", "");
		// subSetOfArray(new int[] { 5, 1, 3, 5, 10, 7, 4, 9, 2, 8 }, 0, "",
		// 15);
		// if (maxLength == Integer.MAX_VALUE) {
		// System.out.println(0);
		// } else {
		// System.out.println(maxLength);
		// }
		// steps(5, "");
		// System.out.println("~~~~~~~~~");
		// PrintNnCombo(4, "");
		// System.out.println("~~~~~~~~~");
		// PrintNnComboB(4, "", 1);
		// System.out.println("~~~~~~~~~");
		// PrintNnComboC(4, "", 0);
		// System.out.println("~~~~~~~~~");
		// combinationSum1(new int[] { -1, 0, 1, 2, 3 }, 3, 0, new
		// ArrayList<>(), -1);
		// Arrays.toString(result.toArray());
		// System.out.println("~~~~~~~~~");
		// combinationSum2(new int[] { -1, 0, 1, 2, 3 }, 3, 0, new
		// ArrayList<>(), 0);
		// Arrays.toString(result.toArray());
		// System.out.println("~~~~~~~~~");
		// combinationSum3(new int[] { -1, 0, 1, 2, 3 }, 3, 0, new
		// ArrayList<>());
		// Arrays.toString(result.toArray());
		// combination1(new int[] { 1, 2, 3, 4 }, 3, new ArrayList<>());
		// Arrays.toString(result.toArray());
		// System.out.println("~~~~~~~~~");
		// combination2(new int[] { 1, 2, 3, 4 }, 3, new ArrayList<>(), 0);
		// Arrays.toString(result.toArray());
		// System.out.println("~~~~~~~~~");
		// combination3(new int[] { 1, 2, 3, 4, 5, 6 }, 3, new ArrayList<>(),
		// -1);
		// Arrays.toString(result.toArray());
		// System.out.println(max);
		// subsequencesOfArray(new int[] { 1, 2, 3, 4 }, 0, " ");
		// kpc("263", "");
		// BoardPath(10, "", 0);
		// MazePath(new int[3][3], 2, 2, "_");
		MazePathMultiMoves(new int[5][5], 0, 0, "");

	}

	static int count;

	private static void kpc(String s, String asf) {
		if (s.length() == 0) {
			System.out.println(asf);
			return;
		}
		char ch = s.charAt(0);
		String kp = keypad[ch - '0'];
		for (int i = 0; i < kp.length(); i++) {

			kpc(s.substring(1), asf + kp.charAt(i));
		}
	}

	static String[] keypad = { ".", "/", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	private static void subsequencesOfArray(int[] arr, int vidx, String asf) {
		if (vidx >= arr.length) {
			System.out.println(asf);
			return;
		}
		subsequencesOfArray(arr, vidx + 1, asf + arr[vidx]);
		subsequencesOfArray(arr, vidx + 1, asf);
	}

	// 209.Given an array of n positive integers and a positive integer s,
	// find the minimal length of a contiguous subarray of which the sum ≥ s.
	// If there isn't one, return 0 instead.

	static int maxLength = Integer.MAX_VALUE;

	private static void subSetOfArray(int[] arr, int vidx, String asf, int target) {
		if (vidx >= arr.length) {
			return;
		}
		int sum = 0;
		int count = 0;
		for (int i = vidx; i < arr.length; i++) {
			asf = asf + arr[i] + " ";
			sum += arr[i];
			count++;
			if (sum >= target) {
				if (count < maxLength) {
					maxLength = count;
				}
				System.out.println(count + "->" + asf + " " + "sum of subset" + " " + sum);
			}
		}
		subSetOfArray(arr, vidx + 1, "", target);
	}

	static List<List<Integer>> result = new ArrayList<List<Integer>>();
	static List<List<Integer>> ans = new ArrayList<>();

	// for unique elements in array
	public static void combinationSum1(int[] arr, int noOfcall, int ssf, List<Integer> set, int li) {
		if (noOfcall == 0) {
			if (ssf == 0) {
				result.add(set);
				System.out.println(set);
				return;
			} else {
				return;
			}
		}

		for (int i = li + 1; i < arr.length; i++) {
			set.add(arr[i]);
			combinationSum1(arr, noOfcall - 1, ssf + arr[i], set, i);
			set.remove(set.size() - 1);
		}

	}

	//
	public static void combinationSum2(int[] arr, int noOfcall, int ssf, List<Integer> set, int li) {
		if (noOfcall == 0) {
			if (ssf == 0) {
				result.add(set);
				System.out.println(set);
				return;
			} else {
				return;
			}
		}

		for (int i = li; i < arr.length; i++) {
			set.add(arr[i]);
			combinationSum2(arr, noOfcall - 1, ssf + arr[i], set, i);
			set.remove(set.size() - 1);
		}
	}

	//
	public static void combinationSum3(int[] arr, int noOfcall, int ssf, List<Integer> set) {
		if (noOfcall == 0) {
			if (ssf == 0) {
				result.add(set);
				System.out.println(set);
				return;
			} else {
				return;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
			combinationSum3(arr, noOfcall - 1, ssf + arr[i], set);
			set.remove(set.size() - 1);
		}

	}

	// combination of array
	public static void combination1(int[] arr, int noOfcall, List<Integer> set) {
		if (noOfcall == 0) {
			result.add(set);
			System.out.println(set);
			return;
		}
		if (noOfcall < 0) {
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
			combination1(arr, noOfcall - 1, set);
			set.remove(set.size() - 1);
		}

	}

	public static void combination2(int[] arr, int noOfcall, List<Integer> set, int li) {
		if (noOfcall == 0) {
			result.add(set);
			System.out.println(set);
			return;
		}
		if (noOfcall < 0) {
			return;
		}

		for (int i = li; i < arr.length; i++) {
			set.add(arr[i]);
			combination2(arr, noOfcall - 1, set, i);
			set.remove(set.size() - 1);
		}

	}

	public static void combination3(int[] arr, int noOfcall, List<Integer> set, int li) {
		if (noOfcall == 0) {
			result.add(set);
			System.out.println(set);
			return;
		}
		if (noOfcall < 0) {
			return;
		}

		for (int i = li + 1; i < arr.length; i++) {
			set.add(arr[i]);
			combination3(arr, noOfcall - 1, set, i);
			set.remove(set.size() - 1);
		}

	}

	static int max = Integer.MIN_VALUE;

	// no unique combination && no unique element
	private static void PrintNnCombo(int n, String asf) {
		if (n == 0) {
			System.out.println(asf);
			return;
		}
		if (n < 0) {
			return;
		}

		for (int i = 1; i <= n; i++) {
			PrintNnCombo(n - i, asf + i);
		}
	}

	// unique combination && no unique element
	private static void PrintNnComboB(int n, String asf, int l) {
		if (n == 0) {
			System.out.println(asf);
			return;
		}
		if (n < 0) {
			return;
		}

		for (int i = l; i <= n; i++) {
			PrintNnComboB(n - i, asf + i, i);
		}
	}

	// unique combination && unique element
	private static void PrintNnComboC(int n, String asf, int l) {
		if (n == 0) {
			System.out.println(asf);
			return;
		}
		if (n < 0) {
			return;
		}

		for (int i = l + 1; i <= n; i++) {
			PrintNnComboC(n - i, asf + i, i);
		}
	}

	// PRINT BOARD PATHS
	private static void BoardPath(int src, String asf, int ssf) {
		if (ssf == src) {
			count++;
			System.out.println(count + ". " + asf);
			return;
		}
		if (ssf > src) {
			return;
		}
		for (int i = 1; i <= 6; i++) {
			BoardPath(src, asf + i, ssf + i);
		}
	}

	// MAZE PATH
	private static void MazePath(int[][] matrix, int i, int j, String asf) {
		if (i == matrix.length - 1 && j == matrix[0].length - 1) {
			count++;
			System.out.println(count + ". " + asf);
			return;
		}
		if (i > matrix.length - 1 || j > matrix[0].length - 1) {
			return;
		}
		MazePath(matrix, i + 1, j, "V" + asf);
		MazePath(matrix, i, j + 1, "H" + asf);

	}

	// MAZE PATH with diagonal
	private static void MazePathWithDiagonal(int[][] matrix, int i, int j, String asf) {
		if (i == matrix.length - 1 && j == matrix[0].length - 1) {
			count++;
			System.out.println(count + " " + asf);
			return;
		}
		if (i > matrix.length - 1 || j > matrix[0].length - 1) {
			return;
		}
		MazePathWithDiagonal(matrix, i + 1, j, asf + "V");
		MazePathWithDiagonal(matrix, i, j + 1, asf + "H");
		MazePathWithDiagonal(matrix, i + 1, j + 1, asf + "D");

	}

	// MAZE PATH With multiple moves
	private static void MazePathMultiMoves(int[][] matrix, int i, int j, String asf) {
		if (i == matrix.length - 1 && j == matrix[0].length - 1) {
			count++;
			System.out.println(count + " " + asf);
			return;
		}
		if (i > matrix.length - 1 || j > matrix[0].length - 1) {
			return;
		}
		for (int k = 1; k <= matrix.length; k++) {
			MazePathMultiMoves(matrix, i + k, j, asf + "V" + k);
			MazePathMultiMoves(matrix, i, j + k, asf + "H" + k);
			MazePathMultiMoves(matrix, i + k, j + k, asf + "D" + k);
		}

	}

	// MAZE PATH all directions moves allowed
	// flood fill algo for graph
	private static void MazePathWithAllDirections(boolean[][] matrix, int i, int j, String asf) {
		if (i == matrix.length - 1 && j == matrix[0].length - 1) {
			count++;
			System.out.println(count + " " + asf);
			return;
		}
		if (i < 0 || j < 0) {
			return;
		}
		if (i > matrix.length - 1 || j > matrix[0].length - 1) {
			return;
		}
		if (matrix[i][j] == true) {
			return;
		}
		matrix[i][j] = true;
		MazePathWithAllDirections(matrix, i + 1, j, asf + "V");
		MazePathWithAllDirections(matrix, i, j + 1, asf + "H");
		MazePathWithAllDirections(matrix, i, j - 1, asf + "L");
		MazePathWithAllDirections(matrix, i - 1, j, asf + "U");
		matrix[i][j] = false;
	}

}
