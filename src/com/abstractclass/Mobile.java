package com.abstractclass;

public class Mobile extends MobileBrands {
	public void nokia() {
		System.out.println("1600");
	}

	@Override
	public void samsung() {
		// TODO Auto-generated method stub
		System.out.println("Galaxy S10");
	}

	@Override
	public void apple() {
		System.out.println("11 PRO");
		
	}
	public static void main(String[] args) {
		Mobile M = new Mobile();
		M.nokia();
		M.samsung();
		M.apple();
	}
	

}
