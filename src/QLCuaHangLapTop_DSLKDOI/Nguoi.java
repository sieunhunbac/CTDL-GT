package QLCuaHangLapTop_DSLKDOI;

public class Nguoi {
	private String Ho;
	public Nguoi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Nguoi(String ho, String tendem, String ten, int sdt, int ngaysinh, int thangsinh, int namsinh,
			String gioitinh) {
		super();
		Ho = ho;
		Tendem = tendem;
		Ten = ten;
		Sdt = sdt;
		Ngaysinh = ngaysinh;
		Thangsinh = thangsinh;
		Namsinh = namsinh;
		Gioitinh = gioitinh;
	}
	public String getHo() {
		return Ho;
	}
	public void setHo(String ho) {
		Ho = ho;
	}
	public String getTendem() {
		return Tendem;
	}
	public void setTendem(String tendem) {
		Tendem = tendem;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public int getSdt() {
		return Sdt;
	}
	public void setSdt(int sdt) {
		Sdt = sdt;
	}
	public int getNgaysinh() {
		return Ngaysinh;
	}
	public void setNgaysinh(int ngaysinh) {
		Ngaysinh = ngaysinh;
	}
	public int getThangsinh() {
		return Thangsinh;
	}
	public void setThangsinh(int thangsinh) {
		Thangsinh = thangsinh;
	}
	public int getNamsinh() {
		return Namsinh;
	}
	public void setNamsinh(int namsinh) {
		Namsinh = namsinh;
	}
	public String getGioitinh() {
		return Gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		Gioitinh = gioitinh;
	}
	private String Tendem;
	private String Ten;
	private int Sdt;
	private int Ngaysinh;
	private int Thangsinh;
	private int Namsinh;
	private String Gioitinh;
}
