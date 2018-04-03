package fr.tp_garage;

import java.io.Serializable;

public class MoteurHybride extends Moteur implements Serializable{
	
	public MoteurHybride() {
		this.type=TypeMoteur.hybride;
	}
	
	public MoteurHybride(String cylindre, Double prix) {
		Moteur(cylindre, prix);
		this.type=TypeMoteur.hybride;
	}

}
