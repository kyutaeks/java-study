package oop;

public class ClassExam5 {
	int a = 2;

	ClassExam5() {

		System.out.println("난 기본 생성자!");
	}

	ClassExam5(int a) {

		System.out.println("난 기본 생성자 아님!");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassExam5 ce = new ClassExam5(5);
		ClassExam5 cx = new ClassExam5();
		ce.a =4;
		ce.a =1;
		System.out.println(ce.a);
	}
}
