package exam.ex01;

public class StringEquals2 {
	String str = "1";

	public static void main(String[] args) {
		StringEquals2 se1 = new StringEquals2();
		System.out.println(se1.str);
		
		StringEquals2 se2 = new StringEquals2();
		
		System.out.println(se1 == se2);
		
		System.out.println(se1.str == se2.str);
		
		se2.str = "2";
		
		System.out.println(se1.str == se2.str);
		
//		 se1 의 new StringEquals2() 바라보는 주소와
//		 se2의 new StringEquals2() 바라보는 주소가 같다.
//		String str = new String("1");
//		이것은 두번참조 시키는것이다.
	}
}
