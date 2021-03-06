import static java.lang.Math.*;

public class Fragments {

	public int fragment1(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum++;
		}
		System.out.println("F1: " + sum);
		return sum;
	}

	public int f1(int n) {
		return n;
	}

	public int fragment2(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				sum++;
		System.out.println("F2: " + sum);
		return sum;
	}

	public int f2(int n) {
		return n*n;
	}

	public int fragment3(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++)
			for (int j = i; j < n; j++)
				sum++;
		System.out.println("F3: " + sum);
		return sum;
	}

	public int f3(int n) {
		return (n * (n + 1)) / 2;
	}

	public int fragment4(int n) {
		int sum = 0;

		for (int i = 0; i < n; i++)
			sum++;
		for (int j = 0; j < n; j++)
			sum++;
		System.out.println("F4: " + sum);
		return sum;
	}
	public int f4(int n) {
		return 2 * n;
	}

	public int fragment5(int n) {
		int sum = 0;

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n * n; j++)
				sum++;
		System.out.println("F5: " + sum);
		return sum;
	}
	public int f5(int n) { 
		return n * n * n;
	}


	public int fragment6(int n) {
		int sum = 0;

		for (int i = 0; i < n; i++)
			for (int j = 0; j < i; j++)
				sum++;
		System.out.println("F6: " + sum);
		return sum;
		
	}
	public int f6(int n) {
		return ((n -1)* (n )) / 2;
	}

	public int fragment7(int n) {
		int sum = 0;

		
		for (int i = 1; i < n; i++)					// 100 + 101 + ... + 199
			for (int j = 0; j < n * n; j++)			// 100² + 101² + ... + 199²
				if (j % i == 0)						
					for (int k = 0; k < j; k++)		
						sum++;

		
		return sum;
	}
	public int f7(int n) {
		return (int)(n*n*n*n * log ( n * log(n*n)));
	}


}