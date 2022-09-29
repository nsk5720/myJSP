package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/mem.do")
public class MemberController extends HttpServlet{
		MemberDAO memberDAO;
	
	public void init() throws ServletException {
		memberDAO = new MemberDAO();
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//DB�� �α��� ���� ��ġ���� Ȯ��
		String user_id = request.getParameter("userId");
		String user_pwd = request.getParameter("userPwd");

		MemberVO memberVO = new MemberVO();
		memberVO.setId(user_id);
		memberVO.setPwd(user_pwd);
		MemberDAO dao = new MemberDAO();
		boolean result = dao.isExisted(memberVO);
		
		if(result) {
				//���� �α��� �� �������Ʈ�� �̵�
				if(user_id .equals("admin")) {
			HttpSession session = request.getSession();
			session.setAttribute("isLogon", true);
			session.setAttribute("login.id", user_id);
			session.setAttribute("login.pwd", user_pwd);
			
			//ȸ������â���� �ѱ��
			List<MemberVO> membersList = memberDAO.listMembers();
			request.setAttribute("membersList", membersList);
			RequestDispatcher dispatch = request.getRequestDispatcher("sub03/listMembers.jsp");
			dispatch.forward(request, response);
				} else {	//�Ϲ� �α��� �� ���� ������(�α��� �� ������) ����
					response.sendRedirect("/project03/index.jsp");
				}
		} else {		//�α��� ���� ��
			out.print("<html><body>ȸ�� ���̵� Ʋ���ϴ�.");
			out.print("<a href='sub04/sub04.jsp'> �ٽ� �α����ϱ�</a><br>");
			out.print("</body></html>");
		}	

		
		
		
		
		
	}
}