package QLCuaHangLapTop_DSLKDON;

import java.util.Scanner;

public class SanPhamMain {
	Scanner sc = new Scanner(System.in);
	SanPhamList listsp = new SanPhamList();
	static SanPhamMain mainsp = new SanPhamMain();
	public static void main(String[] args) {
	}
public void menuSP() {
		int chon3;
		do {
			System.out.println("----------------------------------MENU QUẢN LÝ SẢN PHẨM --------------------------------");
			System.out.println("|(0): GHI và ĐỌC thông tin sản phẩm vào FILE                                           |");
			System.out.println("|(1): Hiển thị danh sách sản phẩm                                                      |");
			System.out.println("|(2): Tính TỔNG tiền của sản phẩm                                                      |");
			System.out.println("|(3): Thêm sản phẩm mới vào danh sách                                                  |");
			System.out.println("|(4): Sắp xếp nhân viên theo giá sản phẩm                                              |");
			System.out.println("|(5): TÌM KIẾM nhân viên theo mã sản phẩm                                              |");
			System.out.println("|(6): Xóa nhân viên theo mã sản phẩm                                                   |");
			System.out.println("|(7): SỬA thông tin cho sản phẩm                                                       |");
			System.out.println("|(8): Thống kê số lượng của mặt hàng dựa vào giá                                       |");
			System.out.println("|(9): Thoát khỏi chương trình                                                          |");
			System.out.println("-----------------------------------------------------------------------------------------");
			chon3 = sc.nextInt();
			switch(chon3)
			{
			case 0:{
				listsp.ghifile();
				listsp.docfile();
				break;
			}
			case 1: {
				listsp.printList();;break;
			}
			case 2:{
				listsp.tongtien();
				System.out.println("\t\t\t\t\t |");
				System.out.println("\t\t\t\t\t |");
				System.out.println("\t\t\t\t\t |");
				System.out.println("\t\t\t\t\t V");
				System.out.println("\t\t\t\t DANH SÁCH SẢN PHẨM SAU KHI TÍNH TỔNG TIỀN");
				listsp.printList();
				break;
			}
			case 3:{
				int chonthem;
				do {
					System.out.println("----------------------------------MENU QUẢN LÝ SẢN PHẨM --------------------------------");
					System.out.println("|(1): Thêm sản phẩm mới vào Đầu danh sách                                              |");
					System.out.println("|(2): Thêm sản phẩm mới vào Cuối danh sách                                             |");
					System.out.println("|(9): Thoát khỏi chương trình                                                          |");
					System.out.println("-----------------------------------------------------------------------------------------");
					chonthem = sc.nextInt();
					switch(chonthem)
					{
						case 1:
						{
							listsp.chendau();
							System.out.println("\t\t\t\t\t |");
							System.out.println("\t\t\t\t\t |");
							System.out.println("\t\t\t\t\t |");
							System.out.println("\t\t\t\t\t V");
							System.out.println("\t\t\t\t DANH SÁCH SẢN PHẨM SAU KHI CHÈN ĐẦU");
							listsp.printList();
							break;}
						case 2:
						{
							listsp.chencuoi();
							System.out.println("\t\t\t\t\t |");
							System.out.println("\t\t\t\t\t |");
							System.out.println("\t\t\t\t\t |");
							System.out.println("\t\t\t\t\t V");
							System.out.println("\t\t\t\t DANH SÁCH SẢN PHẨM SAU KHI CHÈN CUỐI");
							listsp.printList();
							break;}
						}
						
					}while(chon3 < 3);}
			case 4 :{
				listsp.sapXepTheoGiaTien();
				System.out.println("\t\t\t\t\t |");
				System.out.println("\t\t\t\t\t |");
				System.out.println("\t\t\t\t\t |");
				System.out.println("\t\t\t\t\t V");
				System.out.println("\t\t\t\t DANH SÁCH SẢN PHẨM SAU KHI SẮP XẾP");
				listsp.printList();
				break;
			}
			case 5 :{
				System.out.print("|Nhập MÃ sản phẩm  ");
				String MaSP = sc.next();
				listsp.timKiemTheoMaSP(MaSP);break;
			}
			case 6 :{
				System.out.print("|Nhập MÃ sản phẩm  ");
				String MaSP = sc.next();
				listsp.xoaTheoMaSP(MaSP);break;
			}
			case 7:{
				System.out.print("|Nhập MÃ sản phẩm  ");
				String MaSP = sc.next();
				listsp.suaThongTinTheoMaSP(MaSP);
					break;}
			case 8:{
				listsp.thongke();;
					break;}
			}
		}while(chon3 < 9);
	}
}
