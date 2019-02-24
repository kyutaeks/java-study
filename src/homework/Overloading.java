package homework;

public class Overloading {
	public static int plus(int x, int y) { //메소드 plus 데이터 타입 int 파라미터 개수 2개
		System.out.println(x+y);
		return 0;
	}

	public static int plus(int x, int y, int z, int q) { // 메소드 plus 데이터 타입 int 파라미터 개수 4개
		System.out.println(x+y+z+q);
		return 0;
	}

	public static String plus(String x, String y) { //메소트 plus 데이터타입 String 파라미터 갯수 2개
		System.out.println(x+y);
		return null;
	}
	public static String plus(String x, String y, String z) { //메소트 plus 데이터타입 String 파라미터 갯수 2개
		System.out.println(x+y+z);
		return null;
	}

	public static void main(String[] args) {
		plus(1,2);
		plus(4,1,5,6);
		plus("12","34");
		plus("12","34","56");
	}
}
