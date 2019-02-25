package collection.list;

import java.util.ArrayList;
import java.util.List;

class Dog {
	private String name;
	private int age;
	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}

public class DogList {
	public static void main(String[] args) {
		// dogList를 만들어서 반복문으로 1부터 10까지
		// Dog를 총 10개 생성하여
		List<Dog> dogList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Dog dog  = new Dog();
			dogList.add(dog);
			dog.setName("name : 강아지" + (i+1));
			dog.setAge(i+1);
			dog.setType("푸들");
			
		}
		for (int i = 0; i < 10; i++) {
			Dog name = dogList.get(i);
			Dog age = dogList.get(i);
			Dog type = dogList.get(i);
			System.out.println(name.getName() + " age : " +age.getAge() +" 종류 : " + type.getType());

		}
	}

}
