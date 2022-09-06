package org.univ;

public class College extends University {

	@Override
	public void ug() {
		System.out.println("UG: SNSCT");
	}
	@Override
	public void pg() {
		System.out.println("UG: SNSCE");	
	}
	public static void main(String[] args) {
		College c = new College();
		c.ug();
		c.pg();
		c.pge();
	}
	
	
	
}
