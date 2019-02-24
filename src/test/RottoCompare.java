package test;

import java.util.ArrayList;

public class RottoCompare {
	public static void main(String[] args) {
		ArrayList<Integer> compare = new ArrayList<>();
		ArrayList<Integer> compare2 = new ArrayList<>();
		do {
			ArrayList<Integer> num1 = new ArrayList<>();
			for (int i = 0; i < 2; i++) {
				int a = (int) (Math.random() * 3) + 1;
				if (num1.indexOf(a) == -1) {
					num1.add(a);
				} else {
					i--;
				}
				num1 = compare;
			}

			ArrayList<Integer> num2 = new ArrayList<>();
			for (int i = 0; i < 2; i++) {
				int b = (int) (Math.random() * 3) + 1;
				if (num2.indexOf(b) == -1) {
					num2.add(b);
				} else {
					i--;
				}
				num2 = compare2;
			}

		} while (compare != compare2);
		System.out.println(compare);
		System.out.println(compare2);
	}

}
