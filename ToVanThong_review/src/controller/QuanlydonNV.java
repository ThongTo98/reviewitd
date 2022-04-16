/**
 * 
 */
package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.Database;
import entities.NhanVien;


/**
 * @author ToThong
 *
 */
public class QuanlydonNV {

	/**
	 * 
	 */
	private ArrayList<NhanVien>list;
	
	
	public QuanlydonNV() {
		// TODO Auto-generated constructor stub
		list = new ArrayList<NhanVien>(); 
	}
	
	// doc du lieu 
	public ArrayList<NhanVien> doctubang(){
		try {
			Connection con = Database.getInstance().getConnection();
			String sql = "SELECT maso,hoten,diachi,taikhoan,matkhau,chucvu FROM NhanVien v join vaitro t on v.id_vaitro=t.id";
			Statement statement = con.createStatement();
			ResultSet rs =  statement.executeQuery(sql);
			
			while (rs.next()) {
				String manv = rs.getString(1);
				String hoten = rs.getString(2);
				String sdt = rs.getString(3);
				String diachi = rs.getString(4);
				String email = rs.getString(5);
				String taikhoan = rs.getString(6);
				String matkhau = rs.getString(7);
		//		String sonamkinhnghiem = rs.getString(8);
			//	String trinhdohocvan = rs.getString(9);
				String chucvu=rs.getString(10);
				
				NhanVien nv = new NhanVien(manv, hoten, sdt, diachi, email, taikhoan);
				list.add(nv);
			
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	

}
