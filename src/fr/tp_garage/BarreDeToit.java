package fr.tp_garage;

import java.io.Serializable;

public class BarreDeToit implements Option, Serializable {
	public void Option() {}
	private Double prix = new Double(29.9d);

	public Double getPrix() {
		return prix;
	}
	
	public String toString() {
		return ("Barre de toit" +" (" + this.getPrix().toString()+"€)");
	}
 
}
