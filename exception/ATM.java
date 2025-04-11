package exception;

import java.util.Scanner;

import scannerrr.scannerDemo;

public class ATM {
	double money;
	int pin;
	
	public static void withdraw(double money, int pin) throws RuntimeException
	{
		if(money<0)
			throw new InvalidMoney();
		
		else if(pin<999)
			throw new InvalidPin();
	}
	
	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		System.out.println("Enter amount.");
		double money=m.nextDouble();
		System.out.println("Enter pin");
		int pin=m.nextInt();
	}

}
