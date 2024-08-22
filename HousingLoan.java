package com.verizon;

public class HousingLoan implements Loan, Surity{
	public void applyLoan(String name, double amount) {
		System.out.println(name +" loan of amount Rs"+amount+"applied");
		
	}
	public void submitDocs() {
		System.out.println("docs are submitted");
		
	}
	public int getEmi() {
		return 999;
	}
	public void submitDocs2() {
		
	}

}

