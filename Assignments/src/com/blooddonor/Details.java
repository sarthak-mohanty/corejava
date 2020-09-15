package com.blooddonor;

public class Details {

	private String donorName;
	private int donorAge;
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Details(String donorName, int donorAge) {
		super();
		this.donorName = donorName;
		this.donorAge = donorAge;
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public int getDonorAge() {
		return donorAge;
	}
	public void setDonorAge(int donorAge) {
		this.donorAge = donorAge;
	}
	
	
}
