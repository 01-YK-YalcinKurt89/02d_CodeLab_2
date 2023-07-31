package com.cc.java;

public class App {

	public static void main(String[] args) {
	

// Erstellen von drei Mitarbeiter-Objekten und Initialisieren mit Werten
	Mitarbeiter mitarbeiter1 = new Mitarbeiter("Mütze", "Maxine", "CTO", 2017);
	Mitarbeiter mitarbeiter2 = new Mitarbeiter("Mützerich", "Max", "COO", 2018);
	Mitarbeiter mitarbeiter3 = new Mitarbeiter("Martinelli", "Silvia", "CEO", 2020);
	
// Aufrufen der Methode "pollMitarbeiter" für jedes Mitarbeiter-Objekt
	pollMitarbeiter(mitarbeiter1);
	pollMitarbeiter(mitarbeiter2);
	pollMitarbeiter(mitarbeiter3);
	}


// Methode zur Ausgabe von Mitarbeiter-Informationen
	private static void pollMitarbeiter(Mitarbeiter ma) {
	// Die Methode "getInfo" wird aufgerufen, um Mitarbeiter-Informationen abzurufen und auszugeben
		output(ma.getInfo("#name"));
		output(ma.getInfo("#position"));
		output(ma.getInfo("#time"));
		output("-------------------");
	} 


// Methode zur Ausgabe von Strings
	private static void output(String outStr) {
		System.out.println(outStr);
	}

};
