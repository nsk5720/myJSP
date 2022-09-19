package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
// �α��� ���� Ȯ���� ������ session Id�� url�� �Բ� ��
//@WebServlet("/login")
public class SessionTest extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	

	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		
		if(session.isNew()) {
			//ù ���� ��
			if(user_id !=null) {
				session.setAttribute("user_id", user_id);	//session���ٰ� user_id(ashram7) ���� => ȭ�鿡 �Ⱥ��̴� �κ� �� 
				String url = response.encodeURL("login");
				out.println("<a href="+url+">�α��� ���� Ȯ��</a>");	// ȭ�鿡 �������� �κ� => �α��� ���� Ȯ��
			}else {
				out.print("<a href='login2.html'>�ٽ� �α��� �ϼ���!!</a>");
				session.invalidate();
			}
		} else {
			// �̹� ������ ������(�������� html�� ����)
			user_id = (String) session.getAttribute("user_id");
			if(user_id !=null && user_id.length() !=0) {
				out.print("�ȳ��ϼ���" + user_id + "��!!!");
			} else {
				//������ ���ٰ� Ű�� ������ ������� �� html �α��� ȭ���� ��ġ�� �ʰ� �ٷ� pro09/login���� ������ ���
				out.print("<a href='login2.html'>�ٽ� �α��� �ϼ���!!</a>");
				session.invalidate();		//���� ������ ����
			}
		}
	}


	
}
