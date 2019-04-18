package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.StudentService;
import service.impl.StudentServiceImpl;

/**
 * Servlet implementation class DeleteServlet
 * ���ڴ���ɾ��ѧ��
 */
public class DeleteServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//1.����id
			int sid = Integer.parseInt(request.getParameter("sid"));
			//2.ִ��ɾ��
			StudentService service = new StudentServiceImpl();
			service.delete(sid);
			//3.��ת���б�ҳ
			request.getRequestDispatcher("StudentListServlet").forward(request, response);
		} catch (SQLException e) {
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
