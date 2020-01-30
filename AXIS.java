package my.project.banking;

import java.util.Scanner;

public class AXIS extends RBI {	
	
	@Override
	public void addAmount(Scanner mScan) {
		// TODO Auto-generated method stub
		setADD_INTEREST(2);
		super.addAmount(mScan);
	}

	@Override
	public void withdrawAmount(Scanner mScan) {
		// TODO Auto-generated method stub
		setWITHDRAW_INTEREST(1.7);
		setMIN_BALANCE(4000);
		super.withdrawAmount(mScan);
	}
}
