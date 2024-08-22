package com.verizon;
import java.util.Scanner;
public class Feet{
    public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter number in feet");
    	int F=sc.nextInt() ;
    	System.out.println("Display Meters"+F*0.305);
    }

}
