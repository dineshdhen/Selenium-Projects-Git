package org.axis.bank.details;

import java.util.Scanner;

public class AccountsPercetage1 extends AccountsPercentage {
	public void deposit() {
		System.out.println("Enter Your Bank Deposit Account Percentage: ");
		Scanner s=new Scanner(System.in);
		int des=s.nextInt();
		System.out.println("Your Bank Deposit Acc Percent Is:" +des);
	}
	public static void main(String[] args) {
		AccountsPercetage1 acc=new AccountsPercetage1();
		acc.deposit();
		acc.saving();
		acc.fixed();
	}
}
