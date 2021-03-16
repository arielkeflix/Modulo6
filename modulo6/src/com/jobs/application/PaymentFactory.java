package com.jobs.application;

import com.jobs.domain.IPaymentRate;

public class PaymentFactory {

//	public static class ppp implements IPaymentRate{
//
//		@Override
//		public double pay(double salaryPerMonth) {
//			// TODO Auto-generated method stub
//			return salaryPerMonth*1.5;
//		}
//		
//	}
//	public static IPaymentRate createPaymentRateBoss(){		
//		ppp xxx = new ppp() ;
//		return  xxx;
//	}
	
	public static IPaymentRate createPaymentRateBoss(){		
		
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.5;
			}
		};
	}
	
	public static IPaymentRate createPaymentRateManager(){
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.1;
			}
		};
	}
	
	
	public static IPaymentRate createPaymentRateSenior(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth * 0.95;     //todo 
			}
		};
	}
	public static IPaymentRate createPaymentRateMid(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth * 0.90;     //todo 
			}
		};
	}
	public static IPaymentRate createPaymentRateJunior(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth * 0.85;     //todo 
			}
		};
	}
	public static IPaymentRate createPaymentRateVolunteer(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return 0;     //todo 
			}
		};
	}
}
