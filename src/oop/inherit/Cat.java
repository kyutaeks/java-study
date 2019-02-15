package oop.inherit;

public class Cat extends Animal {
	Cat(int age, String type) {
		this.age = age;
		this.type = type;
	}
	
	public static void main(String[]args) {
		Animal cat = new Cat(6, "샴");
		cat.eat();
		cat.sleep();
		cat.run();
		Animal animal = new Dog(6,"푸들");
		animal.eat();
		animal.sleep();
		animal.run();
		
	}
}