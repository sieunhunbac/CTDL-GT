package QLCuaHangLapTop_DSLKDON;

import java.util.Scanner;

public class NhanVienMain {
Scanner sc = new Scanner(System.in);
NhanVienList listnv = new NhanVienList();
static NhanVienMain mainnv = new NhanVienMain();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public void menuNV() {
		int chon1;
		do {
			System.out.println("\t\t\t\t\t\t----------------------------------MENU QUẢN LÝ NHÂN VIÊN --------------------------------");
			System.out.println("\t\t\t\t\t\t|(1): NHẬP thông tin nhân viên                                                          |");
			System.out.println("\t\t\t\t\t\t|(2): HIỂN THỊ danh sách nhân viên                                                      |");
			System.out.println("\t\t\t\t\t\t|(3): Tính TỔNG LƯƠNG nhân viên                                                         |");
			System.out.println("\t\t\t\t\t\t|(4): THÊM nhân viên mới vào danh sách                                                  |");
			System.out.println("\t\t\t\t\t\t|(5): XÓA nhân viên khỏi danh sách theo Mã nhân viên                                    |");
			System.out.println("\t\t\t\t\t\t|(6): Sắp xếp nhân viên theo tổng lương                                                 |");
			System.out.println("\t\t\t\t\t\t|(7): SỬA thông tin cho nhân viên                                                       |");
			System.out.println("\t\t\t\t\t\t|(8): TÌM KIẾM nhân viên theo mã                                                        |");
			System.out.println("\t\t\t\t\t\t|(9): Thoát khỏi chương trình                                                           |");
			System.out.println("\t\t\t\t\t\t-----------------------------------------------------------------------------------------");
			System.out.print("\t\t\t\t\t\t--->Mời nhập lựa chọn : ");
			chon1 = sc.nextInt();
			switch(chon1)
			{
			case 1:{
				listnv.creatList();
				break;
			}
			case 2:{
				listnv.printList();break;
			}
		default:break;
		}
		}while (chon1 <9); System.out.println("ĐÃ THOÁT KHỎI CHƯƠNG TRÌNH");
	}
}
