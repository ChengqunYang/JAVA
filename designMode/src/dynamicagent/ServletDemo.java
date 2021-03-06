package dynamicagent;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo
 */

/**
 * 动态代理解决全站乱码问题:
 * 	无论是get方式还是post方式执行下面语句不存在中文乱码问题
 * 	在过滤器中，为request上的getparameter()功能进行增强
 * 		思路：
 * 			判断当前的请求是get/post request/getMethod();
 * 			如果是post，设置一句话：request.setCharacterEncoding(""utf-8");  放行
 * 			如果是get，调用原来的String v = request.Parameter(name);
 * 			将v进行转码，放行
 * @author DELL
 *
 */
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public ServletDemo() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String um = request.getParameter("username");
		System.out.println(um);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String um = request.getParameter("username");
		System.out.println(um);
	}

}
