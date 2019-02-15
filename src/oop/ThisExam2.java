package oop;

public class ThisExam2 {
	int num1 = 1;
	String str = "abc";

	ThisExam2() {
	}

	ThisExam2(int num1, String str) {
		num1 = 123;
		str = "asd";
		this.num1 = num1;
		this.str = str;
		System.out.println(this.num1);
		System.out.println(this.str);
	}

	public static void main(String[] args) {
		ThisExam2 te = new ThisExam2();

	}
}
