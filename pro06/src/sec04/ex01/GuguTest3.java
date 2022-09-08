package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GuguTest3")
public class GuguTest3 extends HttpServlet {
    public void init() {
        System.out.println("init �޼��� ȣ��");
    }	
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws IOException, ServletException {
	    request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html;charset=utf-8");
	    PrintWriter out = response.getWriter();
	    // ���۵� dan�� ���� �޾� �´�.
	    int dan = Integer.parseInt(request.getParameter("dan"));
	
	    out.print(" <table border=1 width=800 align=center>");
	    out.print("<tr align=center bgcolor='#FFFF66'>");
	    out.print("<td colspan=4>" + dan + " �� ���  </td>");
	    out.print("</tr>");
	
	    // for ���� �̿��� �����ؼ� ����� ���̺� ������ ���
	    for (int i = 1; i < 10; i++) {
	    	/*if���� �̿��� ���� ��Ÿ���� <tr>�±׿� ���� ����� �ٸ� ������ ����*/
	        /*out.print("<tr align=center>");*/
	    	if(i%2 == 0) {
	    		out.print("<tr align=center bgcolor='#acfa58'>");
	    		/*out.print("<input type=radio>");
	    		out.print("</input>");*/
	    	}else {
	    		out.print("<tr align=center bgcolor='#81bef7'>");
	    		/*out.print("<input type=checkbox>");
	    		out.print("</input>");*/
	    	}
	    	/*�� �࿡ ���� �ڽ��� üũ�ڽ��� ǥ���Ѵ�*/
	    	out.print("<td width=50>");
	        out.print("<input type=checkbox>");
	        out.print(i);
	        out.print("</input>");
	        out.print("</td>");
	        out.print("<td width=50>");
	        out.print("<input type=radio>");
	        out.print(i);
	        out.print("</input>");
	        out.print("</td>");
	        out.print("<td width=150>");
	        out.print(dan + " *  " + i);
	        out.print("</td>");
	        out.print("<td width=150>");
	        out.print(i * dan);
	        out.print("</td>");
	        out.print("</tr>");
	    }
	
	    out.print("</table>");
	}
    
    public void destroy() {
        System.out.println("destroy �޼��� ȣ��");
    }    
}