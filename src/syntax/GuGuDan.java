package syntax;

public class GuGuDan {

	public static void main(String[] args) {
		for (int s = 9; s > 0; s--) {
			for (int i = 9; i > 0; i--) {
				
				System.out.print(s + "X" + i + "=" + (s * i));
				if (i != 1) {
					System.out.print(" , ");
				}
			}
			System.out.println();

		}
	}
}