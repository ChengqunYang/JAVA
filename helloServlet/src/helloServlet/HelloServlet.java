package helloServlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet implements Servlet{
				
			//多次,一次请求对应一次service
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("helloServlet......");
		
	}
			//一次,销毁的时候调用,从服务器中移除或者正常关闭服务器就会执行.
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
			//用于访问web.xml文件中的  <init-param>内容.
	/*ServletConfig config = getServletConfig();
	 * String name = config.getInitParameter("name");
	 * */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}
			//一次创建对象就会执行一次,默认初次访问就会调用
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}


	
}
