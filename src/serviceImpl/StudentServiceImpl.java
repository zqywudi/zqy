package serviceImpl;

import java.util.List;

import Dao.StudentDao;
import DaoImpl.StudentDaoImpl;
import entity.Student;
import service.StudentService;

public class StudentServiceImpl implements StudentService {

	private StudentDao sdao = new StudentDaoImpl();
	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return sdao.getAll();
	}

}
