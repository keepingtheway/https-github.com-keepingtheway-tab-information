package day18.Zuoye.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import day18.Zuoye.DBUtil.DBtils;
import day18.Zuoye.Entity.Classroom;

public class ClassDao {



	public List<Classroom> quaryAll() {
		// TODO Auto-generated method stub
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		List<Classroom> list=new ArrayList<>();
		try {
			conn=DBtils.getManager();
			st=conn.createStatement();
			String sql="select * from t_classroom";
			rs=st.executeQuery(sql);
			while(rs.next()){
				list.add(new Classroom(rs.getInt("id"),rs.getString("class"),rs.getInt("number")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBtils.closeAll(rs,st,conn);
		}
		return list;
	}

	public int delete(int m) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pres=null;
		try {
			conn=DBtils.getManager();
			String sql="delete from  t_classroom where id=?";
			pres=conn.prepareStatement(sql);
			return pres.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBtils.closeAll(pres,conn);
		}
		return 0;
	}

	public int update(Classroom classroom) {
		Connection conn=null;
		PreparedStatement pres=null;
		try {
			conn=DBtils.getManager();
			String sql="update t_classroom set class=?,number=? where id=?";
			pres=conn.prepareStatement(sql);
			pres.setString(1, classroom.getClassroom());
			pres.setInt(2, classroom.getNumber());
			pres.setInt(3, classroom.getId());
			return pres.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBtils.closeAll(pres,conn);
		}
		return 0;
	}

	public int add(Classroom classroom) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pres=null;
		try {
			conn=DBtils.getManager();
			String sql="intsert into t_classroom(name,number) values(?,?)";
			pres=conn.prepareStatement(sql);
			pres.setString(1, classroom.getClassroom());
			pres.setInt(2, classroom.getNumber());
			return pres.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBtils.closeAll(pres,conn);
		}
		return 0;
	}
		
}
