package day18.Zuoye.BIZ;

import java.util.List;

import day18.Zuoye.DAO.ClassDao;
import day18.Zuoye.Entity.Classroom;

public class ClassBiz {
	private ClassDao classdao=new ClassDao();
	public List<Classroom> quaryAll() {
		// TODO Auto-generated method stub
		List<Classroom> list=classdao.quaryAll();
		return list;
	}
	public boolean delete(int m) {
		// TODO Auto-generated method stub
		int result =classdao.delete(m);
		return result>0;
	}
	public boolean update(Classroom classroom) {
		// TODO Auto-generated method stub
		int result=classdao.update(classroom);
		return result>0;
	}
	public boolean add(Classroom classroom) {
		// TODO Auto-generated method stub
		int result=classdao.add(classroom);
		return result>0;
	}

}
