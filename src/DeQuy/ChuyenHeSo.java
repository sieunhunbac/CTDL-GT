package DeQuy;
import java.util.Scanner;

public class ChuyenHeSo {

	private void chuyenhs(int n) {
		if (n != 0) {
			chuyenhs(n / 2);
			System.out.print(n % 2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ChuyenHeSo chs= new ChuyenHeSo();
	chs.chuyenhs(10);
	}

}
