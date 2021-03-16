package com.jobs.domain;

public class Senior extends Employee{
	
	final static double MINIMO_SUELDO = 2700.00; 
	final static double MAXIMO_SUELDO = 4000.00;
	final static int IRPF = 24;

	public Senior(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate)
			throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate, MINIMO_SUELDO, MAXIMO_SUELDO,  IRPF );
		try {
			if(salaryPerMonth < 2700  || salaryPerMonth > 4000) throw new Exception();
		} catch (Exception e) {
			System.out.println(" El sueldo de un Manager tiene que estar entre 2700 y 4000 ");
		}
		
	}

}
