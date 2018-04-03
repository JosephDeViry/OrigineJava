package fr.tp_garage;

import java.io.Serializable;

public class Moteur implements Serializable{TypeMoteur type;
String cylindre;
Double prix;

	public void Moteur(String cylindre, Double prix) {
		this.cylindre = cylindre;
		this.prix=prix;
		
	}
	
	public Double getPrix() {
		return this.prix;
	}
	
	public String toString() {
		return(" Moteur "+this.type+" "+this.cylindre+" ");

	}

}
