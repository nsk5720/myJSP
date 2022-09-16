package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//A��ũ �Ŵ� ���_4����
//@WebServlet("/first")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");		//�ѱ۷� �޾�!
		
		//�� ����� �����ص� url�� first�� second�� ���������� �� �ִ� ������ ����
		RequestDispatcher dispatch = request.getRequestDispatcher("second?name=lee");
		dispatch.forward(request, response);
		// ������ 255�� �̻� ��� ����(�ٹ����)
	}
	
}
