package QLCuaHangLapTop_DSLKDOI;

import java.util.Scanner;

public class NhanVienList {
	Scanner sc = new Scanner(System.in);
	public NhanVien first,last;
	NhanVien q=null;NhanVien p = null;
	 public NhanVienList() {
		   first = null; last = null;
	   }
	 public NhanVien insert(String maNV,String ho, String tendem, String ten, int sdt, int ngaysinh, int thangsinh, int namsinh,
				String gioitinh, int mucLuong, int soGioLam)
	   {
		 NhanVien nut = new NhanVien(  maNV, ho,  tendem,  ten,  sdt,  ngaysinh,  thangsinh,  namsinh,
					 gioitinh,  mucLuong,  soGioLam);
		   if((last == null) && (first == null)) {last = nut; first=nut;}
		   else {
			   last.nextNhanVien = nut;
			   nut.prevNhanVien=last;
			   last=nut;
		   }return last;
	   }
	 public void creatList()
		{
			while(true)
			{
				String maNV="";
				System.out.print("|Nhập mã nhân viên :");
				String MaNV = sc.nextLine();
				if(MaNV.length()==0) {break;}
				else {	
					System.out.print("|Nhập HỌ nhân viên :");
					String Ho = sc.next();
					System.out.print("|Nhập TÊN ĐỆM nhân viên :");
					String Tendem = sc.next();
					System.out.print("|Nhập TÊN nhân viên :");
					String Ten = sc.next();
					System.out.print("|Nhập NGÀY SINH của nhân viên :");
					int NgaySinh = sc.nextInt();
					System.out.print("|Nhập THÁNG SINH của nhân viên:");
					int ThangSinh = sc.nextInt();
					System.out.print("|Nhập NĂM SINH của nhân viên :");
					int NamSinh = sc.nextInt();
					System.out.print("|Nhập Gioi Tinh của nhân viên :");
					String GioiTinh = sc.next();
					System.out.print("|Nhập SDT của nhân viên :");
					int Sdt = sc.nextInt();
					System.out.print("|Nhập mức lương :");
					int MucLuong = sc.nextInt();
					System.out.print("|Nhập số giờ làm :");
					int SoGioLam = sc.nextInt();
					sc.nextLine();
					first = insert(maNV, Ho,  Tendem,  Ten,  Sdt,  NgaySinh,  ThangSinh,  NamSinh,
							 GioiTinh,  MucLuong,  SoGioLam);
				}
			}
		}
	 public void printList() {
			System.out.println("\t\t\t\t\t |");
			System.out.println("\t\t\t\t\t |");
			System.out.println("\t\t\t\t\t |");
			System.out.println("\t\t\t\t\t V");
			System.out.println("\t\t\t\t DANH SÁCH NHÂN VIÊN");
			System.out.println("\t\t\t---------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("\t\t\t%-15s%-30s%-14s%-11s%-12s%-11s%-13s%-12s\n","| Mã nhân viên |", "             Tên nhân viên        |","   Ngày sinh   |", " Giới tính |", "       SDT       |", "    Mức lương    |", " Số giờ làm |", " Tổng lương |");
			NhanVien p = first;
			while (p != null)
			{
				System.out.println(
						"\t\t\t|--------------|----------------------------------|---------------|-----------|-----------------|-----------------|------------|------------|");
				System.out.printf("\t\t\t%-15s%-35s%-16s%-12s%-18s%-18s%-13s%-13s%-7s\n", "| " + p.getMaNV(),"| " + p.getHo()+" "+p.getTendem()+" "+p.getTen(), "| "+ p.getNgaysinh() +"/ "+p.getThangsinh()+"/ "+p.getNamsinh(),"| "+ p.getGioitinh(),  "|"+ p.getSdt(),"|"+ p.getMucLuong(), "|"+p.getSoGioLam(), "|"+p.getTongLuong(),"|");
				p = p.nextNhanVien;
			}
			System.out.println("\t\t\t---------------------------------------------------------------------------------------------------------------------------------------------");

			System.out.println("");
			}

}
