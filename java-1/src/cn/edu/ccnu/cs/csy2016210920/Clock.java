package cn.edu.ccnu.cs.csy2016210920;

import java.util.Scanner;

public class Clock {
	private int h;
	private int m;
	private int s;
	//private int h,m,s;也可，但推荐用上面的方式
	
	public Clock(int h, int m, int s)
	{
		this.h = h;
		this.m = m;
		this.s = s;
	}
	
	public void showTime()
	{
		System.out.println("Time: " + h + " : " + m + " : " + s);
		System.out.printf("Time: %02d : %02d : %02d\n", h, m, s);
	}
	
	public static void main(String[] args) {
		//引用
		//System.out
		//System.in
		//System.err
		System.out.print("Input the h , m , s: ");
		
		Scanner sc = new Scanner(System.in); 
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		
		Clock c = new Clock(h, m, s);
		c.showTime();
		
		sc.close();
	}

}
