package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//A��ũ �Ŵ� ��� _ ������ �޾Ƽ� ������
//@WebServlet("/first")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");		//�ѱ۷� �޾�!
		PrintWriter out = response.getWriter();
		//���� �޾Ƽ� ������
		response.sendRedirect("second?name=lee");
		
	}
	
}