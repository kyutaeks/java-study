package homework;

class Mother {
	Mother() {

	}

	void work() {
		System.out.println("안녕하세요.");
	}

}

class Father extends Mother {
	Father() {

	}

	void work() {
		System.out.println("내가 첫번째야.");
	}

}

public class OverRiding extends Father {
	OverRiding() {

	}

	void work() {
		System.out.println("나는 두번째야.");
	}

	public static void main(String[] args) {

		OverRiding ov = new OverRiding();
		ov.work();

	}
//	void의 역할은 return 되는 타입이 없음을 의미합니다. 즉 아무것도 리턴하지 않음을 선언해주는 것과 같습니다. 
//	예를들어 아래 코드는 리턴에 대하여 void를 선언하였으므로 아무것도 리턴하지 않아야 에러가 발생하지 않습니다.

}
