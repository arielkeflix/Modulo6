package com.jobs.domain;



public class Volunteer extends AbsStaffMember {
	
	final static double AYUDA_MAXIMA = 300;
	String description;

	public Volunteer(String name, String address, String phone, String description, double ayuda) throws Exception {
		super(name, address, phone);
		
		super.setDescriptionVolunteer(description);
		
		if(ayuda > AYUDA_MAXIMA) throw new Exception
        ("La ayuda " + ayuda + " por mes para: "+
                  name+" esta fuera del rango (maximo: "+ AYUDA_MAXIMA +" )para su puesto");
		totalPaid = ayuda;
	}

	
	@Override
	public void pay() {
		
		
	}

}
