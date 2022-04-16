/**
 * 
 */
package connectDB;

/**
 * @author ToThong
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Database 
{	
		
	
		public static Connection con=null;
		private static Database instance=new Database();
		public static Database getInstance(){
			return instance;
		}
		// * - khởi tạo url, username, password
		public void connection(){
			String url="jdbc:sqlserver://localhost;databasename=DbReview";
			String user="sa";
			String password="sapassword";
			try{
				// kết nối với sql server sử dụng getconection(thuộc lớp drivermanager)
				con=DriverManager.getConnection(url,user,password);
				
			}catch (SQLException e){
				e.printStackTrace();
			}
		}

		// * 4. đóng connection lại
		public void disconnect(){
			if(con!=null)
				try{con.close();
					
				}catch(SQLException e){
					e.printStackTrace();
				}
		}

		// * - khởi tạo 1 đối tượng có tên là: Connection
		public static Connection getConnection(){
			return con;
		}
}
	