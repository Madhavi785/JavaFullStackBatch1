package com.verizon;
import java.util.Scanner;
public class Argument {
   public static void main(String args[]) 
{
		// TODO Auto-generated method stub
		//System.out.println("Welcome");
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length, breadth of rect");
		int l=sc.nextInt();
		int b=sc.nextInt();
		if(l>0 && b>0) {
		int area=l*b;
		//String name=sc.nextLine();
		System.out.println("Area:"+area);	
		}else
			System.out.println("l and b shoud be greater than 0");
}
}
