package data;

public class StringType {
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + 123);
		// 문자 + 문자 = 문자 , 숫자 + 문자 = 문자
		String str2 = new String("123");
		System.out.println(str.contentEquals(str2));
	}

}