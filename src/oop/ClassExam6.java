package oop;

public class ClassExam6 {
	int[] nums;

	ClassExam6() {
		nums = new int[3];
	}

	public static void main(String[] args) {
		ClassExam6 ce = new ClassExam6();
		ce.nums[0] = 1;
		ce.nums[1] = 2;
		ce.nums[2] = 3;
		System.out.println(ce.nums[0]);

		System.out.println(ce.nums[1]);

		System.out.println(ce.nums[2]);
	}
}
