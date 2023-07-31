package com.cc.java;

public class App {

	public static void main(String[] args) {
	
	Mitarbeiter mitarbeiter1 = new Mitarbeiter("Mütze", "Maxine", "CTO", 2017);
	Mitarbeiter mitarbeiter2 = new Mitarbeiter("Mützerich", "Max", "COO", 2018);
	Mitarbeiter mitarbeiter3 = new Mitarbeiter("Martinelli", "Silvia", "CEO", 2020);
	
	pollMitarbeiter(mitarbeiter1);
	pollMitarbeiter(mitarbeiter2);
	pollMitarbeiter(mitarbeiter3);

	}

	private static void pollMitarbeiter(Mitarbeiter ma) {
		output(ma.getInfo("#name"));
		output(ma.getInfo("#position"));
		output(ma.getInfo("#time"));
		output("-------------------");
	} 

	private static void output(String outStr) {
		System.out.println(outStr);
	}

};
