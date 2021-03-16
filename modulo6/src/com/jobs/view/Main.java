package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {

	
	
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
	
		controller.createBossEmployee("Pepe Boss", "Provenza 25", "444-555-666", 8000);		
		controller.createMidEmployee("Pedro Employee", "Direccion molona 2", "665266666", 2000);
		controller.createJuniorEmployee("Laura Junior", "Diagonal 32", "646-868-965", 1000);
		controller.createVolunteer("Juan Volunteer", "Direccionn molona 4", "614266666",  " voluntario por intercambio", 250);
		controller.createManagerEmployee("Juan carlos Manager", "Direccion molona 5", "666999444", 3500);
		controller.createSeniorEmployee("Javier Senior", "Gran via 25", "667-856-965", 3000.0);
		
		controller.payAllEmployeers();
		
		controller.payBonus();
		
		String allEmployees=controller.getAllEmployees();
		
				
		System.out.println("EMPLOYEES: " +" \n"+ allEmployees  );
		
	}

}
