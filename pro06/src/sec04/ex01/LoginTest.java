package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginTest")

public class LoginTest extends HttpServlet{
	@Override
	public void init() {
		System.out.println("init �޼��� ȣ��");
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
		System.out.println("���̵� :" + id);
		System.out.println("���̵� :" + pw);
		
		//ID�� ��й�ȣ�� ������ �ٽ� �α������� �̵��Ѵ�.
		if(id!=null && (id.length()!=0)) {
			out.print("<html");
			out.print("<body>");
			out.print(id + "��!! �α��� �ϼ̽��ϴ�.");
			out.print("</body>");
			out.print("</html>");
		}else {
			out.print("<html>");
			out.print("<body>");
			out.print("���̵� �Է��ϼ���!!!");
			out.print("<br>");
			out.print("<a href='/pro06/text01/login.html'>�α���â���� </a>");
			out.print("</body>");
			out.print("</html>");
		}
	}


	
	public void destroy() {
		System.out.println("destroy �޼��� ȣ��");
	}
}
