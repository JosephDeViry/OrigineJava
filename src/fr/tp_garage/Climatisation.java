package fr.tp_garage;

import java.io.Serializable;

public class Climatisation implements Option, Serializable{
	public void Option() {}
	private Double prix = new Double(347.3d);

	public Double getPrix() {
			return prix;
	}
	
	 public String toString() {
			return ("Climatisation" +" (" + this.getPrix().toString()+"€)");
			 
	}
}
