package DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.BaseDao;
import Dao.StudentDao;
import entity.Student;


public class StudentDaoImpl extends BaseDao implements StudentDao {

	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	
	@Override
	public List<Student> getAll() {
		List<Student> list = new ArrayList<Student>();
		try {
			conn = getConnection();
			String sql = "select * from Student";
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				list.add(new Student(rs.getString(1),rs.getInt(2)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll(rs, pst, conn);
		}
		return list;
	}
}
