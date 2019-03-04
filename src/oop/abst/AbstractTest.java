package oop.abst;

interface Test {
	public void play();

	public void run();
}
class Child extends AbstractTest{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	
}
public abstract class AbstractTest implements Test {
//	abstract 클래스는 상속에서만 가능하다.
	AbstractTest(){
		System.out.println("난 됨");
	}
	public static void main(String[] args) {
	
		
	}
}
