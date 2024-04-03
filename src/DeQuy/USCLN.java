package DeQuy;

import java.util.Scanner;

public class USCLN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("NHap a : " );
		int a = sc.nextInt();
		System.out.println("NHap b : " );
		int b = sc.nextInt();
		System.out.println("ket qua : "+us(a,b) );
	}
	public static int us(int a, int b){
		if(a==b) return a;
		else if(a>b) return us(a-b,b);
			else return us(a,b-a);
	}

}
