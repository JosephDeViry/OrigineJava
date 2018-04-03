package fr.tp_garage;

import java.io.Serializable;

public class MoteurDiesel extends Moteur implements Serializable {
	
	public MoteurDiesel() {
		this.type=TypeMoteur.diesel;
	}
	
	public MoteurDiesel(String cylindre, Double prix) {
		Moteur(cylindre, prix);
		this.type=TypeMoteur.diesel;
	}

}
