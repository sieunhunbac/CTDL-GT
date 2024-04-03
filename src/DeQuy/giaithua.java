package DeQuy;

public class giaithua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("tong tu 1-->5:"+giaithua(5));
	}
	public static int giaithua(int n)
	{
		if(n==1) return 1;
		else return n*giaithua(n-1);
	}
}
