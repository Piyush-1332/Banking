package my.project.banking;

import java.util.Scanner;

public class HDFC extends RBI {
	
	@Override
	public void addAmount(Scanner mScan) {
		// TODO Auto-generated method stub
		setADD_INTEREST(2.75);
		super.addAmount(mScan);
	}
	@Override
	public void withdrawAmount(Scanner mScan) {
		// TODO Auto-generated method stub
		setWITHDRAW_INTEREST(2);
		setMIN_BALANCE(2000);
		super.withdrawAmount(mScan);
	}
}
