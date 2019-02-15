package exam;

class Food {
	String name;
	int year;
}

class Cat {
	String name;
	int age;
	String food;
}

class Dog {
	String name;
	int age;
	String food;
}

public class Test {
	public static void main(String[] args) {
		Dog[] dogs = new Dog[3];
		for (int i = 0; i < dogs.length; i++) {
			dogs[i] = new Dog();
			dogs[i].age = i * 3;

		}
		Cat[] cats = new Cat[6];
		for (int i = 0; i < cats.length; i++) {
			cats[i] = new Cat();
			cats[i].name = "hat" +i ;
			cats[i].food = "고양이밥";

		}
		Food[] food = new Food[8];
		for (int i = 0; i < food.length; i++) {
			food[i] = new Food();
			food[i].name = "snak";
			if (i == 1 || i == 0) {
				food[i].name = "water";
			} else {
				food[i].name = "juice";
			}
			food[i].year = i + 1;

		}
		System.out.println(dogs[2].age);
		System.out.println(cats[1].name);
		System.out.println(cats[1].food);
		System.out.println("이 음식의 유통기한은 " + food[2].year + "년 이고, 이름은 " + food[1].name + " 입니다.");
		System.out.println("이 음식의 유통기한은 " + food[2].year + "년 이고, 이름은 " + food[2].name + " 입니다.");
		System.out.println(food[1].name);
		System.out.println(dogs[1].age);
	}
}
