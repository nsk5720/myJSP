package sec01.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//A��ũ �Ŵ� ���
//@WebServlet("/first")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");		//�ѱ۷� �޾�!
		PrintWriter out = response.getWriter();
		//response.sendRedirect("second");
		response.addHeader("Refresh", "5;url=second");		//5�� ���� �� Ȩ������ �Ѿ
	}
	
}