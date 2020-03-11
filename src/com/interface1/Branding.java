package com.interface1;

public class Branding implements Brands{

	@Override
	public void sony() {
		System.out.println("Sony");
		
	}

	@Override
	public void mI() {
		System.out.println("RedMI");
		
	}

	@Override
	public void boats() {
		System.out.println("Headphones");
		
	}
	public static void main(String[] args) {
		Branding B = new Branding();
		B.boats();
		B.sony();
		B.mI();
	}

}
