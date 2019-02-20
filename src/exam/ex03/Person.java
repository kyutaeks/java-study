package exam.ex03;

public class Person {
	public String name;
	public int age;

	public static void main(String[] args) {
		Person[] p = new Person[3];
		for (int i = 0; i < p.length; i++) {
			p[i] = new Person();
			p[i].name = "KT" + i;
			p[i].age = i;
		}
		// 아래의 출력값은
		// p[0].name => 이름 0
		// p[0].age => 0
		for (int i = 0; i < p.length; i++) {
			System.out.println(i+"번째 방 name: "+p[i].name);
			System.out.println(i+"번째 방 age: "+p[i].age);
			
		}

	}
}

//Person p = new Person();
//p.name = "이규택";
//p = new Person();
//위에 p.name 가 설정이 되었어도 10라인에서 p 가 다시 초기화 되기때문에 null이 된다. 여기서 String이 static이면 
//변하지않는값으로 고정된다.
//System.out.println(p.name);
//System.out.println(p.age);