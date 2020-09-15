package com.blooddonor;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Details user = new Details();
		
		user.setDonorName("Sarthak");
		user.setDonorAge(21);
		
		System.out.println(user.getDonorName());
		System.out.println(user.getDonorAge());
		
	}

}
