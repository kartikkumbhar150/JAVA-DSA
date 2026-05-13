import java.util.Scanner;

public class ArrayColoring {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); 
		while (t-- > 0) {
			int n = scanner.nextInt(); 
			int[] a = new int[n]; 
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt(); 
			}

			int countOfOdd = 0; 
			for (int i = 0; i < n; i++) {
				if (a[i] % 2 == 1) { 
					countOfOdd++; 
				}
			}

			if (countOfOdd % 2 == 1) {
				System.out.println("NO"); 
			} else {
				System.out.println("YES"); 
			}
		}
		scanner.close();
	}
}
