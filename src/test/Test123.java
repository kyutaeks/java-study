package test;

import java.util.ArrayList;
import java.util.Arrays;

public class Test123 {
//	public static void main(String[] args) {
//		int[] a = new int[]{1, 2, 3};
//		int[] b = new int[]{1, 2, 3};
//		System.out.println(a.equals(b)); //prints "false" because a and b refer to different objects
//		System.out.println(Arrays.equals(a, b)); //prints "true" because the elements of a and b have the same values
//	}

	static int[] test = new int[3];
	static int[] test2 = new int[3];

	public static void main(String[] args) {
		do {
		int[] test3 = new int[3];
		for (int i = 0; i <3; i++) {
			test3[i] = (int) (Math.random() * 3) + 1;
//			if () {
//
//			} else {
//				i--;
//			}
		}
		System.out.print(test3[0] + ",");
		System.out.print(test3[1] + ",");
		System.out.println(test3[2]);
//		System.out.print(test3[3] + ",");
//		System.out.print(test3[4] + ",");
//		System.out.println(test3[5]);
		test = test3;
		System.out.println(test.equals(test3));
		int[] test4 = new int[3];
		for (int i = 0; i < 3; i++) {
			test4[i] = (int) (Math.random() * 3) + 1;
//			if (test4[0] != test4[1]) {
//				
//			} else {
//				i--;
		}
		System.out.print(test4[0] + ",");
		System.out.print(test4[1] + ",");
		System.out.println(test4[2]);
//		System.out.print(test4[3] + ",");
//		System.out.print(test4[4] + ",");
//		System.out.println(test4[5]);
		test2 = test4;
		System.out.println(test2 == test4);
		System.out.println();
		}while(test != test2);
		System.out.println(Arrays.equals(test, test2));
	}
	
//		System.out.println(test4);
//		test2 = test4;
//		System.out.println(test2);
//		System.out.println(Arrays.equals(test, test2));
}
//}
