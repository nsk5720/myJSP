package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*�� �������� �����ϴ� ����� ������ ����.
3. ��Ű : Ŭ���̾�Ʈ PC�� Cookie ���Ͽ� ������ ������ �� �� ���������� ����*/
@WebServlet("/set")
public class SetCookieValue extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		Date d = new Date(); //��Ű�� �̸�=cookieTest
		Cookie c =new Cookie("cookieTest", URLEncoder.encode("JSP���α׷����Դϴ�.","utf-8"));
		c.setMaxAge(24* 60* 60);	//1��			3. ����ǻ�Ϳ� ��Ű�� ����
		//c.setMaxAge(-1); //���� �ּ��� �ް� ����� �����ϸ� '"���� ��Ű"�� �����մϴ�.'(��������)	4. ������ ��Ű ����(����+��Ű)
		response.addCookie(c);
		out.println("����ð�: " + d);
		out.println("<br> ���ڿ��� Cookie�� �����մϴ�.");
	}

}
