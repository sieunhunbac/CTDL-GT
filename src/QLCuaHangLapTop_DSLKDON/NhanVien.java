package QLCuaHangLapTop_DSLKDON;

public class NhanVien extends Nguoi{
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public int getMucLuong() {
		return MucLuong;
	}
	public void setMucLuong(int mucLuong) {
		MucLuong = mucLuong;
	}
	public int getSoGioLam() {
		return SoGioLam;
	}
	public void setSoGioLam(int soGioLam) {
		SoGioLam = soGioLam;
	}
	public int getTongLuong() {
		return TongLuong;
	}
	public void setTongLuong(int tongLuong) {
		TongLuong = tongLuong;
	}
	public NhanVien getNextNhanVien() {
		return nextNhanVien;
	}
	public void setNextNhanVien(NhanVien nextNhanVien) {
		this.nextNhanVien = nextNhanVien;
	}
	public NhanVien( String maNV, String ho, String tendem, String ten, int sdt, int ngaysinh, int thangsinh, int namsinh,
			String gioitinh, int mucLuong, int soGioLam) {
		super(ho, tendem, ten, sdt, ngaysinh, thangsinh, namsinh, gioitinh);
		MaNV = maNV;
		MucLuong = mucLuong;
		SoGioLam = soGioLam;
	}
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NhanVien(String ho, String tendem, String ten, int sdt, int ngaysinh, int thangsinh, int namsinh,
			String gioitinh) {
		super(ho, tendem, ten, sdt, ngaysinh, thangsinh, namsinh, gioitinh);
		// TODO Auto-generated constructor stub
	}
	private String MaNV;
	private int MucLuong;
	private int SoGioLam;
	private int TongLuong;
	public NhanVien nextNhanVien;
}
