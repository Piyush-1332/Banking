package my.project.banking;

import java.util.Scanner;

public class SC extends RBI{
	@Override
	public void addAmount(Scanner mScan) {
		// TODO Auto-generated method stub
		setADD_INTEREST(3.8);
		super.addAmount(mScan);
	}
	

	@Override
	public void withdrawAmount(Scanner mScan) {
		// TODO Auto-generated method stub
		setWITHDRAW_INTEREST(3);
		setMIN_BALANCE(5000);
		super.withdrawAmount(mScan);
	}
}
