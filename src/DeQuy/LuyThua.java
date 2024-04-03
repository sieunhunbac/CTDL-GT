package DeQuy;

public class LuyThua {

	public static int lthua(int x,int n) {
		if (n == 0)
			return 1;
		else
			return x * lthua(x, n - 1);
	}
	public static void main(String[] args) {
		System.out.println("luy thua :" + lthua(2,3));
	}

}
