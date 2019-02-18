package oop.inter;

import oop.inherit.Animal;

public class Print implements PrintSome {

	@Override
	public void printString(String str) {
		System.out.println(str);

	}

	@Override
	public void printchar(char c) {
		System.out.println(c);

	}

	@Override
	public void printInt(int num) {
		System.out.println(num);

	}

	public static void main(String[] args) {
		Print p = new Print();
		p.printString("abc");
		p.printchar('c');
		p.printInt(5);

		PrintSome ps = new Print();
		ps.printString("나는 학원에 왔습니다");

		Animal a = new Animal();
		a.run();
	}

}
