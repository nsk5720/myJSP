package sec03.ex03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login5")
public class LoginServlet5 extends HttpServlet{
	
@Override
	public void init() {
		System.out.println("init �޼��� ȣ��");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		String address = request.getParameter("user_address");
		System.out.println("���̵�:" + id);
		System.out.println("��й�ȣ:" + pw);
		
		String data = "<html>";
			data += "<body>";
			data += "���̵�: " + id;
			data += "<br>";
			data += "��й�ȣ: " + pw;
			data += "<br>";
			data += "�ּ�: " + address;
			data += "</body>";
			data += "</html>";
		out.print(data);
	}
	public void destroy() {
		System.out.println("destroy �޼��� ȣ��");
	}
}