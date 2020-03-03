package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.StudentDao;
import DaoImpl.StudentDaoImpl;
import entity.Student;
import service.StudentService;
import serviceImpl.StudentServiceImpl;


@WebServlet("/find")
public class StudentServlet extends HttpServlet {
	private StudentDao sdao = new StudentDaoImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		List<Student> list = sdao.getAll();
		// 将整个集合保存到作用域中
		req.setAttribute("list", list);
		req.getRequestDispatcher("Index.jsp").forward(req, resp);	
				
			}

}
