package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UdateBoard {

	public static void main(String []args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		
		Connection con =null;
		
		try {
			con=DriverManager.getConnection(url, id, pwd);
			String sql = "update board_info \r\n" +
					"set bi_title = ? , \r\n" +
					"bi_content = ? \r\n" +
					"where bi_num=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,"제목!!!");
			ps.setString(2,"내용!!!");
			ps.setInt(3,7);
			int cnt = ps.executeUpdate();
			//executeUpdate : 정상적으로 들어가면 1을 반환하고 아니면 0을 반환한다.
			if(cnt == 1) {
				System.out.println("정상적으로 업데이트 됨!");
			}else {
				System.out.println("오류는 아닌데 업데이트는 안됨!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
