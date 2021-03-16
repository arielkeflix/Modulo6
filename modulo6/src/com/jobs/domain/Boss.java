package com.jobs.domain;

public class Boss extends Employee{
	
	final static double MINIMO_SUELDO = 8000.00; 
	final static double MAXIMO_SUELDO =1000000.00; 
	final static int IRPF = 32;
	
	public Boss (String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate)
			throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate, MINIMO_SUELDO, MAXIMO_SUELDO, IRPF);
		try {
			if(salaryPerMonth < 8000) throw new Exception();
		} catch (Exception e) {
			System.out.println(" Minimo sueldo Boss  es 8000 ");
		}
		
	}


}
