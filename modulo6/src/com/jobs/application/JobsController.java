package com.jobs.application;

import java.util.ArrayList;
import java.util.List;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Boss;
import com.jobs.domain.Employee;
import com.jobs.domain.IPaymentRate;
import com.jobs.domain.Junior;
import com.jobs.domain.Manager;
import com.jobs.domain.Mid;
import com.jobs.domain.Senior;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {
	
	private EmployeeRepository repository = new EmployeeRepository();
	
	public JobsController(){
		
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
	
	Boss boss = new Boss(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
		boss.pay();	
	}	

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Manager manager = new Manager(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);
		manager.pay();		
	}	
	
	public void createSeniorEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
		Senior senior = new Senior(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateSenior());
		repository.addMember( senior);
		 senior.pay();		
	}
	
	public void createMidEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
		Mid mid = new Mid(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateMid());
		repository.addMember( mid);
		 mid.pay();		
	}
	
	public void createJuniorEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception  {
		Junior junior = new Junior(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateJunior());
		repository.addMember( junior);
		 junior.pay();		
	}
	
	public void createVolunteer(String name, String address, String phone, String description, double ayuda) throws Exception{
		
		Volunteer volunteer = new Volunteer(name, address, phone,  description, ayuda);
		repository.addMember(volunteer);		
	}
	


	public void payAllEmployeers() {
		List <AbsStaffMember> staffList = repository.getAllMembers() ;
		for (AbsStaffMember e: staffList) {
			e.pay();
		}
	
	}

	public String getAllEmployees() {
		
		String todosEmpleados = "" ;				
		
		 for (AbsStaffMember e: ( repository.getAllMembers() ) ) {
			 todosEmpleados +=e + " \n";
		 }
		return 	todosEmpleados;			
	}

	public void payBonus() {
		List <AbsStaffMember> staffList = repository.getAllMembers() ;
		for (AbsStaffMember e: staffList) {
			if( e instanceof Employee) {
				((Employee) e).payBonus();
			}
		}		
	}

	
	

		
}
