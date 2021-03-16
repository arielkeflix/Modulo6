package com.jobs.domain;

public  class Employee extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	
	

	public Employee(String name, String address, String phone, double salaryPerMonth,
			        IPaymentRate paymentRate ,double  MINIMO_SUELDO , double MAXIMO_SUELDO, int irpf ) throws Exception {
		super(name, address, phone);		
		if(salaryPerMonth< MINIMO_SUELDO  || salaryPerMonth > MAXIMO_SUELDO) throw new Exception
		                                                                    ("el  sueldo de: " + salaryPerMonth + " por mes para: "+
                                                                                      name+" esta fuera del rango para su puesto");
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
		this.irpf =irpf;
	}

	
	@Override
	public void pay() {		
		totalPaid=paymentRate.pay(salaryPerMonth);        		
	}
	public void payBonus() {
		totalPaid = totalPaid *1.1;
	}

   
	
	
}
