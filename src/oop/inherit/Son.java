package oop.inherit;

//다시 이해할것


class Father  {
	Father() {
		
	}

	void work() {
		System.out.println("아빠가 일함.");
	}
}

public class Son extends Father {
	public Son() {
		
	}

	void work() {
		
		System.out.println("아들이 공부함.");

	}

	public static void main(String[] args) {
		Son s = new Son();
		s.work();
	}
}
