package collection.list;
import java.util.ArrayList;
import java.util.List;

class Cat{
private String name;
private int age;

public Cat() {
	super();
}
public Cat(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Cat [name=" + name + ", age=" + age + "]";
}

}
public class CatList {
	
	public static void main(String[] args) {
		
//		System.out.println(cat);
		Cat cat = new Cat();
		List<Cat> catList = new ArrayList<>();
		for(int i = 0; i<10;i++) {
			cat = new Cat();
			catList.add(cat);
			cat.setName("name : 냥이 " + (i+1));
			cat.setAge((int)(Math.random()*30)+1);
		}
		for(int i = 0 ; i<10; i++) {
			System.out.println(catList.get(i));
		}
	}

}
