package com.jobs.domain;

public class Mid extends Employee{
	
	final static double MINIMO_SUELDO = 1800.00; 
	final static double MAXIMO_SUELDO = 2500.00; 
	final static int IRPF = 15;
	
	public  Mid(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate)
			throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate, MINIMO_SUELDO, MAXIMO_SUELDO, IRPF);
		try {
			if(salaryPerMonth < 1800  || salaryPerMonth > 2500) throw new Exception();
		} catch (Exception e) {
			System.out.println(" El sueldo de un Mid tiene que estar entre 1800 y 2500 ");
		}
		
	}

}
