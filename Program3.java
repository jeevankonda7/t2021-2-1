package org.prepare;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any value:");
		int seq = sc.nextInt();
		if (seq % 2 == 0)
			seq -= 1;
		int count = 1, i = 1;
		do {
			if (i % 2 == 1 && count != seq) {
				System.out.print(i + ",");
				count++;
			} else if (i % 2 == 1 && count == seq) {
				System.out.print(i);
				count++;
			}
			i++;

		} while (count <= seq);

		sc.close();

	}

}
