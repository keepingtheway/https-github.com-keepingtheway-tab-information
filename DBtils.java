package day18.Zuoye.DBUtil;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;



public class DBtils {
			private static DataSource dataSource=null;
	static{
			
			try {
				Properties properties=new Properties();
				InputStream is=DBtils.class.getClassLoader().getResourceAsStream("dbcpconfig.properties");
				properties.load(is);
				dataSource=BasicDataSourceFactory.createDataSource(properties);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
		public static  Connection getManager(){
			try {
				return dataSource.getConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
			
		}
		public static void closeAll(AutoCloseable...autoCloseables ){
			for(AutoCloseable a:autoCloseables){
				if(a!=null){
					try {
						a.close();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
}
