package exam.ex02;

public class IntArray {
	public int[] nums = new int[10];
	public boolean compare(int num) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0)
				return false;

			if (nums[i] == num)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		IntArray ia = new IntArray();
//		ia.nums[0]=2;
		for (int i = 0; i < ia.nums.length; i++) {
//			ia.nums[i] = (int) (Math.random() * 10) + 1;
			int num =(int)(Math.random() * 10) + 1;
			if (ia.compare(num)) {
				i--;
			}else {
				ia.nums[i] = num;
//				if문을 쓸수있다는건 데이터타입이 boolean이라는것이다.
			}
		}

		for (int i = 0; i < 10; i++) {
			for (int j = i + 1; j < ia.nums.length; j++) {
				if (ia.nums[i] < ia.nums[j]) {
					int tmp = ia.nums[i];
					ia.nums[i] = ia.nums[j];
					ia.nums[j] = tmp;
				}
			}
		}
		for (int i = 0; i < ia.nums.length; i++) {
			System.out.println("ia.nums[" + i + "]=" + ia.nums[i]);

		}
	}
}
