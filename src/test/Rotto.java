package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Rotto {
	public static void main(String[] args) {
		for (int x = 0; x < 5; x++) {
			ArrayList<Integer> rotto6 = new ArrayList<>();
			for (int i = 0; i < 6; i++) {
				int a = (int) (Math.random() * 45) + 1;
				if (rotto6.indexOf(a) == -1) {
					rotto6.add(a);
				} else {
					i--;
				}
			}
			System.out.println(rotto6);
			Scanner scan = new Scanner(System.in);
			int c = 0;
			System.out.println(",를 기준으로 숫자 6개를 입력해주세요");
			String[] str = scan.nextLine().split(" ");
			int[] y = new int[6];
			for (int i = 0; i < y.length; i++) {
				y[i] = Integer.parseInt(str[i]);
			}
			for (int i = 0; i < 6; i++) {
				if (rotto6.indexOf(y[i]) != -1) {
					if (i == rotto6.indexOf(y[i])) {
						c++;
					}
				}

			}
			System.out.println(c + "개 맞았습니다.");
		}

	}

}