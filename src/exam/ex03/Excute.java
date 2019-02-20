package exam.ex03;

public class Excute {
public static void main(String[] args) {
	Dog[] dogs =new Dog[10];
	for(int i =0 ; i<dogs.length ; i++) {
		Dog d = new Dog();
		d.setName("ㄱㅇㅈ");		
		System.out.println("i번째 dog의 이름은 : "+ d.getName());
		d.setAge(i);
		System.out.println("i번째 dog의 나이는 : " +d.getAge());
	
		
	}
}
}
