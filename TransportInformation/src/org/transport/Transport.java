package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {

	public void TransportForm() {
      System.out.println("Transportation");
      
	}
	
	public static void main(String[] args) {

		Transport tr = new Transport();
		tr.TransportForm();
		
		Road r = new Road();
		r.bike();
		r.bus();
		r.car();
		r.cycle();
		
		Air a = new Air();
		a.aeroplane();
		a.helicoptor();
		
		Water w = new Water();
		w.boat();
		w.ship();
	}

}
