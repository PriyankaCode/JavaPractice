package GHGPractice;

public class FindSubarray {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int s = sc.nextInt();
			int[] m = new int[n];
			for (int j = 0; j < n; j++) {
				m[j] = sc.nextInt();
			}
			findSubArray(n, s, m);
		}
		sc.close(); */
		int [] m = {135, 101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28, 37, 192, 5, 103, 154, 93, 183, 22, 117, 119, 96, 48, 127, 172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134};
		findSubArray(42, 468, m);
	}

	private static void findSubArray(int size, int sum, int[] arr) {
		int firstElePosition = 0;
		int LastElePosition = 0;
		int subArrSum = 0;

		for (int i = firstElePosition; i < size; i++) {
			
			subArrSum = subArrSum + arr[i];
			LastElePosition = i;
			System.out.print("firstElePosition: " + firstElePosition);
			System.out.print(" lastElePosition: " + LastElePosition);
			System.out.print(" subArrSum " + subArrSum);
			System.out.println(" ");
			while (subArrSum > sum) {
				firstElePosition++;
				subArrSum = subArrSum - arr[firstElePosition - 1];
			}
			if (subArrSum == sum) {
				System.out.println((firstElePosition + 1) + " " + (LastElePosition + 1));
				LastElePosition = -1;
				break;
			}

		}

		if (LastElePosition != -1) {
			System.out.println("Not Found");
		}

	}

}
