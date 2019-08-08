package day18.Zuoye.BIZ;

import day18.Zuoye.DAO.UserDao;
import day18.Zuoye.Entity.User;

public class Userbiz {
	private UserDao userdao=new UserDao();
	public boolean log(User user) {
		// TODO Auto-generated method stub
		int result =userdao.log(user);
		return result>0;
	}

}
