package DeQuy;
import java.util.Scanner;
public class MenuDQChinh {
	Scanner sc = new Scanner(System.in);
	MenuDeQuy dq = new MenuDeQuy();
	MenuKhuDeQuy kdq = new MenuKhuDeQuy();
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}
	public void menuDeQuy() {
		int chon1;
		do {
			System.out.println("------------------------------------- MENU ĐỆ QUY --------------------------------------");
			System.out.println("|(1): Đệ quy                                                                           |");
			System.out.println("|(2): Khử đệ Quy                                                                       |");
			System.out.println("|(3): Thoát khỏi chương trình                                                          |");
			System.out.println("----------------------------------------------------------------------------------------");
			chon1 = sc.nextInt();
			switch(chon1)
			{
			case 1:{
				dq.menuDeQuy();
				break;
			}
			case 2:{
				kdq.menuDeQuy();
				break;
			}
		}
		}while(chon1 < 3);
	}
}
