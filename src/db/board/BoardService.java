package db.board;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardService {

	public void selectBoard() {
		String sql = "select * from board_info";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			System.out.println("제목");
			while (rs.next()) {
				System.out.println(rs.getString("bi_title"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
	}

	public void insertBoard(String title , String content) {
		String sql = "insert into board_info(bi_num, bi_title, bi_content, bi_credat, bi_cretim)";
		sql += "values(seq_bi_num.nextval,?,?,to_char(sysdate,'YYYYMMDD'),TO_CHAR(SYSDATE,'HH24MISS'))";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			int cnt = ps.executeUpdate();
			if(cnt==1) {
				System.out.println("정상적으로 게시물이 등록 완료!");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
	}

	public void updateBoard(String num, String title, String content) {
		String sql = "update board_info set bi_title = ? , bi_content = ? where bi_num=?";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, num);
			int cnt = ps.executeUpdate();
			if(cnt==1) {
				System.out.println("정상적으로 "+ num + "수정 되었습니다.");
			}else {
				System.out.println("선택하신 게시물이 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteBoard(String num) {
		String sql = "delete from board_info where bi_num=?";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, num);
			int cnt = ps.executeUpdate();
			if(cnt==1) {
				System.out.println("게시물이 삭제되었습니다.");
			}else {
				System.out.println("선택하신 게시물이 없습니다.");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
