package com.prodapt.ases;

public class SI {
	static int p=100000;
	static	int n=10;
	static int r=3;
	int si;
	int total;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SI o1=new SI();
		o1.si();
		System.out.println(o1.total());
		
	}
	void si()
	{	 si=(p*n*r)/100;
		System.out.println("SIMPLE INTEREST: "+si); 
	}
	int total()
	{
		return si+p;
	}
	
}
