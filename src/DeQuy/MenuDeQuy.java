package DeQuy;

import java.util.Scanner;

public class MenuDeQuy {
	CacBaiDeQuy dq = new CacBaiDeQuy();
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void menuDeQuy() {
		int chon1;
		do {
			System.out.println("---------------------------------- CÁC BÀI TOÁN ĐỆ QUY ---------------------------------");
			System.out.println("|(1): Bài toán chuyển hệ số                                                            |");
			System.out.println("|(2): Bài toán tháp Hà Nội                                                             |");
			System.out.println("|(3): Bài toán Fibonaci                                                                |");
			System.out.println("|(4): Bài toán lũy thừa                                                                |");
			System.out.println("|(5): Bài toán tính tổng từ 1 đến hệ số n                                              |");
			System.out.println("|(6): Bài toán tính tổng từ 1^1 đến hệ số n^n                                          |");
			System.out.println("|(7): Bài toán tính ước số                                                             |");
			System.out.println("|(8): Thoát khỏi chương trình                                                          |");
			System.out.println("-----------------------------------------------------------------------------------------");
			chon1 = sc.nextInt();
			switch(chon1)
			{
			case 1:{
				System.out.println("Nhập hệ số : ");
				int n = sc.nextInt();
				dq.chuyenheso(n);
				break;
			}
			case 2:{
				System.out.println("Nhập số đĩa cần di chuyên : ");
				int n = sc.nextInt();
				System.out.println("Nhập cọc suất phát A : ");
				int A = sc.nextInt();
				System.out.println("Nhập cọc suất phát B : ");
				int B = sc.nextInt();
				System.out.println("Nhập cọc suất phát C : ");
				int C = sc.nextInt();
				dq.thaphanoi(n, A, B, C);
				break;
			}
			case 3:{
				System.out.println("Nhập hệ số của Fibonaci : ");
				int f = sc.nextInt();
				System.out.println("Fibonaci la: " + dq.F(f) );
				break;
			}
			case 4:{
				System.out.println("Nhập hệ số A : ");
				int a = sc.nextInt();
				System.out.println("Nhập hệ số B : ");
				int b = sc.nextInt();
				System.out.println("Lũy thừa của hệ số trên :" + dq.luythua(a, b));
			break;
			}
			case 5:{
				System.out.println("Nhập hệ số n : ");
				int n = sc.nextInt();
				System.out.println("Tổng 1 đến " + n + " là: " + dq.Tong1(n));
				break;
			}
			case 6:{
				System.out.println("Nhập hệ số n : ");
				int n = sc.nextInt();
				System.out.println("Tổng từ 1^1 đến "+n+"^"+n+" là :" + dq.tinhTongLuyThua(n));
				break;
			}
			case 7:{
				System.out.println("Nhập hệ số a : " );
				int a = sc.nextInt();
				System.out.println("Nhập hệ số b : " );
				int b = sc.nextInt();
				System.out.println("Kết quả ước số : "+dq.uocSo(a, b) );
				break;
			}
			}
			}while(chon1 < 8);
}
}
