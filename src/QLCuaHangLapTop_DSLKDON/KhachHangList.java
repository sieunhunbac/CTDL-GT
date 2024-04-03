package QLCuaHangLapTop_DSLKDON;

import java.util.Scanner;

	public class KhachHangList {
	Scanner sc = new Scanner(System.in);
	public KhachHang first;
	public KhachHangList() {
	first = null;
			}
	public KhachHang insert (String maKH,String ho, String tendem, String ten, int sdt, int ngaysinh, int thangsinh, int namsinh,
			String gioitinh,  String diaChi, String email) 
	{
		KhachHang nut = new KhachHang( maKH, ho,  tendem,  ten,  sdt,  ngaysinh,  thangsinh,  namsinh,
				 gioitinh,   diaChi,  email);
		nut.nextKhachHang = first;
		first = nut;
		return first;
	}
	
	public void creatList()
	{
		while(true)
		{	
			String MaKH = "";
			System.out.print("|Nhập mã khách hàng :");
			MaKH = sc.nextLine();
			if(MaKH.length()==0) {break;}
			else {	
				System.out.print("|Nhập HỌ khách hàng :");
				String Ho = sc.next();
				System.out.print("|Nhập TÊN ĐỆM khách hàng:");
				String Tendem = sc.next();
				System.out.print("|Nhập TÊN khách hàng  :");
				String Ten = sc.next();
				System.out.print("|Nhập NGÀY SINH của khách hàng :");
				int NgaySinh = sc.nextInt();
				System.out.print("|Nhập THÁNG SINH của khách hàng  :");
				int ThangSinh = sc.nextInt();
				System.out.print("|Nhập NĂM SINH của khách hàng  :");
				int NamSinh = sc.nextInt();
				System.out.print("|Nhập GIỚI TÍNH của khách hàng  :");
				String GioiTinh = sc.next();
				System.out.print("|Nhập Số điện thoại của khách hàng:");
				int Sdt = sc.nextInt();
				System.out.print("|Nhập ĐỊA CHỈ của khách hàng :");
				String DiaChi = sc.next();
				System.out.print("|Nhập Email :");
				String Email = sc.next();
				sc.nextLine();
				first = insert(MaKH, Ho,  Tendem,  Ten,  Sdt,  NgaySinh,  ThangSinh,  NamSinh,
						 GioiTinh,   DiaChi,  Email);
			}
		}
	}
	public void printList() {
		System.out.println("\t\t\t\t\t |");
		System.out.println("\t\t\t\t\t |");
		System.out.println("\t\t\t\t\t |");
		System.out.println("\t\t\t\t\t V");
		System.out.println("\t\t\t\t DANH SÁCH KHÁCH HÀNG");
		System.out.println("\t\t\t--------------------------------------------------------------------------------------------------------------------------------------------------------");	
		System.out.printf("\t\t\t%-15s%-30s%-14s%-11s%-12s%-11s%-13s%-12s\n",  "| Mã khách hàng |", "             Tên khách hàng        |","   Ngày sinh   |", " Giới tính |", "       SDT       |", "           Địa chỉ          |", "           Email       ", "|");
		KhachHang p = first;
		while (p != null)
		{
			System.out.println(
					"\t\t\t|---------------|-----------------------------------|---------------|-----------|-----------------|----------------------------|-----------------------|");
			System.out.printf("\t\t\t%-16s%-36s%-16s%-12s%-18s%-29s%-24s%-13s\n",  "| " + p.getMaKH(),"| " + p.getHo()+" "+p.getTendem()+" "+p.getTen(), "| "+ p.getNgaysinh() +"/ "+p.getThangsinh()+"/ "+p.getNamsinh(),"| "+ p.getGioitinh(),  "|"+ p.getSdt(),"|"+ p.getDiaChi(), "|"+p.getEmail(),"|");
			p = p.nextKhachHang;
		}
		System.out.println("\t\t\t--------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("");
		}
}
