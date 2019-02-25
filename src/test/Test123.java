package test;

import java.util.ArrayList;
import java.util.Arrays;

public class Test123 {


	static int[] test = new int[6];
	static int[] test2 = new int[6];

	public static void main(String[] args) {
		do {
		int[] test3 = new int[6];
		for (int i = 0; i <6; i++) {
			test3[i] = (int) (Math.random() * 45) + 1;

		}
		System.out.print(test3[0] + ",");
		System.out.print(test3[1] + ",");
		System.out.print(test3[2] + ",");
		System.out.print(test3[3] + ",");
		System.out.print(test3[4] + ",");
		System.out.println(test3[5]);

		test = test3;
		System.out.println(test.equals(test3));
		int[] test4 = new int[6];
		for (int i = 0; i < 6; i++) {
			test4[i] = (int) (Math.random() * 45) + 1;

		}
		System.out.print(test4[0] + ",");
		System.out.print(test4[1] + ",");
		System.out.print(test4[2] + ",");
		System.out.print(test4[3] + ",");
		System.out.print(test4[4] + ",");
		System.out.println(test4[5]);

		test2 = test4;
		System.out.println(Arrays.equals(test2, test4));
		System.out.println();
		}while();
		System.out.println(Arrays.equals(test, test2));
	}
	
//		System.out.println(test4);
//		test2 = test4;
//		System.out.println(test2);
//		System.out.println(Arrays.equals(test, test2));
}
//}
