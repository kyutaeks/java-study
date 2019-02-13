package syntax;

public class Loop {
	public static void main(String[] args) {
		// 반복문 - for
		int i = 1;
		for (; i <= 10; i++) {
			System.out.println(i);
		//for문 내에 i가 있어야만 인식되고 외부에서 하려면 for문 밖에 i를 만들어줘야한다.
		}
		System.out.println(i);
	}

}
