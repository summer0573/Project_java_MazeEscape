package ME_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class BoardDao {
    private Connection conn; //DB Ŀ�ؼ� ���� ��ü
    private static final String USERNAME = "summer0573";//DBMS���� �� ���̵�
    private static final String PASSWORD = "mirim2021";//DBMS���� �� ��й�ȣ
    private static final String URL = "jdbc:mysql://localhost:information_schema/boarddb";//DBMS������ db��
    
    public BoardDao() {
        try {
            System.out.println("������");
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("����̹� �ε� ����");
        } catch (Exception e) {
            System.out.println("����̹� �ε� ���� ");
            try {
                conn.close();
            } catch (SQLException e1) {    }
        }
        
        
    }
}
 