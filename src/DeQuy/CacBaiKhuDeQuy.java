package DeQuy;

public class CacBaiKhuDeQuy {
	public int Fibo (int n)
	{
		int a = 1; int b = 1; int s = 2;
		for( int i = 3;i<=n;i++)
		{
			s=a+b;
			a=b;b=s;
		}
		return s;
	}
	public int giaithua(int n)
	{
		if(n==1) return 1;
		else return n*giaithua(n-1);
	}
}
