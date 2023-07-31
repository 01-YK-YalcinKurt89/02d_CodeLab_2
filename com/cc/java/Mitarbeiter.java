package com.cc.java;

public class Mitarbeiter {
	
	private String familyName ;
	private String firstName;
	private String role ;
	private int yearOfEntry ;
	

// Konstruktor zur Initialisierung der Mitarbeiter-Objekte
	public Mitarbeiter(String familyName, String firstName, String role, int yearOfEntry) {
		this.familyName = familyName;
		this.firstName = firstName;
		this.role = role;
		this.yearOfEntry = yearOfEntry;
	}


// Methode zur Abfrage von Mitarbeiter-Informationen basierend auf dem übergebenen Flag
	public String getInfo(String flag) {
		switch (flag) {
			// Wenn das Flag "#name" ist, gibt die Methode Vorname und Nachname des Mitarbeiters zurück
			case "#name":
				return this.firstName +" " + this.familyName;
            // Wenn das Flag "#position" ist, gibt die Methode die Rolle/Position des Mitarbeiters zurück
			case "#position":
				return this.role;
            // Wenn das Flag "#time" ist, gibt die Methode das Jahr des Eintritts des Mitarbeiters zurück
			case "#time":
				return Integer.toString(this.yearOfEntry);
            // Für jeden anderen Wert des Flags gibt die Methode "ERROR" zurück
			default:
			return "ERROR";
		}
	}

}
