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
 * ��̬�������ȫվ��������:
 * 	������get��ʽ����post��ʽִ��������䲻����������������
 * 	�ڹ������У�Ϊrequest�ϵ�getparameter()���ܽ�����ǿ
 * 		˼·��
 * 			�жϵ�ǰ��������get/post request/getMethod();
 * 			�����post������һ�仰��request.setCharacterEncoding(""utf-8");  ����
 * 			�����get������ԭ����String v = request.Parameter(name);
 * 			��v����ת�룬����
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