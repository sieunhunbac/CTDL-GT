package DeQuy;
import java.util.Scanner;
public class TinhTong {

	public static int Tong1(int n) {
		if(n==0) return 1;
		else return n*Tong1(n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n : ");
		int n = sc.nextInt();
	    int tong = Tong1(n);
	    System.out.println("Tổng 1 đến " + n + " là: " + tong);
	}
}
