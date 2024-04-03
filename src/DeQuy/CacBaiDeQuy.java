package DeQuy;

public class CacBaiDeQuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public void chuyenheso(int n) {
		if (n != 0) {
			chuyenheso(n / 2);
			System.out.print(n % 2);
		}
	}
	public void thaphanoi(int n, int A, int B, int C)
	{
		if(n!=0) {
			thaphanoi(n-1,A,C,B);
			System.out.println("Disk "+n+" from coc "+A+" to coc "+C);
			thaphanoi(n-1,B,A,C);
		}
	}
	private static final int F = 0;
	public int F(int n)
	{
		if(n == 1 || n == 2) return 1;
		else return F*(n-1)+F*(n-2);
	}
	
	public int luythua(int x,int n) {
		if (n == 0)
			return 1;
		else
			return x * luythua(x, n - 1);
	}
	public int Tong1(int n) {
		if(n==0) return 1;
		else return n*Tong1(n-1);
	}
	public static int lthua(int x,int n) {
		if (n == 0)
			return 1;
		else
			return x * lthua(x, n - 1);
	}
	
	public double tinhTongLuyThua(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return lthua(n,n) + tinhTongLuyThua(n-1);
		}
	}
	public  int uocSo(int a, int b){
		if(a==b) return a;
		else if(a>b) return uocSo(a-b,b);
			else return uocSo(a,b-a);
	}
}
