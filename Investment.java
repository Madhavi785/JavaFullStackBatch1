package com.verizon;
import java.util.Scanner;
public class Investment {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter details: Investment Amount, Annual Interest, Number of Years");
		int IA=sc.nextInt();
		float AI=sc.nextFloat();
		int NY=sc.nextInt();
		System.out.println("Your investment amount is:"+(IA*(1+(AI/12/100)*NY*12)));
		}

}
