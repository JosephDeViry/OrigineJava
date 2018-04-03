package fr.tp_garage;

import java.io.Serializable;

public class MoteurEssence extends Moteur implements Serializable{

	public MoteurEssence() {
		this.type=TypeMoteur.essence;
	}

	public MoteurEssence(String cylindre, Double prix) {
		Moteur(cylindre, prix);
		this.type=TypeMoteur.essence;
	}

}