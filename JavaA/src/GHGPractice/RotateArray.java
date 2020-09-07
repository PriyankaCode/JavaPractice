package GHGPractice;

import java.util.Scanner;

// Given array of size n, rotate elements d, for total t arrays 
/*Example:  
	t=2, 
		n=5, d=2 a[]=1 2 3 4 5 then output 3 4 5 1 2
		n=4, d=1 a[]=4 3 2 1 then output 3 2 1 4
		*/

class RotateArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			int d = scan.nextInt();
			int[] a = new int[n];

			for (int j = 0; j < n; j++) {
				a[j] = scan.nextInt();
			}
			rotateArray(n, d, a);
			System.out.println(" ");

		}
		scan.close();
	}

	public static void rotateArray(int length, int rotate, int[] arr) {
		int[] arr2 = new int[length];
		for (int i = 0; i < length; i++) {
			if (i + rotate < length) {
				arr2[i] = arr[i + rotate];
			} else {
				arr2[i] = arr[i + rotate - length];
			}
		}

		for (int i = 0; i < length; i++) {
			System.out.print(arr2[i] + " ");
		}

	}
}
