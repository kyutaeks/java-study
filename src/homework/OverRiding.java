package homework;
//
//class Mother {
//	Mother() {
//
//	}
//
//	public void anser() {
//		System.out.println("제일 상위클래스.");
//	}
//
//}

class Father  {
	public Father() {
		System.out.println("두번째 클래스.");
	}

}

public class OverRiding extends Father {

	public OverRiding() {
		System.out.println("나는 마지막. 그러니 내가 나올거야!");
	}

	public static void main(String[] args) {

		new OverRiding();
		

	}

}
