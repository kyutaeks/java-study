
public class Overloading {
	public static int plus(int x, int y) {
		System.out.println(x+y);
		return 0;
	}

	public static int plus(int x, int y, int z) {
		System.out.println(x+y+z);
		return 0;
	}

	public static String plus(String x, String y) {
		System.out.println(x+y);
		return null;
	}

	public static void main(String[] args) {
		plus(1,2);
		plus(4,1,5);
		plus("안녕","하세요");
	}
}
