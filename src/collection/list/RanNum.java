package collection.list;

import java.util.ArrayList;

public class RanNum {

	public ArrayList<Integer> array1(int a) {
		ArrayList<Integer> RandomNum = new ArrayList<>();
		for (int i = 0; i < a; i++) {
			int input = (int) (Math.random() * 9) + 1;
			if (RandomNum.indexOf(input) == -1) {
				RandomNum.add(input);
			} else {
				i--;
			}
		}
		return RandomNum;
	}

}
