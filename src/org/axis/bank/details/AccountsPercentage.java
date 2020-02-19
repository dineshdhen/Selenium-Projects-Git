//package org.axis.bank.details;

import java.util.Scanner;

public class AccountsPercentage {
	public void saving() {
	// TODO Auto-generated method stub
System.out.println("Enter Your Bank Saving Account Percentage: ");
Scanner s=new Scanner(System.in);
int sav=s.nextInt();
System.out.println("Your Bank Saving Acc Percent Is:" +sav);
}
	public void fixed() {
		// TODO Auto-generated method stub
		System.out.println("Enter Your Bank Fixed Account Percentage: ");
		Scanner s=new Scanner(System.in);
		int fix=s.nextInt();
		System.out.println("Your Bank Fixed Acc Percent Is:" +fix);
	}
}
