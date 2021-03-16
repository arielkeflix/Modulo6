package com.jobs.domain;

public class Manager extends Employee{
	
	final static double MINIMO_SUELDO = 3000.00; 
	final static double MAXIMO_SUELDO = 5000.00;
	final static int IRPF = 26;
	
	public Manager(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate)
			throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate, MINIMO_SUELDO, MAXIMO_SUELDO, IRPF );
		try {
			if(salaryPerMonth < 3000  || salaryPerMonth > 5000) throw new Exception();
		} catch (Exception e) {
			System.out.println(" El sueldo de un Manager tiene que estar entre 3000 y 5000 ");
		}
		
	}


}
