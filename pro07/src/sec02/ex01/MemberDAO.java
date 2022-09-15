package sec02.ex01;
//����Ͻ�����(������ �Ѱž�?) = > DB�� �����ϰ� ȸ�������� ������ ȭ�鿡 �Ѹ���~ 
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.naming.Context;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
			//�� Ŭ������ DB�� �����ϰ� ���(ȸ������)�� ����Ʈȭ ��Ŵ
public class MemberDAO {
	/*private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String user = "scott";
	private static final String pwd = "tiger";*/
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;
						
	public MemberDAO() {	//�����ڷμ� Ŭ���� �ȿ� ������ ����(�ʵ�)�� �ʱ�ȭ�� (���⼭�� dataFactory / ctx, envContext�� �ʵ带 ���� ����)
		try {
			//JNDI�� �����ϱ� ���� �⺻ ���(java:/comp/env)�� ����
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			/*���� context.xml�� ������ name ���� jdbc/oracle�� �̿��� ��Ĺ�� �̸� ������ DataSource�� �޾ƿ´�*/
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<MemberVO> listMembers() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		try {
			//connDB();	��ſ� dataFactory ���
			// DataSource�� �̿��� �����ͺ��̽��� ����
			con = dataFactory.getConnection();
			String query = "select * from t_member ";	
			System.out.println("prepareStatement: " + query);
			pstmt = con.prepareStatement(query);	
			ResultSet rs = pstmt.executeQuery();			
			while (rs.next()) {							
				// ��ȸ�� ���ڵ��� �� �÷� ���� �޾� �´�	(each�� ���� 3���� ��)
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				MemberVO vo = new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);
				list.add(vo);				
			}
			rs.close();		
			pstmt.close();
			con.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/*private void connDB() {		
		try {
			Class.forName(driver);	
			System.out.println("Oracle ����̹� �ε� ����");
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection ���� ����");
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}*/
}