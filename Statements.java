package com.verizon;

import java.util.Scanner;

public class Statements{
   public static void main(String args[]) {

	   //int x=0;
	 //while(x<=10) {
		// x+=2;
		 //if(x==4)
			// continue; //break;
		// System.out.println(x);
 
		// int a[]= {2,3,4,1,5,6,7,8,9};
		 //int sum=0;
		 ////for(int i=0;i<a.length;i++) {
			 //System.out.println(a[i]);
			 //sum+=a[i];
	 //}
    //System.out.println("sum:"+sum);
   // int b[]=new int[5];
    //System.arraycopy(a, 0, b, 2, 2);
    //for(int i=0;i<b.length;i++)
    	//System.out.print(b[i] +" ");
    
   System.out.println("choose operation, 2 numbers + - * /");
   Scanner sc=new Scanner(System.in);
    char ch=sc.next().charAt(0);
    int a=sc.nextInt();
    int b=sc.nextInt();
    
    switch (ch)
    { case '+' : { System.out.println("sum="+(a+b));
                     break;
                 }   
    case '-' : { System.out.println("diff="+(a-b));
    break;
               }
    case '*' : { System.out.println("product="+(a*b));
    break;
               }
    case '/' : { System.out.println("quotient="+(a/b));
    break;
               }
    default : System.out.println("Wrong Operator");
}
}
}
