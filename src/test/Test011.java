package test;

public class Test011 {
	public static void main(String[] args) {
		int [] abc = new int[10];
		
		for(int i : abc) {
			abc[i] = (int)(Math.random()*10)+1;

			System.out.println(abc[i]);
		}
	}

}
// 오류테스트