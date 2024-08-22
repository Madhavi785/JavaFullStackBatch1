package com.verizon;

public class LoanTest {

	public static void main(String args[])
	{
		Loan l;
		HousingLoan hl=new HousingLoan();
		l=hl;
		l.applyLoan("ram",2000000.00);
		l.submitDocs();
		System.out.println(l.getEmi());
		Surity s1=hl;
		s1.submitDocs2();
		  VehicleLoan v1=new VehicleLoan();
		  l=vl;
		
		l.applyLoan("raj", 10000.00);
		l.submitDocs();
		System.out.println(l.getEmi());
		s1=v1;
		s1.submitDocs2();
	}
}
