package QLCuaHangLapTop_DSLKDOI;

import java.util.Scanner;

public class KhachHangMain {
	Scanner sc = new Scanner(System.in);
	KhachHangList listkh = new KhachHangList();
	static KhachHangMain mainkh = new KhachHangMain();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void menuKH() {
		int chon1;
		do {
			System.out.println("\t\t\t\t\t\t----------------------------------MENU QUẢN LÝ KHÁCH HÀNG --------------------------------");
			System.out.println("\t\t\t\t\t\t|(1): NHẬP thông tin khách hàng                                                          |");
			System.out.println("\t\t\t\t\t\t|(2): HIỂN THỊ danh sách khách hàng                                                      |");
			System.out.println("\t\t\t\t\t\t|(3): THÊM khách hàng mới vào danh sách                                                  |");
			System.out.println("\t\t\t\t\t\t|(4): XÓA khách hàng khỏi danh sách theo Mã khách hàng                                   |");
			System.out.println("\t\t\t\t\t\t|(5): SỬA thông tin cho khách hàng                                                       |");
			System.out.println("\t\t\t\t\t\t|(6): TÌM KIẾM khách hàng theo mã                                                        |");
			System.out.println("\t\t\t\t\t\t|(7):  Thoát khỏi chương trình                                                           |");
			System.out.println("\t\t\t\t\t\t-----------------------------------------------------------------------------------------");
			System.out.print("\t\t\t\t\t\t--->Mời nhập lựa chọn : ");
			chon1 = sc.nextInt();
			switch(chon1)
			{
			case 1:{
				listkh.creatList();
				break;
			}
			case 2:{
				listkh.printList();break;
			}
		default:break;
		}
		}while (chon1 <7); System.out.println("ĐÃ THOÁT KHỎI CHƯƠNG TRÌNH");
	}
}
