package exam.ex03;

public class Dog {
	private String name;
	private int age;

	public void setName (String name) {
		this.name = name;
		
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
//		get , set method 라고 한다. 
//		얻다   , 넣다
//		pojo의 멤버변수들을 private를 사용하는 것들은  기본으로 get , set 메소드를 사용한다.
		
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

//	public static void main(String[] args) {
//		Dog d = new Dog();
//		d.name = "카드";
//		d.back();
//		d.setAge(10);
//		System.out.println(d.age);
//	}
}
