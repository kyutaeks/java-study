package exam.ex04;

public class Excute {
	public static void space(Action p) {
		p.sleep();
	}
public static void main(String[] args) {
	Action c = new Cat();
	Action p = new Person();
	
	space(c);
	space(p);
}
}