package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteBoard {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		
		Connection con = null;
		
		try {
			con=DriverManager.getConnection(url, id ,pwd);
			String sql = "delete from board_info where bi_num=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, 5);
			int cnt = ps.executeUpdate();
			//executeUpdate : 수정된 수만큼을  반환한다. 
			//즉, 4개가 업데이트 되면 cnt는 4가 나온다.
			//추가 되건 삭제되건 개수만큼 cnt가 증가한다.
			if(cnt == 1) {
				System.out.println("삭제잘됨!!");
			}else {
				System.out.println("삭제안됬어!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
