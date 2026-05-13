import java.util.Scanner;

public class AmbitiousKid {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong(); 
		long[] a = new long[(int) n]; 


		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextLong(); 
		}

		long minimumOperations = Long.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			minimumOperations = Math.min(minimumOperations, Math.abs(a[i]));
		}

		System.out.println(minimumOperations);
		scanner.close();
	}
}