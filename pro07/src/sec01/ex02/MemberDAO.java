package sec01.ex02;
//����Ͻ�����(������ �Ѱž�?) = > DB�� �����ϰ� ȸ�������� ������ ȭ�鿡 �Ѹ���~ 
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
			//�� Ŭ������ DB�� �����ϰ� ���(ȸ������)�� ����Ʈȭ ��Ŵ
public class MemberDAO {
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String user = "scott";
	private static final String pwd = "tiger";
	private Connection con;
	//private Statement stmt; �ؿ��� ���϶��
	private PreparedStatement pstmt;
						//db�� list�� ����
	public List listMembers() {
		List list = new ArrayList();
		try {
			connDB();	//���� ���� (open[x])
			String query = "select * from t_member ";	//�ܼ� ���ڿ�(String)
			//System.out.println(query);
			System.out.println("prepareStatement: " + query);
			// SQL ������ ȸ�� ������ ��ȸ while ���� ������ ���ؼ�...
			//ResultSet rs = stmt.executeQuery(query);	//����
			pstmt = con.prepareStatement(query);	//�Ķ��Ÿ�� ����
			ResultSet rs = pstmt.executeQuery();			
			while (rs.next()) {							//rs�� ���ڵ� �����̰� next�� ���� ���ڵ�  //rs.next=������ ���̸� ���๮X
				// ��ȸ�� ���ڵ��� �� �÷� ���� �޾� �´�	(each�� ���� 3���� ��)
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				// �� �÷� ���� �ٽ� MemberVO ��ü�� �Ӽ��� ����
				MemberVO vo = new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);
				// ������ MemberVO ��ü�� �ٽ� ArrayList�� ����
				list.add(vo);				
			}
			rs.close();		//�����ͺ��̽��� �� �ݾ���� �����ͼջ�X
			pstmt.close();
			con.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ��ȸ�� ���ڵ��� ������ŭ MemberVO ��ü�� ������ ArrayList�� ��ȯ
		return list;
	}
	
	private void connDB() {		//�����Ҹ� ������ Ŭ����(����)
		try {
			Class.forName(driver);	//WebContent.WEB-INF.lib�� �� 2���� jar������ ����̹�������
			System.out.println("Oracle ����̹� �ε� ����");
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection ���� ����");
			//stmt = con.createStatement();
			//System.out.println("Statement ���� ����");
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}