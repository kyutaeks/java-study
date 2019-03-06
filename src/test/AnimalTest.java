package test;

public class AnimalTest implements DoSome {

	@Override
	public void eat() {
		System.out.println("먹는다");
		
	}

	@Override
	public void sleep() {
		System.out.println("잔다");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		System.out.println("뛴다");
		// TODO Auto-generated method stub
		
	}

}
