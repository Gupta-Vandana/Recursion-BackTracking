
public class Step_One {

	public static void main(String[] args) {
		// Combinations(new int[] { 1, 2, 3, 4 }, 2, " ", -1);
		// digitBinary(4, "");
		// DigitGivenNumbers(3, 6, 0, "");
		// System.out.println(f(new int[] { 1, 2, 3, 4, 5, 6 }, 6, 0, ""));
		// count = 0;
		// System.out.println(fotherWay(6, " ", 0));
		// count = 0;
		// fNaive(new int[] { 1, 2, 3, 4, 5, 6 }, 6, 0, 0, "");
		// stringPartitioning("abcde");
		// subsequences("AABEBCDD", "");
	}

	// YAYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY!!!!!!!!!!!!!!!!!!!
	// I DID IT!!!!!
	public static void subsequencesWithASCII(String s, String sf) {
		if (s.length() == 0) {
			count++;
			System.out.println(count + ". " + sf);
			return;
		}

		subsequencesWithASCII(s.substring(1), sf);
		subsequencesWithASCII(s.substring(1), sf + s.substring(0, 1));
		subsequencesWithASCII(s.substring(1), sf + (int) s.charAt(0));
	}

	// YAYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY!!!!!!!!!!!!!!!!!!!
	// I DID IT!!!!!
	public static void subsequences(String s, String sf) {
		if (s.length() == 0) {
			count++;
			System.out.println(count + ". " + sf);
			return;
		}

		subsequences(s.substring(1), sf + s.charAt(0));
		subsequences(s.substring(1), sf);
	}

	public static void subString(String s, String asf) {
		if (s.length() == 0) {
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			asf = asf + s.charAt(i);
			System.out.println(asf);
		}
		subString(s.substring(1), "");
	}

	// partitioning of string
	private static void stringPartitioning(String s) {
		if (s.length() == 0) {
			System.out.println();
		}
		int si = 1;
		while (si < s.length()) {
			System.out.println(s.substring(0, si) + "|" + s.substring(si, s.length()));
			si++;
		}
	}

	// Print all possible strings of length k formed from a set of n characters
	public static void possibleStringOfLengthK(char[] arr, int k, String asf) {
		if (k + 1 == asf.length()) {
			System.out.println(asf);
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			possibleStringOfLengthK(arr, k, asf + arr[i]);

		}
	}

	// print all the combinations equal to target of any length
	// writing DP code is easy
	public static int f(int[] arr, int target, int vidx, String sssf) {
		if (target == 0) {
			count++;
			System.out.println(count + ". " + sssf);
			return 1;
		}
		if (vidx >= arr.length || target < 0) {
			return 0;
		}

		return f(arr, target - arr[vidx], vidx + 1, sssf + " " + arr[vidx]) + f(arr, target, vidx + 1, sssf);
	}

	// print all the combinations equal to target of any length
	public static void fNaive(int[] arr, int target, int vidx, int ssf, String sssf) {
		if (ssf == target) {
			System.out.println(sssf);
			return;
		}

		if (vidx >= arr.length) {
			return;
		}

		fNaive(arr, target, vidx + 1, ssf + arr[vidx], sssf + " " + arr[vidx]);
		fNaive(arr, target, vidx + 1, ssf, sssf);
	}

	// same function with diff approach
	// writing DP code is difficult
	private static int fotherWay(int n, String asf, int li) {
		int res = 0;
		if (n == 0) {
			count++;
			System.out.println(count + ". " + asf);
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		for (int i = li + 1; i <= n; i++) {
			res = res + fotherWay(n - i, asf + i + " ", i);
		}
		return res;
	}

	
	// Combinations of given length eg {1,2,3} k =2 {1,2}{1,3}{2,3}
	public static void Combinations(int[] arr, int k, String asf, int lb) {
		if (k == 0) {
			System.out.println(count++ + "." + asf);
			return;
		}
		for (int i = lb + 1; i < arr.length; i++) {
			Combinations(arr, k - 1, asf + arr[i], i);
		}
	}

	// prints target with given no of positions from 0 to 9
	public static void DigitGivenNumbers(int noOfcall, int sum, int sumsf, String asf) {
		if (noOfcall == 0) {
			if (sumsf == sum) {
				count++;
				System.out.println(count + ". " + asf);
				return;
			} else {
				return;
			}
		}

		for (int i = 0; i <= 9; i++) {
			DigitGivenNumbers(noOfcall - 1, sum, sumsf + i, asf + i);
		}
	}

	public static void FindMaximumElemetInArray(int[] arr, int vidx, int max) {
		if (vidx == arr.length - 1) {
			if (arr[vidx] > max) {
				System.out.println(arr[vidx]);
				return;
			} else {
				System.out.println(max);
				return;
			}
		}
		if (arr[vidx] > max) {
			max = arr[vidx];
		}
		FindMaximumElemetInArray(arr, vidx + 1, max);
	}

	// n steps with 1 2 and 3 steps a time
	public static void Nsteps(int n, String asf, int[] arr) {
		if (n == 0) {
			count++;
			System.out.println(count + " " + asf);
			return;
		}
		if (n < 0) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			Nsteps(n - arr[i], asf + "" + arr[i], arr);
		}
		// Nsteps(n - 1, asf + "" + "1");
		// Nsteps(n - 2, asf + "" + "2");
		// Nsteps(n - 3, asf + "" + "3");
	}

	// permutations of queens in a given array
	public static void permutations(boolean[] boxes, int queens, int qpsf, String asf) {
		if (qpsf == queens) {
			System.out.println(asf);
			return;
		}
		for (int box = 0; box < boxes.length; box++) {
			if (boxes[box] == false) {
				boxes[box] = true;
				permutations(boxes, queens, qpsf + 1, asf + "q" + (qpsf + 1) + "b" + box);
				boxes[box] = false;
			}
		}
	}

	public static void WildCardPattern(String str, String asf) {
		if (str.length() == 0) {
			System.out.println(asf);
			return;
		}
		if (str.charAt(0) == '?') {
			WildCardPattern(str.substring(1), asf + "0");
			WildCardPattern(str.substring(1), asf + "1");
		} else {
			WildCardPattern(str.substring(1), asf + str.charAt(0));
		}
	}

	public static void staircase(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int str = 0; str < i; str++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

	// Need to stop at one recursive call
	// need to make unique combinations
	public static void hackerEarth(int n, int sfr, String asf) {
		if (sfr == n) {
			System.out.println("Yes");
			return;
		}
		if (sfr > n) {
			System.out.println(asf);
			return;
		}
		hackerEarth(n, sfr * 10, asf);
		hackerEarth(n, sfr * 20, asf);

	}

	static int count = 0;

	public static void digitBinary(int n, String asf) {
		if (n == 0) {
			System.out.println(asf);
			return;

		}
		digitBinary(n - 1, asf + '1');
		digitBinary(n - 1, asf + '0');
	}

}
