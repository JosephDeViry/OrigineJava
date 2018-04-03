package fr.tp_garage;

import java.io.Serializable;

public class GPS implements Option, Serializable{
	public void Option() {}
	private Double prix = new Double(113.5d);

	public Double getPrix() {
		return prix;
	}

	public String toString() {
		return ("GPS" +" (" + this.getPrix().toString()+"€)");
	}
	
}
