package test;

import java.util.ArrayList;
import java.util.Arrays;

public class Test123 {

	static int[] test = new int[6];
	static int[] test2 = new int[6];

	public static void printArray(int[] arr) {
		for(int i:arr) {
			System.out.print(i+",");
		}
		System.out.println();
	}
	public static boolean isEquals(int[] arr, int[] arr2) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=arr2[i]) {
				return false;
			}
		}
		printArray(arr);
		printArray(arr2);
		return true;
	}
	public static void main(String[] args) {
		do {
		int[] test3 = new int[3];
		for (int i = 0; i <3; i++) {
			test3[i] = (int) (Math.random() * 10) + 1;

		}
		System.out.print(test3[0] + ",");
		System.out.print(test3[1] + ",");
		System.out.print(test3[2]);
		test = test3;
//		System.out.println();
//		System.out.println(test.equals(test3));
		int[] test4 = new int[3];
		for (int i = 0; i < 3; i++) {
			test4[i] = (int) (Math.random() * 10) + 1;

		}
		System.out.print(test4[0] + ",");
		System.out.print(test4[1] + ",");
		System.out.print(test4[2]);

		test2 = test4;
//		System.out.println();
//		System.out.println(Arrays.equals(test2, test4));
//		System.out.println();
			
		}while(!isEquals(test,test2));
		
		
		System.out.println(Arrays.equals(test, test2));
	}

//		System.out.println(test4);
//		test2 = test4;
//		System.out.println(test2);
//		System.out.println(Arrays.equals(test, test2));
}
//}
