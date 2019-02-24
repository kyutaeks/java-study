package reuse;

import java.util.ArrayList;

public class BaseBall {

	public static void main(String[] args) {
		
		RanNum num = new RanNum();
		Scan put = new Scan();
		Compare com = new Compare();
		
		ArrayList<Integer> num1 = new ArrayList<>();
		String[] put1= new String[0];
		
		num1=num.array1(4);
		
		while(com.sCnt!=4) {
			put1=put.scanInput(4);
			com.compare(num1, put1);			
		}
		System.out.println("수고하셨습니다.");
	}
}
