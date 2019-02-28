package db.board2;

import java.util.Scanner;

//재귀호출
public class EXam {
	public static int getBornYear() {
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 나이를 입력해주세요.");
		int bornYear = 2019;
		try {
			bornYear -= Integer.parseInt(scan.nextLine()) -1;
		} catch (Exception e) {
			System.out.println("나이는 숫자로 입력해!!");
			bornYear = getBornYear();
		}
		return bornYear;
	}

	public static void main(String[] args) {
		int bornYear = getBornYear();
		// int age = Integer.parseInt(scan.nextLine());
		System.out.println("당신의 나이는 " + bornYear + " 입니다.");
	}
}
