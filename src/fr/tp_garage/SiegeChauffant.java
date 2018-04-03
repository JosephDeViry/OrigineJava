package fr.tp_garage;

import java.io.Serializable;

public class SiegeChauffant implements Option, Serializable{
	public void Option() {}
	private Double prix = new Double(562.9d);

	public Double getPrix() {
		return prix;
	}
	
	public String toString() {
		return ("Siège chauffant" +" ("+ this.getPrix().toString()+"€)");
	}
	
}
