package Main;

import java.util.Scanner;
import QLCuaHangLapTop_DSLKDOI.MenuChinh;
import QLCuaHangLapTop_DSLKDON.MenuChinhDSLKDON;
import DeQuy.MenuDQChinh;

public class Main {

	public static void main(String[] args) {
		MenuChinh mainnv = new MenuChinh();
		MenuChinhDSLKDON maindon = new MenuChinhDSLKDON();
		MenuDQChinh dequy = new MenuDQChinh();
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int chon;	
		do {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t||--------------------------------------(o)---------------------------------------||");
		System.out.println("\t\t\t\t\t\t\t||     ______________________________________________________________________     ||");
		System.out.println("\t\t\t\t\t\t\t||    |                                                                      |    ||");
		System.out.println("\t\t\t\t\t\t\t||    |        CHÀO MỪNG ĐẾN VỚI CHƯƠNG TRÌNH QUẢN LÝ CỬA HÀNG BÁN LAPTOP    |    ||");
		System.out.println("\t\t\t\t\t\t\t||    |                                                                      |    ||");		
		System.out.println("\t\t\t\t\t\t\t||    |                 (1): Làm việc với ĐỆ QUY                             |    ||");
		System.out.println("\t\t\t\t\t\t\t||    |                 (2): Làm việc với danh sách liên kết đơn             |    ||");
		System.out.println("\t\t\t\t\t\t\t||    |                 (3): Làm việc với danh sách liên kết đôi             |    ||");
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
					dequy.menuDeQuy();

					break;
				}
				case 2: {
					maindon.MenuTongDSLKDON();
					break;
				}
				case 3:{
					mainnv.MenuTongDSLKDOI();

					break;
				}
	
			}
		}while(chon<4);
	}
	}


