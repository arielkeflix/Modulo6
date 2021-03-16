package com.jobs.domain;


public class Junior extends Employee{
	
	final static double MINIMO_SUELDO = 900.00; 
	final static double MAXIMO_SUELDO = 1600.00; 
	final static int IRPF = 2;
	
	public Junior(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate)
			throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate ,  MINIMO_SUELDO, MAXIMO_SUELDO, IRPF );
//		try {
//			if(salaryPerMonth <900  || salaryPerMonth > 1600) throw new Exception();, MINIMO_SUELDO, MAXIMO_SUELDO
//		} catch (Exception e) {
//			System.out.println(" El sueldo de un Junior tiene que estar entre 900 y 1600 ");
//		}			
		
	}


}
