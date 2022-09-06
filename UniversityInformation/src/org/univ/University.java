package org.univ;

public class University {
	public void ug() {
		System.out.println("UG:BE");
	}

	public void pg() {
		System.out.println("Pg: ME");
	}
	public void pge() {
		System.out.println("Pg: MS");
	}

public static void main(String[] args) {
	University u = new University();
	u.ug();
	u.pg();
   u.pge();
}

}
