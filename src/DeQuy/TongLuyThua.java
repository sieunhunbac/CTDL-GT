package DeQuy;

public class TongLuyThua {
	
	public static int lthua(int x,int n) {
		if (n == 0)
			return 1;
		else
			return x * lthua(x, n - 1);
	}
	
	public static double tinhTong(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return lthua(n,n) + tinhTong(n-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println("Tong tu 1^1 den n^n la :" + tinhTong(n));
	}

}
