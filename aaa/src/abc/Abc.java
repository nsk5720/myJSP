package abc;

import java.io.IOException;

@WebServlet("/input")
public class Abc extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		System.out.println("init �޼��� ȣ��");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		System.out.println("���̵�:"+user_id);
		System.out.println("��й�ȣ:"+user_pw);
		String[] subject = request.getParameterValues("subject");
		for(String str:subject) {			//�迭 ����
			System.out.println("������ ����:"+str);
		}
	}

	@Override
	public void destroy() {
		System.out.println("destroy �޼��� ȣ��");
	}
}
