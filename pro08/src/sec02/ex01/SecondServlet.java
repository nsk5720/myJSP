package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//A��ũ �Ŵ� ��� _ ������ �޾Ƽ� ������
//@WebServlet("/second")
public class SecondServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");		//�ѱ۷� �޾�!
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		String name=request.getParameter("name");   //������ �޾��ִ� ���� ������ ���� ���� 'lee'
		out.println("�̸�:"+name);
		out.println("<br>");
		out.println("</body></html>");
	}
	
}