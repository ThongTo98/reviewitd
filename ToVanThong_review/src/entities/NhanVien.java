/**
 * 
 */
package entities;

/**
 * @author ToThong
 *
 */
public class NhanVien {

	/**
	 * 
	 */
	protected String maSo;
	protected String hoTen;
	protected String diaChi;
//	protected String email;
	protected String taiKhoan;
	protected String matKhau;
	protected String chucVu;
	
	
	public String getMaSo() {
		return maSo;
	}


	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}


	public String getHoTen() {
		return hoTen;
	}


	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}


	public String getDiaChi() {
		return diaChi;
	}


	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}


	public String getTaikhoan() {
		return taiKhoan;
	}


	public void setTaikhoan(String taikhoan) {
		this.taiKhoan = taikhoan;
	}


	public String getMatkhau() {
		return matKhau;
	}


	public void setMatkhau(String matkhau) {
		this.matKhau = matkhau;
	}


	public String getChucVu() {
		return chucVu;
	}


	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	



	public NhanVien(String maSo, String hoTen, String diaChi, String taikhoan, String matkhau, String chucVu) {
		super();
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.taiKhoan = taikhoan;
		this.matKhau = matkhau;
		this.chucVu = chucVu;
	}


	


	public NhanVien() {
		// TODO Auto-generated constructor stub
	}

}
