package servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Student;
import service.StudentService;
import service.impl.StudentServiceImpl;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
		//1.获取客户端提交上来的数据
				request.setCharacterEncoding("UTF-8");
				//因为getParameter返回的是String类型,所以这里要获取id需要转换类型
				int sid = Integer.parseInt(request.getParameter("sid"));
				String sname = request.getParameter("sname");
				String gender = request.getParameter("gender");
				String phone = request.getParameter("phone");
				String birthday = request.getParameter("birthday");
				//String hobby = request.getParameter("hobby");
				String[] h = request.getParameterValues("hobby");
				String hobby = Arrays.toString(h).substring(1,Arrays.toString(h).length()-1);
				String info = request.getParameter("info");
			
				//2.整合为一个学生对象,包含要更新的所有信息和要更新的学生的学号
				//  Date data = new SimpleDateFormat("YYYY-MM-DD").parse(birthday);
				Student student = new Student(sid,sname,gender,phone,hobby,info,birthday);
				
				//3.更新数据库的数据
				StudentService service = new StudentServiceImpl();
				service.update(student);
				
				//4.跳转界面
				request.getRequestDispatcher("StudentListServlet").forward(request,response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
