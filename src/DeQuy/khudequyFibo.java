package DeQuy;

public class khudequyFibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
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
}
