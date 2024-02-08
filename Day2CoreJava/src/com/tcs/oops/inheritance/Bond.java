package com.tcs.oops.inheritance;

public class Bond extends InvestmentInstrument {
	
	private String startDate;
	private String repayDate;
	
	public Bond() {
	}

	public Bond(String startDate, String repayDate) {
		super();
		this.startDate = startDate;
		this.repayDate = repayDate;
	}

	public Bond(int iiid, String title, String type, double fund, String startDate, String repayDate) {
		super(iiid, title, type, fund);
		this.startDate = startDate;
		this.repayDate = repayDate;
	}
	
}
