package QLCuaHangLapTop_DSLKDOI;

public class KhachHang extends Nguoi{
	public String getMaKH() {
		return MaKH;
	}
	public void setMaKH(String maKH) {
		MaKH = maKH;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public KhachHang(String ho, String tendem, String ten, int sdt, int ngaysinh, int thangsinh, int namsinh,
			String gioitinh) {
		super(ho, tendem, ten, sdt, ngaysinh, thangsinh, namsinh, gioitinh);
		// TODO Auto-generated constructor stub
	}
	public KhachHang(String maKH,String ho, String tendem, String ten, int sdt, int ngaysinh, int thangsinh, int namsinh,
			String gioitinh, String diaChi, String email) {
		super();
		this.MaKH = maKH;
		this.DiaChi = diaChi;
		this.Email = email;
	}
	public KhachHang getNextKhachHang() {
		return nextKhachHang;
	}
	public void setNextKhachHang(KhachHang nextKhachHang) {
		this.nextKhachHang = nextKhachHang;
	}
	public KhachHang getPrevKhachHang() {
		return prevKhachHang;
	}
	public void setPrevKhachHang(KhachHang prevKhachHang) {
		this.prevKhachHang = prevKhachHang;
	}
	private String MaKH;
	private String DiaChi;
	private String Email;
	public KhachHang nextKhachHang;
	public KhachHang prevKhachHang;
}
