package fr.tp_garage;

import java.io.Serializable;

public class VitreElectrique implements Option, Serializable{
	public void Option() {}
	private double prix = 212.35d;

	public Double getPrix() {
		return prix;
	}
	
	public String toString() {
		return ("Vitres électriques" +" (" + this.getPrix().toString()+"€)");
	}
	
}
