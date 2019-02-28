package db.board2;

import java.util.List;

public class Test {
	public static void main(String[] args) {
		BoardService2 bs = new BoardService2();
		List<BoardInfoVO> biList = bs.selectBoard();
//		bs.selectBoard();

	}
}
