package org.allvehicle;

import org.fourwheller.FourWheller;
import org.threewheller.ThreeWheller;
import org.twowheller.TwoWheller;

public class Vehicle {

	public void VehicleNeccesary() {
		System.out.println("VehileNeccesary : 2,3,4 wheeler");

	}

	public static void main(String[] args) {

		Vehicle v = new Vehicle();
		v.VehicleNeccesary();

		TwoWheller t = new TwoWheller();
		t.bike();
		t.cycle();

		ThreeWheller three = new ThreeWheller();
		three.auto();

		FourWheller f = new FourWheller();
		f.bus();
		f.car();
		f.lorry();
	}

}
