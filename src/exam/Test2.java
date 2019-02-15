package exam;

class Snack{
	String name;
	int year;
}

public class Test2 {
	public static void main(String[] args) {
		Snack[] foods = new Snack[5];
		for (int i = 4; 0<=i && i<foods.length + 1; i--) {
			foods[i] = new Snack();
			foods[i].name = "Apple " + i + "번";
			foods[i].year = i * 2;
		}
			System.out.println("이 음식의 이름은 " + foods[1].name + "이며, 유통기한은 " + foods[1].year + "입니다.");
			System.out.println("이 음식의 이름은 " + foods[2].name + "이며, 유통기한은 " + foods[2].year + "입니다.");
			System.out.println("이 음식의 이름은 " + foods[3].name + "이며, 유통기한은 " + foods[3].year + "입니다.");
			System.out.println("이 음식의 이름은 " + foods[4].name + "이며, 유통기한은 " + foods[4].year + "입니다.");

	}
}
