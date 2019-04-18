package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Student;
import service.StudentService;
import service.impl.StudentServiceImpl;

/**
 * Servlet implementation class EditServlet
 * ������ѧ���ĸ���,��ѯһ��ѧ������Ϣ,Ȼ����ת������ҳ��
 */
public class EditServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			//1.����id
			int sid = Integer.parseInt(request.getParameter("sid"));
			//2.��ѯѧ��id
			StudentService service = new StudentServiceImpl();
			Student stu = service.findStudentById(sid);
			//3.��ʾ����
			//������
			request.setAttribute("stu", stu);
			//��ת
			request.getRequestDispatcher("edit.jsp").forward(request, response);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
