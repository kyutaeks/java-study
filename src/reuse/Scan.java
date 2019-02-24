package reuse;

import java.util.Scanner;

public class Scan {
	public String[] scanInput(int a) {
		Scanner scan = new Scanner(System.in);
		System.out.print("0~9까지의 숫자중 4개를 입력해주세요 : ");
		String numStr = scan.nextLine();
		String[] str = numStr.split(",");
		return str;		
	}

}
