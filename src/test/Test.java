package test;

class Mother {
	Mother() {
System.out.println("안녕하세요.");
	}
}

class Father extends Mother {
	Father() {
		super();
System.out.println("내가 첫번째야.");
	}
}

public class Test extends Father {
	Test() {
		super();
System.out.println("나는 두번째야.");
	}

	public static void main(String[] args) {
		Test t = new Test();

	}

}