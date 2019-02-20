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
//다시한번 커밋하겠습니다.
		//컴퓨터 커밋테스트 하겠습니다.
//		void의 역할은 return 되는 타입이 없음을 의미합니다. 즉 아무것도 리턴하지 않음을 선언해주는 것과 같습니다. 
//		예를들어 아래 코드는 리턴에 대하여 void를 선언하였으므로 아무것도 리턴하지 않아야 에러가 발생하지 않습니다.

	
	}

}