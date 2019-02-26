package test;

import java.util.ArrayList;

public class RottoCompare {
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
		ArrayList<Integer> compare = new ArrayList<>();
		ArrayList<Integer> compare2 = new ArrayList<>();
		do {
			ArrayList<Integer> num1 = new ArrayList<>();
			for (int i = 0; i < 3; i++) {
				int a = (int) (Math.random() * 10) + 1;
				if (num1.indexOf(a) == -1) {
					num1.add(a);
				} else {
					i--;
				}
				compare = num1;
			}
//		System.out.println(compare);
			ArrayList<Integer> num2 = new ArrayList<>();
			for (int i = 0; i < 3; i++) {
				int b = (int) (Math.random() * 10) + 1;
				if (num2.indexOf(b) == -1) {
					num2.add(b);
				} else {
					i--;
				}
				compare2 = num2;
			}
//		System.out.println(compare2);
		} while ((compare==compare2));
		System.out.println(compare);
		System.out.println(compare2);
		System.out.println(compare.equals(compare2));

	}

}
