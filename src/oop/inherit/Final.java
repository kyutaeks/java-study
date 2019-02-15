package oop.inherit;

public class Final {
	final int num;
	Final(){
		num = 8;
	}
	final String str = "abc";
	public static void main(String[]args) {
		Final f = new Final();
		System.out.println(f.num);
		System.out.println(f.str);

	}
	

}
