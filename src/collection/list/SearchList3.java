package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchList3 {
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			numList.add((int) (Math.random() * 9) + 1);
		}
		System.out.println(numList);
		Scanner Scan = new Scanner(System.in);
		System.out.println(" , 로 구분하여 4개의 숫자를 입력해 주세요.");
		String strNum = Scan.nextLine();
		String[] strNums = strNum.split(",");
		System.out.println("입력하신 숫자는 : " + strNum);

		int content = 0;
		for (String str : strNums) {
			int num = Integer.parseInt(str);
			if (numList.indexOf(Integer.parseInt(str)) != -1) {
				content++;
			}
//		int content = 0;
//		for (String str =) {
//			int abc = nextNum.get(i);
//			if(numList.indexOf(abc)!=-1) {
//				content++;
//			}
//		}

		}
		System.out.println("맞은갯수 : " + content);
	}
}
// 다시 복습.
