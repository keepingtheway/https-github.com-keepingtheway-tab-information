package day18.Zuoye.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import day18.Zuoye.DBUtil.DBtils;
import day18.Zuoye.Entity.User;

public class UserDao {

	public int log(User user) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pres=null;
        ResultSet rs=null;
      
        try { 
        	conn=DBtils.getManager();
        	String sql="select count(1) from tb_users where name=? and password=?";
			pres=conn.prepareStatement(sql);
			pres.setString(1,user.getName());
			pres.setString(2, user.getPassword());
			rs=pres.executeQuery();
			if(rs.next()){
			return rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBtils.closeAll(rs,pres,conn);
		}
        
		
		return 0;
	}
		
}
