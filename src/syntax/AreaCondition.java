package syntax;

public class AreaCondition {
	public static void main(String[] args) {
		int i = 10;

		if (i == 1) {
			System.out.println("i는 1");
		} else if (i < 10) {
			System.out.println("i는 10보다 작다");
		} else if (i > 10) {
			System.out.println("i는 10보다 크다");
		} else {
			System.out.println("i는 10이다.");
		}
		// if문 안에 있는것들만 출력되고 순서대로 출력된다. 하지만 모두 만족한다고 해서 모두 출력되는것이
		// 아니라 맨위가 만족을 하게 된다면 그밑은 생략한다. 즉, 비교조차 하지않는다.
		// 아 이거 어떻게 했더라;
	}

}
