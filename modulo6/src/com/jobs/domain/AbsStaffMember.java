package com.jobs.domain;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public abstract class AbsStaffMember {

	protected int id;
	protected String name;
	protected String address;
	protected String phone;
	protected double totalPaid=0;
	protected  int irpf=0;
	protected String descriptionVolunteer;

	

	private static int COUNTER_MEMBERS = 1;

	public AbsStaffMember(String name, String address, String phone) throws Exception {
		if (name.equals(""))
			throw new Exception();
		if (address.equals(""))
			throw new Exception();
		if (phone.equals(""))
			throw new Exception();

		this.name = name;
		this.address = address;
		this.phone = phone;
		id = COUNTER_MEMBERS;
		COUNTER_MEMBERS++;
	}
	
	@Override
	public String toString() {
		
		NumberFormat forma = new DecimalFormat("#€0.00"); 
		String empleado = "Empleado: "+ name + "\nAdress: "+ address + "\nId: "+ id + " \nPhone: " + phone;		    		
		 if(this instanceof Volunteer) { 
			   empleado += "\nDescripcion : "  + descriptionVolunteer  +
		                   "\nRecibe una ayuda mensual de: "+forma.format( totalPaid )+"\n" ;
		 }
		 else {
			 empleado +=  "\nCobros: " + 
		                    "\nBruto al mes: " + forma.format( totalPaid ) +
					        "\nBruto al año: " + forma.format( totalPaid*14 ) +
					        "\nNeto al mes: " + forma.format(   totalPaid * ( (double) (100 -irpf) /100 ) ) +
					        "\nNeto al año: " + forma.format( totalPaid * ( (double) (100 -irpf) /100 ) *14  )+ "\n" ;			 	
		 }
//		 else {			
//			 empleado += "\nDescripcion : "  + descriptionVolunteer  +
//		                "\nRecibe una ayuda mensual de: "+forma.format( totalPaid )+"\n" ;
//		 }		 			
			return empleado;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getTotalPaid() {
		return totalPaid;
	}

	public void setTotalPaid(double totalPaid) {
		this.totalPaid = totalPaid;
	}
	public String getDescriptionVolunter() {
		return descriptionVolunteer;
	}

	public void setDescriptionVolunteer(String descriptionVolunteer) {
		this.descriptionVolunteer = descriptionVolunteer;
	}

	public int getIrpf() {
		return irpf;
	}

	public void setIrpf(int irpf) {
		this.irpf = irpf;
	}

	public abstract void pay();
}
