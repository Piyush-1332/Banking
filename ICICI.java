package my.project.banking;

import java.util.Scanner;

public class ICICI extends RBI {

	@Override
	public void addAmount(Scanner mScan) {
		// TODO Auto-generated method stub
		setADD_INTEREST(2.3);
		super.addAmount(mScan);
	}
	@Override
	public void withdrawAmount(Scanner mScan) {
		// TODO Auto-generated method stub
		setWITHDRAW_INTEREST(1.5);
		setMIN_BALANCE(3000);
		super.withdrawAmount(mScan);
	}

}
