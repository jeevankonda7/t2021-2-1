package org.prepare;

public class Program4 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30 };
		System.out.print("{ ");
		for (int i = 1; i <= 9; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j] % i == 0)
					count++;
			}
			if (i != 9)
				System.out.print(i + ": " + count + ", ");
			else
				System.out.print(i + ": " + count + " }");
		}

	}

}
