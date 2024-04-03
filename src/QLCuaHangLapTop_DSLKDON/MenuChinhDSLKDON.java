package QLCuaHangLapTop_DSLKDON;

import java.util.Scanner;

public class MenuChinhDSLKDON {
	 static NhanVienMain mainnv = new NhanVienMain();
	 static KhachHangMain mainkh = new KhachHangMain();
	 static SanPhamMain mainsp = new SanPhamMain();
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	}
	public void MenuTongDSLKDON() {
		int chon;	
		do {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t||--------------------------------------(o)---------------------------------------||");
		System.out.println("\t\t\t\t\t\t\t||     ______________________________________________________________________     ||");
		System.out.println("\t\t\t\t\t\t\t||    |                                                                      |    ||");
		System.out.println("\t\t\t\t\t\t\t||    | CHƯƠNG TRÌNH QUẢN LÝ CỦA HÀNG BÁN LAPTOP VỚI DANH SÁCH LIÊN KẾT ĐƠN  |    ||");
		System.out.println("\t\t\t\t\t\t\t||    |                                                                      |    ||");		
		System.out.println("\t\t\t\t\t\t\t||    |                 (1): Làm việc với nhân viên                          |    ||");
		System.out.println("\t\t\t\t\t\t\t||    |                 (2): Làm việc với khách hàng                         |    ||");
		System.out.println("\t\t\t\t\t\t\t||    |                 (3): Làm việc với sản phẩm                           |    ||");;
		System.out.println("\t\t\t\t\t\t\t||    |                 (4): Thoát khỏi chương trình                         |    ||");
		System.out.println("\t\t\t\t\t\t\t||    |                                                                      |    ||");
		System.out.println("\t\t\t\t\t\t\t||    |                  ------>>Mời nhập lựa chọn<<------                   |    ||");
		System.out.println("\t\t\t\t\t\t\t||    |                                                                      |    ||");
		System.out.println("\t\t\t\t\t\t\t||    |                                                                      |    ||");
		System.out.println("\t\t\t\t\t\t\t||    |                                                                      |    ||");
		System.out.println("\t\t\t\t\t\t\t||    |                                                                      |    ||");
		System.out.println("\t\t\t\t\t\t\t||    |______________________________________________________________________|    ||");
		System.out.println("\t\t\t\t\t\t\t||                                                                                ||");
		System.out.println("\t\t\t\t\t\t\t||--------------------------------------------------------------------------------||");
		System.out.println("\t\t\t\t\t\t\t/__________________________________________________________________________________\\");
		System.out.println("                                                       //                                                                                  \\\\");
		System.out.println("                                                      //      //=====================================================================\\\\     \\\\");
		System.out.println("                                                     //      //    /     /     /     /     /     /    /     /     /     /     /    /  \\\\     \\\\");
		System.out.println("                                                    //      //----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- -----  \\\\     \\\\");
		System.out.println("                                                   //      //    /     /     /     /     /     /    /     /     /     /     /     /     \\\\     \\\\");
		System.out.println("                                                  //      //----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- -----\\\\     \\\\");
		System.out.println("                                                 //      //    /     /     /     /     /     /    /     /     /     /     /     /    /    \\\\     \\\\");
		System.out.println("                                                //      //----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- -----    \\\\     \\\\");
		System.out.println("                                               //      //    /     /     /     /     /     /    /     /     /     /     /     /     /       \\\\     \\\\");
		System.out.println("                                              //      //=====================================================================================\\\\     \\\\");
		System.out.println("                                             //                                                                                                      \\\\");
		System.out.println("                                            //________________________________________________________________________________________________________\\\\");
		System.out.println("                                           //__________________________________________________________________________________________________________\\\\");
		
		chon = sc.nextInt();
			switch(chon)
			{
				case 1: {
					mainnv.menuNV();break;
				}
				case 2: {
					mainkh.menuKH();
					break;
				}
				case 3:{
					mainsp.menuSP();
					break;
				}
	
			}
		}while(chon<4);
	}
	}

