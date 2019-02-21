package syntax;

public class Loop3 {

	public static void main(String[] args) {
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;
		}
		
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			System.out.println(num);
		}
		
		for (int num:nums) { // [nums의 구성원의 data type] [변수명] : [배열명]
			System.out.println(num);
		}
	}
}
