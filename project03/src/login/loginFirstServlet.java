 package login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//A��ũ �Ŵ� ���_4���� _ �ּҿ� null�� ������
@WebServlet("/loginFirst")
public class loginFirstServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");		//�ѱ۷� �޾�!

		RequestDispatcher dispatch = request.getRequestDispatcher("/loginSk");
		dispatch.forward(request, response);
	}
	
}
