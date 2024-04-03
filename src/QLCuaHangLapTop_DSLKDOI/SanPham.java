package QLCuaHangLapTop_DSLKDOI;

import java.io.Serializable;


public class SanPham implements Serializable{
	public String getMaSP() {
		return MaSP;
	}
	public void setMaSP(String maSP) {
		MaSP = maSP;
	}
	public String getTenSP() {
		return TenSP;
	}
	public void setTenSP(String tenSP) {
		TenSP = tenSP;
	}
	public String getCauHinh() {
		return CauHinh;
	}
	public void setCauHinh(String cauHinh) {
		CauHinh = cauHinh;
	}
	public String getHangSX() {
		return HangSX;
	}
	public void setHangSX(String hangSX) {
		HangSX = hangSX;
	}
	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SanPham(String maSP, String tenSP, String cauHinh, String hangSX, int sL, int gia) {
		super();
		this.MaSP = maSP;
		this.TenSP = tenSP;
		this.CauHinh = cauHinh;
		this.HangSX = hangSX;
		this.SL = sL;
		this.Gia = gia;
	}
	public int getSL() {
		return SL;
	}
	public void setSL(int sL) {
		SL = sL;
	}
	public int getGia() {
		return Gia;
	}
	public void setGia(int gia) {
		Gia = gia;
	}
	public int getTongGia() {
		return TongGia;
	}
	public void setTongGia(int tongGia) {
		TongGia = tongGia;
	}
	public SanPham getNext() {
		return next;
	}
	public void setNext(SanPham next) {
		this.next = next;
	}
	public SanPham getPrev() {
		return prev;
	}
	public void setPrev(SanPham prev) {
		this.prev = prev;
	}
	private String MaSP;
	private String TenSP;
	private String CauHinh;
	private String HangSX;
	private int	SL;
	private int Gia;
	private int TongGia;
	public SanPham next;
	public SanPham prev;
}
