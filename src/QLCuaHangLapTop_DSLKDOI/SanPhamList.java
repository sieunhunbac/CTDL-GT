package QLCuaHangLapTop_DSLKDOI;

import java.util.Scanner;

public class SanPhamList {
	Scanner sc = new Scanner(System.in);

	public SanPham first,last;
	SanPham q=null;SanPham p = null;
	SanPhamDao obj = new SanPhamDao();
	 public SanPhamList() {
		   first = null; last = null;
	   }
	 public void insert(String maSP, String tenSP, String cauHinh, String hangSX, int sL, int gia)
	   {
		 SanPham nut = new SanPham( maSP,  tenSP,  cauHinh,  hangSX,  sL,  gia);
		   if((last == null) && (first == null)) {last = nut; first=nut;}
		   else {
			   last.next = nut;
			   nut.prev=last;
			   last=nut;
		   }
	   }
	 public void ghifile()
		{
			insert ("SP01","LAPTOP ACER NITRO 5","AMD Ryzen 7 5800H","ACER",9, 13000000);
			insert ("SP02","LAPTOP ASUS TUF15","i3-1115G4/RAM 4GB/256GB SSD","ASUS",4, 45000000);
			insert ("SP03","Laptop AI ASUS Zenbook","i5-1135G7","ASUS",9, 13000000);
			insert ("SP04","Laptop ASUS Vivobook","i3-1115G4/RAM 4GB/256GB SSD","ASUS",15, 93700000);
			insert ("SP05","Laptop Acer Aspire","i5-12670G4/RAM 4GB/256GB SSD","Asus",5, 17290000);
			obj.ghiFile(first);
		}
	 public void docfile()
		{
			first = obj.docFile("d:\\DSLKDOISanPham.bin");
		}
	 public void printListNext() {
			System.out.println("\t\t\t\t\t |");
			System.out.println("\t\t\t\t\t |");
			System.out.println("\t\t\t\t\t |");
			System.out.println("\t\t\t\t\t V");
			System.out.println("\t\t\t\t DANH SÁCH SẢN PHẨM");
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("%-15s%-36s%-35s%-16s%-9s%-15s%-19s\n","| Mã Sản phẩm  |", "             Tên sản phẩm         |","              Cấu hình              |", " Hãng sản xuất |", "Số lượng|","         Giá         |","         Tổng cộng         |");
			SanPham p = first;
			while (p != null)
			{
				System.out.println(
				"|--------------|----------------------------------|-------------------------------------|---------------|--------|---------------------|---------------------------|");
				System.out.printf("%-15s%-35s%-38s%-16s%-9s%-22s%-28s%-1s\n","|"+ p.getMaSP(),"|"+p.getTenSP(),"|"+p.getCauHinh(),"|"+p.getHangSX(),"|"+p.getSL(),"|"+p.getGia(),"|"+p.getTongGia(),"|");
				p = p.next;
			}
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");

			System.out.println("");
			}
	 public void printListPrev() {
			System.out.println("\t\t\t\t\t |");
			System.out.println("\t\t\t\t\t |");
			System.out.println("\t\t\t\t\t |");
			System.out.println("\t\t\t\t\t V");
			System.out.println("\t\t\t\t DANH SÁCH SẢN PHẨM");
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("%-15s%-36s%-35s%-16s%-9s%-15s%-19s\n","| Mã Sản phẩm  |", "             Tên sản phẩm         |","              Cấu hình              |", " Hãng sản xuất |", "Số lượng|","         Giá         |","         Tổng cộng         |");
			SanPham p = last;
			while (p != null)
			{
				System.out.println(
				"|--------------|----------------------------------|-------------------------------------|---------------|--------|---------------------|---------------------------|");
				System.out.printf("%-15s%-35s%-38s%-16s%-9s%-22s%-28s%-1s\n","|"+ p.getMaSP(),"|"+p.getTenSP(),"|"+p.getCauHinh(),"|"+p.getHangSX(),"|"+p.getSL(),"|"+p.getGia(),"|"+p.getTongGia(),"|");
				p = p.prev;
			}
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");

			System.out.println("");
			}
	 public void tongtien() {
			SanPham p = first;
			int tongtien = 0;
			while (p != null) {
				tongtien = p.getSL()*p.getGia();
				p.setTongGia(tongtien);
				p = p.next;
				}
			}
	 public int max()
		{
			SanPham p = first; int ln = first.getTongGia();
			while (p != null)
			{
				if(ln < p.getTongGia()) ln = p.getTongGia();
			 p = p.next;
			}
			return ln;
		}
	
	 
	 public SanPham search(String maSV) {
		 	SanPham p = first;
			while((p!=null)&&(p.getMaSP().equals(maSV)!=true))
			{
				p=p.next;
			}
			return(p);
		}
		public void delete (String maSV)
		{
			SanPham p = search(maSV);
			if(p != null)
			{	 SanPham q = p;
				if ((first == last)&&(last == p)) {first = null; last = null;}
				
				else if (p==first) {first = first.next;first.prev=null;}
					else
						if(p==last)
						{
							last=last.prev; last.next = null;
						}
						else
						{SanPham u=p.prev, v=p.next;
							u.next=v;u.prev=u;
						}
				System.out.println("Xóa sản phẩm thành công");
			}else System.out.println("Không tìm thấy sản phẩm");
		}
		 public void timKiemTheoMaSP(String maSP) {
			    if (first == null) {
			        System.out.println("Danh sách sản phẩm rỗng!");
			        return;
			    }
			    SanPham p = first;
			    while (p != null) {
			        if (p.getMaSP().equals(maSP)) {
			            // In thông tin sản phẩm
			    		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			    		System.out.printf("%-15s%-36s%-35s%-16s%-9s%-15s%-19s\n","| Mã Sản phẩm  |", "             Tên sản phẩm         |","              Cấu hình              |", " Hãng sản xuất |", "Số lượng|","         Giá         |","         Tổng cộng         |");
			    		System.out.println("|--------------|----------------------------------|-------------------------------------|---------------|--------|---------------------|---------------------------|");
			    		System.out.printf("%-15s%-35s%-38s%-16s%-9s%-22s%-28s%-1s\n","|"+ p.getMaSP(),"|"+p.getTenSP(),"|"+p.getCauHinh(),"|"+p.getHangSX(),"|"+p.getSL(),"|"+p.getGia(),"|"+p.getTongGia(),"|");
						System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			    		return;
			        }
			        p = p.next;
			    }
			    System.out.println("Sản phẩm không tồn tại!");
			}
		 public void suaThongTinTheoMaSP(String maSP) {
			    if (first == null) {
			        System.out.println("Danh sách sản phẩm rỗng!");
			        return;
			    }
			    SanPham P = first;
			    while (P != null) {
			        if (P.getMaSP().equals(maSP)) {
			        	System.out.print("|Nhập TÊN sản phẩm ");
			    		String TenSP = sc.nextLine();
			    		sc.nextLine();
			    		System.out.print("|Nhập Cấu hình sản phẩm ");
			    		String CauHinh = sc.next();
			    		System.out.print("|Nhập HÃNG sản xuất sản phẩm ");
			    		String HangSX = sc.next();
			    		System.out.print("|Nhập so luong sản phẩm ");
			    		int Sl = sc.nextInt();
			    		System.out.print("|Nhập Giá sản phẩm ");
			    		int Gia = sc.nextInt();
			            // Cập nhật thông tin sản phẩm
			            P.setTenSP(TenSP);
			            P.setCauHinh(CauHinh);
			            P.setHangSX(HangSX);
			            P.setSL(Sl);
			            P.setGia(Gia);
			            System.out.println("Thông tin sản phẩm " + maSP + " đã được cập nhật!");
			            return;
			        }
			        P = P.next;
			    }
			    System.out.println("Sản phẩm không tồn tại!");
			}
		 public void thongke()
			{
					SanPham p = first; int thap=0, trungbinh=0, kha=0, cao=0;
					while(p!=null)
					{
						if(p.getSL()<=5) thap++;
						else if(p.getSL()<=10) trungbinh++;
						else if(p.getSL()<=15) kha++;
						else cao++;
						p=p.next;
					}
					System.out.println("Số lượng mặt hàng còn ít hơn 5 sản phẩm :"+thap);
					System.out.println("Số lượng mặt hàng còn ít hơn 10 sản phẩm:"+trungbinh);
					System.out.println("Số lượng mặt hàng còn ít hơn 15 sản phẩm:"+kha);
					System.out.println("Số lượng mặt hàng còn ít hơn 20 sản phẩm:"+cao);
			}
		 public String checkMaSP(String MaSP) {
			    SanPham p = first;
			    while (p != null) {
			        try {
			            if (p.getMaSP().equals(MaSP)) {
			                throw new Exception("Mã sản phẩm đã tồn tại!");
			            }
			        } catch (Exception e) {
			            System.out.println(e.getMessage());
			            sc.nextLine();
			            System.out.print("|Nhập lại mã sản phẩm: ");
			            MaSP = sc.nextLine();
			            // Quay lại đầu vòng lặp để kiểm tra mã sản phẩm mới
			            continue;
			        }
			        p = p.next;
			    }
			    return MaSP;
			}
		 public void sapXepTheoGiaTien() {
				//kiểm tra xem danh sách sản phẩm có rỗng hay chỉ có một node
			    if (first == null || first.next == null) return;
			    SanPham p = first, next;
			    while (p != null) {
			        next = p.next;
			        while (next != null) {
			            if (p.getGia() > next.getGia()) {
			                // Hoán đổi các node
			                String tempMaSP = p.getMaSP();
			                String tempTenSP = p.getTenSP();
			                String tempCauHinh = p.getCauHinh();
			                String tempHangSX = p.getHangSX();
			                int tempSL = p.getSL();
			                int tempGia = p.getGia();

			                p.setMaSP(next.getMaSP());
			                p.setTenSP(next.getTenSP());
			                p.setCauHinh(next.getCauHinh());
			                p.setHangSX(next.getHangSX());
			                p.setSL(next.getSL());
			                p.setGia(next.getGia());

			                next.setMaSP(tempMaSP);
			                next.setTenSP(tempTenSP);
			                next.setCauHinh(tempCauHinh);
			                next.setHangSX(tempHangSX);
			                next.setSL(tempSL);
			                next.setGia(tempGia);
			            }
			            next = next.next;
			        }
			        p = p.next;
			    }
			}
		 public void xoaTheoMaSP(String maSP) {
			    if (first == null) {
			        System.out.println("Danh sách sản phẩm rỗng!");
			        return;
			    }
			    SanPham previous = null, current = first;
			    while (current != null) {
			        if (current.getMaSP().equals(maSP)) {
			            // Xóa node
			            if (previous == null) {
			                // Xóa node đầu tiên
			                first = first.next;
			            } else {
			                previous.next = current.next;
			            }
			            System.out.println("Sản phẩm " + maSP + " đã được xóa!");
			            return;
			        }
			        previous = current;
			        current = current.next;
			    }
			    System.out.println("Sản phẩm không tồn tại!");
			}
		 public void chendau() {
				System.out.print("|Nhập MÃ sản phẩm  ");
				String MaSP = sc.next();
				checkMaSP(MaSP);
				System.out.print("|Nhập TÊN sản phẩm ");
				String TenSP = sc.next();
				System.out.print("|Nhập Cấu hình sản phẩm ");
				String CauHinh = sc.next();
				System.out.print("|Nhập HÃNG sản xuất sản phẩm ");
				String HangSX = sc.next();
				System.out.print("|Nhập so luong sản phẩm ");
				int Sl = sc.nextInt();
				System.out.print("|Nhập Giá sản phẩm ");
				int Gia = sc.nextInt();
				insert(MaSP,  TenSP,  CauHinh,  HangSX,  Sl,  Gia);
			}
			public void chencuoi() {
				System.out.print("|Nhập MÃ sản phẩm  ");
				String MaSP = sc.next();
				checkMaSP(MaSP);
				System.out.print("|Nhập TÊN sản phẩm ");
				String TenSP = sc.next();
				System.out.print("|Nhập Cấu hình sản phẩm ");
				String CauHinh = sc.next();
				System.out.print("|Nhập HÃNG sản xuất sản phẩm ");
				String HangSX = sc.next();
				System.out.print("|Nhập so luong sản phẩm ");
				int Sl = sc.nextInt();
				System.out.print("|Nhập Giá sản phẩm ");
				int Gia = sc.nextInt();
				SanPham p = first;
				SanPham nut = new SanPham(MaSP,  TenSP,  CauHinh,  HangSX,  Sl,  Gia);
				while (p.next!=null) p=p.next;
				p.next=nut;
			}
}
