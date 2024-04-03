package DeQuy;

public class Fibonaci {
	private static final int F = 0;

	public static int F(int n)
	{
		if(n == 1 || n == 2) return 1;
		else return F*(n-1)+F*(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Fibonaci la: " + F(1) );
	}
	
}
