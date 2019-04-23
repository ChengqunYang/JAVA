package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Student;
import service.StudentService;
import service.impl.StudentServiceImpl;

/**
 * Servlet implementation class SearchStudentServlet
 */
public class SearchStudentServlet extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		try {
		//1.ȡ����Ҫ��ѯ�Ĺؼ�����  ����|�Ա�
		String sname=request.getParameter("sname");
		String sgender=request.getParameter("sgender");
		//2.��serviceȥ��ѯ
		StudentService service = new StudentServiceImpl();
        List<Student> list = service.searchStudent(sname,sgender);

		request.setAttribute("list", list);
		//3.��ת���� ���������б�����
		request.getRequestDispatcher("list.jsp").forward(request, response);
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