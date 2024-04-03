package DeQuy;

import java.util.Scanner;

public class MenuKhuDeQuy {
	CacBaiKhuDeQuy kdq = new CacBaiKhuDeQuy();
	Scanner sc = new Scanner(System.in);
	public void menuDeQuy() {
		int chon1;
		do {
			System.out.println("-------------------------------- CÁC BÀI TOÁN KHỬ ĐỆ QUY -------------------------------");
			System.out.println("|(1): Bài toán Fibonaci                                                                |");
			System.out.println("|(2): Bài toán tính giai                                                               |");
			System.out.println("|(3): Thoát khỏi chương trình                                                          |");
			System.out.println("----------------------------------------------------------------------------------------");
			chon1 = sc.nextInt();
			switch(chon1)
			{
			case 1:{
				System.out.println("Nhập hệ số : ");
				int n = sc.nextInt();
				kdq.Fibo(n);
				break;
			}
			case 2:{
				System.out.println("Nhập hệ số : ");
				int n = sc.nextInt();
				kdq.giaithua(n);
				break;
			}
		}
		}while(chon1 < 3);
	}
}
