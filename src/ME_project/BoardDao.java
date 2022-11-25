package ME_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class BoardDao {
    private Connection conn; //DB 커넥션 연결 객체
    private static final String USERNAME = "summer0573";//DBMS접속 시 아이디
    private static final String PASSWORD = "mirim2021";//DBMS접속 시 비밀번호
    private static final String URL = "jdbc:mysql://localhost:information_schema/boarddb";//DBMS접속할 db명
    
    public BoardDao() {
        try {
            System.out.println("생성자");
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("드라이버 로딩 성공");
        } catch (Exception e) {
            System.out.println("드라이버 로딩 실패 ");
            try {
                conn.close();
            } catch (SQLException e1) {    }
        }
        
        
    }
}
 