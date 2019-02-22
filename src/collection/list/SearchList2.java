package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchList2 {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i= 0; i < 5; i++) {
			int ranNum = (int)(Math.random()*10)+1;
			numList.add(ranNum);
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("맞출번호를 ,를 기준으로 입력해주세요.");
		String strNum = scan.nextLine();
		String[] strNums = strNum.split(",");
		ArrayList<Integer> anList = new ArrayList<>();
//		<> 안에는 어떤 데이터타입이던지 들어갈수있다.
		
		for(int i = 0 ; i<strNums.length;i++) {
			int num = Integer.parseInt(strNums[i]);
			//Integer.parseInt 를 하게되면 데이터타입을 바꿔준다. 스트링에서 숫자로.
			anList.add(num);
		}
//		System.out.println(anList);	
			
		int num= 0;
		for(int i =0 ; i<5 ; i++) {
			int anNum =anList.get(i); 
					/*(int)(Math.random()*10)+1;*/
			if(numList.indexOf(anNum)!=-1) {
				num++;
			}
			
//			System.out.println(numList.indexOf(ranNum));
		}
		System.out.println("numList : " + numList);
		System.out.println("anList : " + anList);
		System.out.println("맞은갯수 : " + num);
		
	}
}
