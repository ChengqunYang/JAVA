package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet02
 */
public class DemoServlet02 extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//因为响应给客户端的数据有中文所以需要设置编码方式  
		response.setContentType("text/html;charset=UTF-8");  
		System.out.println("收到了请求");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		System.out.println("name="+name +"age " +age);
		response.getWriter().write("给您一份数据");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
