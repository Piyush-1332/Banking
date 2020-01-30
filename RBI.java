package my.project.banking;

import java.util.Scanner;

public class RBI {

	double BALANCE = 0, MIN_BALANCE, WITHDRAW_INTEREST, ADD_INTEREST;
	int ADD_COUNTER = 0, WITH_COUNTER = 0, CARRY_INT = 0;

	// java bean
	public int getCARRY_INT() {
		return CARRY_INT;
	}

	// java bean
	public void setCARRY_INT(int cARRY_INT) {
		CARRY_INT = cARRY_INT;
	}

	// An object for Scanner which is invoked in Every class
//	Scanner mScan = new Scanner(System.in);

	// This method will Deposit Amount
	public void addAmount(Scanner mScan) {
		float dep = 0;
		System.out.println("Enter the amount to be deposited : ");
		dep = mScan.nextInt();
		setADD_COUNTER(getADD_COUNTER() + 1);
		if (getADD_COUNTER() <= 3) {
			setBALANCE(getBALANCE() + dep);

		} else {
			setBALANCE(getBALANCE() + dep + ((getADD_INTEREST() * dep) / 100));
		}
		System.out.println(getBALANCE());

	}

	// This Method will Withdraw Amount
	public void withdrawAmount(Scanner mScan) {
		float deduct = 0;
		System.out.println("Enter the amount to be Withdraw");
		deduct = mScan.nextInt();
		if (getBALANCE() - deduct < getMIN_BALANCE() && getWITH_COUNTER() > 3) {
			setWITH_COUNTER(getWITH_COUNTER() + 1);
			System.out.print("Transaction Failed : Not Enough Balance ");
			setCARRY_INT(1);
		

		} else if (getBALANCE() - deduct < getMIN_BALANCE() && getWITH_COUNTER() <= 3) {
			setWITH_COUNTER(getWITH_COUNTER() + 1);
			System.out.print("Transaction Failed : Not Enough Balance ");
		} else {
			if (getWITH_COUNTER() <= 3) {
				setBALANCE(getBALANCE() - deduct);
				setWITH_COUNTER(getWITH_COUNTER() + 1);
			} else {
				if (getCARRY_INT() == 1) {
					setBALANCE(getBALANCE() - deduct - (((2 * getWITHDRAW_INTEREST()) * deduct / 100)));
					setWITH_COUNTER(getWITH_COUNTER() + 1);
					setCARRY_INT(0);
				} else {
					setBALANCE(getBALANCE() - deduct - ((getWITHDRAW_INTEREST() * deduct / 100)));
					setWITH_COUNTER(getWITH_COUNTER() + 1);
				}
			}
		}
		System.out.println(getBALANCE());
	}

	// java bean
	public double getBALANCE() {
		return BALANCE;
	}

	// java bean
	public void setBALANCE(double bALANCE) {
		BALANCE = bALANCE;
	}

	// java bean
	public double getMIN_BALANCE() {
		return MIN_BALANCE;
	}

	// java bean
	public void setMIN_BALANCE(double mIN_BALANCE) {
		MIN_BALANCE = mIN_BALANCE;
	}

	// java bean
	public double getWITHDRAW_INTEREST() {
		return WITHDRAW_INTEREST;
	}

	// java bean
	public void setWITHDRAW_INTEREST(double wITHDRAW_INTEREST) {
		WITHDRAW_INTEREST = wITHDRAW_INTEREST;
	}

	// java bean
	public double getADD_INTEREST() {
		return ADD_INTEREST;
	}

	// java bean
	public void setADD_INTEREST(double aDD_INTEREST) {
		ADD_INTEREST = aDD_INTEREST;
	}

	// java bean
	public int getADD_COUNTER() {
		return ADD_COUNTER;
	}

	// java bean
	public void setADD_COUNTER(int aDD_COUNTER) {
		ADD_COUNTER = aDD_COUNTER;
	}

	// java bean
	public int getWITH_COUNTER() {
		return WITH_COUNTER;
	}

	// java bean
	public void setWITH_COUNTER(int wITH_COUNTER) {
		WITH_COUNTER = wITH_COUNTER;
	}
}
