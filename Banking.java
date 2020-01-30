/*
 * @Author Capgemini 
 * @Developer Piyush Srivastava
 * @Description This class is performing the banking process
 * @Created 28/01/2020
 * @Version 2.0
 * @Status release Beta
 * 
 */

package my.project.banking;

import java.util.Scanner;

public class Banking{
	
	RBI mRBI;
	
	Scanner mScanner = new Scanner(System.in);

	public static void main(String[] args) {
		Banking mObject = new Banking();
		mObject.welcome();

	}

	public void welcome() {
		while (true) {
			System.out.println("Welcome to Indian Banking System");
			System.out.println("Select Your Bank\n1.ICICI \n2.HDFC \n3.SC \n4.AXIS\n");
			int choice = mScanner.nextInt();
			switch (choice) {
			case 1:
				mRBI=(ICICI) new ICICI();
				options(mRBI);
				
				
//				ICICI mICICI = new ICICI();
//				mRBI=(ICICI)mICICI;
//				options(mRBI);
				break;
			case 2:
				mRBI = (HDFC) new HDFC();
				options(mRBI);
				break;
			case 3:
				mRBI = (SC) new SC();
				options(mRBI);
				break;
			case 4:
				mRBI = (AXIS) new AXIS();
				options(mRBI);
				break;
			default:
				System.out.println("Wrong input Entered\n");
				break;
			}
		}
	}

	public void options(RBI mRBI) {
		int flag = 1;
		while (flag == 1) {
			System.out.println("Select Operation\n1.Add\n2.Withdraw\n3.Switch Bank\n");
			int op = mScanner.nextInt();
			switch (op) {
			case 1:
				mRBI.addAmount(mScanner);
				break;
			case 2:
				mRBI.withdrawAmount(mScanner);
				break;
			case 3:
				flag = 0;
				break;
			default:
				System.out.println("Wrong operation selected");
				break;

			}
		}
	}
}

//	public void hdfc() {
//		int flag = 1;
//		HDFC mHDFC = new HDFC();
//		while (flag == 1) {
//			System.out.println("Select Operation\n1.Add\n2.Withdraw\n3.Show Balance\n");
//			int op = mScanner.nextInt();
//			switch (op) {
//			case 1:
//				mHDFC.addAmount();
//				break;
//			case 2:
//				mHDFC.withdrawAmount();
//				break;
//			case 3:
//				flag = 0;
//			default:
//				System.out.println("Wrong operation selected");
//			}
//		}
//
//	}
//
//	public void SC() {
//		int flag = 1;
//		SC mSC = new SC();
//		while (flag == 1) {
//			System.out.println("Select Operation\n1.Add\n2.Withdraw\n3.Show Balance\n");
//			int op = mScanner.nextInt();
//			switch (op) {
//			case 1:
//				mSC.addAmount();
//				break;
//			case 2:
//				mSC.withdrawAmount();
//				break;
//			case 3:
//				flag = 0;
//			default:
//				System.out.println("Wrong operation selected");
//			}
//		}
//
//	}
//
//	public void axis() {
//		int flag = 1;
//		AXIS mAXIS = new AXIS();
//		while (flag == 1) {
//			System.out.println("Select Operation\n1.Add\n2.Withdraw\n3.Show Balance\n");
//			int op = mScanner.nextInt();
//			switch (op) {
//			case 1:
//				mAXIS.addAmount();
//				break;
//			case 2:
//				mAXIS.withdrawAmount();
//				break;
//			case 3:
//				flag = 0;
//			default:
//				System.out.println("Wrong operation selected");
//			}
//		}
//
//	}
