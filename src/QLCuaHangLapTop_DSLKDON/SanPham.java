package QLCuaHangLapTop_DSLKDON;
import java.io.Serializable;
import java.io.*;
import java.util.*;
public class SanPham implements Serializable{
	private String MaSP;
	private String TenSP;
	private String CauHinh;
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
	public SanPham getNextSanPham() {
		return nextSanPham;
	}
	public void setNextSanPham(SanPham nextSanPham) {
		this.nextSanPham = nextSanPham;
	}
	private String HangSX;
	private int	SL;
	private int Gia;
	private int TongGia;
	public SanPham nextSanPham;
}
