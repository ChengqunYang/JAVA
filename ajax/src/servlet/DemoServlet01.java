package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet01
 */
public class DemoServlet01 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String age = request.getParameter("age");   //��������
		System.out.println("�յ���һ������..."+ name + "=" + age);
		//��Ӧ����
		response.setContentType("text/html;charset=UTF-8");  
		response.getWriter().write("�յ�������");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("��������һ��post����,��Ҫȥִ��get�Ĵ�����");
		doGet(request, response);
	}

}