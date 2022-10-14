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

import login.MemberVO;

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
			
			
			
			//ȸ������â���� �ѱ��
			List<MemberVO> membersList = memberDAO.listMembers();
			request.setAttribute("membersList", membersList);
			RequestDispatcher dispatch = request.getRequestDispatcher("sub03/listMembers.jsp");
			dispatch.forward(request, response);
				} else {	//�Ϲ� �α��� �� ���� ������(�α��� �� ������) ����
					HttpSession session = request.getSession();
					session.setAttribute("isLogon", true);
					session.setAttribute("login.id", user_id);
					response.sendRedirect("/project03/main/index.jsp");
				}
		} else {		//�α��� ���� ��
			out.print("<html><body>ȸ�������� ��ġ���� �ʽ��ϴ�.");
			out.print("<a href='sub04/sub04.jsp'> ȸ�� ���� �ϱ� </a><br>");
			out.print("</body></html>");
		}	
	}
}
	
		//���� ���� ��� �߰�
		/*String nextPage = null;
		String action = request.getPathInfo();
		System.out.println("action:" + action);
		if (action == null || action.equals("/listMembers.do")) {
			List<MemberVO> membersList = memberDAO.listMembers();
			request.setAttribute("membersList", membersList);
			nextPage = "/project03/sub03/listMembers.jsp";
			} else if (action.equals("/addMember.do")) {
			String id = request.getParameter("id");
			String pwd = request.getParameter("pwd");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			MemberVO memberVO = new MemberVO(id, pwd, name, email);
			memberDAO.addMember(memberVO);
			request.setAttribute("msg", "addMember");
			nextPage = "/mem.do/listMembers.do";
		} else if (action.equals("/memberForm.do")) {
			nextPage = "/project03/sub03/memberForm.jsp";
		}else if(action.equals("/modMemberForm.do")){
		     String id=request.getParameter("id");
		     MemberVO memInfo = memberDAO.findMember(id);
		     request.setAttribute("memInfo", memInfo);
		     nextPage="/project03/sub03/modMemberForm.jsp";
		}else if(action.equals("/modMember.do")){
		     String id=request.getParameter("id");
		     String pwd=request.getParameter("pwd");
		     String name= request.getParameter("name");
	         String email= request.getParameter("email");
		     MemberVO memberVO = new MemberVO(id, pwd, name, email);
		     memberDAO.modMember(memberVO);
		     request.setAttribute("msg", "modified");
		     nextPage="/mem.do/listMembers.do";
		}else if(action.equals("/delMember.do")){
		     String id=request.getParameter("id");
		     memberDAO.delMember(id);
		     request.setAttribute("msg", "deleted");
		     nextPage="/mem.do/listMembers.do";
		}else {
			List<MemberVO> membersList = memberDAO.listMembers();
			request.setAttribute("membersList", membersList);
			nextPage = "/project03/sub03/listMembers.jsp";
		}
		RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
		dispatch.forward(request, response);
	}
	
	*/

	

