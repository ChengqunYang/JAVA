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
 * ���ڴ���ѧ�����������
 * @author DELL
 *
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		//1.��ȡ�ͻ����ύ����������
		request.setCharacterEncoding("UTF-8");
		String sname = request.getParameter("sname");
		String gender = request.getParameter("gender");
		String phone = request.getParameter("phone");
		String birthday = request.getParameter("birthday");
		//String hobby = request.getParameter("hobby");
		String[] h = request.getParameterValues("hobby");
		String hobby = Arrays.toString(h).substring(1,Arrays.toString(h).length()-1);
		String info = request.getParameter("info");
	
		//2.��ӵ����ݿ�
		  //  Date data = new SimpleDateFormat("YYYY-MM-DD").parse(birthday);
			Student student = new Student(sname,gender,phone,hobby,info,birthday);
			StudentService service = new StudentServiceImpl();
			service.insert(student);
			//3.��ת���б�ҳ
			request.getRequestDispatcher("StudentListServlet").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
