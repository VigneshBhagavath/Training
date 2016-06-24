package com.training;

import java.util.Scanner;

public class AppElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the ConsumerNo:");
		long cno = sc.nextLong();
		
		System.out.println("Enter the ConsumerName:");
		String cname = sc.next();
		
		System.out.println("Enter the LastReading:");
		double lr = sc.nextDouble();
		
		System.out.println("Enter the CurrentReading:");
		double cr = sc.nextDouble();
		
		System.out.println("Enter the ConsumerType:");
		String ctype = sc.next();
		
		ElectricityBill reading = new ElectricityBill(cno, cname, lr, cr, ctype);
		
		
		BillManager mgr1 = new BillManager();
		double amt = mgr1.CalculateBill(reading);
		System.out.println(amt);
		BillManager mgr2 = new BillManager(new ElectricityBill(101,"XYZ",300,500,"COM"));
		double amt1 = mgr2.CalculateBill();
		System.out.println(amt1);
		
		sc.close();
	}

}
