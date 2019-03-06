package test;

public class CatTest extends AnimalTest{
	public static void main(String[] args) {
		AnimalTest cat = new CatTest();
		cat.eat();
		cat.run();
		cat.sleep();
	}

}
