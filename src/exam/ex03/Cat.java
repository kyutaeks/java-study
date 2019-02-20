package exam.ex03;

public class Cat {
	public String name;
	public int age;

	public String toString() {
		return "이 고양이의 이름은  " +name + " 이구요,나이는 " + age + "입니다.";
	}
//	여기서 toString에 오버라이딩 되기 때문에 메모리 값이 아니라 내가 가지고있는 리턴값이 나오게된다.
	public static void main(String[] args) {
		Cat[] cat = new Cat[3];
		for(int i=0; i<cat.length ;i++) {
			cat[i] = new Cat();
			cat[i].name = "고양이" + i;
			cat[i].age = i;	
					
		}
		for(int i=0; i<cat.length ;i++) {
			System.out.println(i+"번째 고양이 이름 : "+ cat[i].name);
			System.out.println(i+"번째 고양이 나이 : "+ cat[i].age);
			System.out.println(cat[i]);
		}
//		밑에 코딩은 위랑 결과는 같지만 하드코딩
		
//		Cat c1 = new Cat();
//		Cat c2 = new Cat();
//		Cat c3 = new Cat();
//		c1.name = "이름1";
//		c1.age = 0;
//		c2.name = "이름2";
//		c2.age = 1;
//		c3.name = "이름3";
//		c3.age = 2;
//		System.out.println(c1.name);
//		System.out.println(c1.age);
//		System.out.println(c2.name);
//		System.out.println(c2.age);
//		System.out.println(c3.name);
//		System.out.println(c3.age);

	}
}
