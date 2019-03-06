package test;

public class StaticTest {

	public static class Agent{
	 int a = 4; 
	 String str = "ab";
	}
	
	public static void main(String[] args) {
		Agent ag = new Agent();
		System.out.println(ag.a);
		ag.a = 2;
		Agent ag1 = new Agent();
		System.out.println(ag1.a);
		Agent str = new Agent();
		System.out.println(str.str);
		
	}
}
