package fr.tp_garage;

import java.io.Serializable;

public class MoteurElectrique extends Moteur implements Serializable {

	public MoteurElectrique() {
	//	super();
		this.type=TypeMoteur.electrique;
	
	}
	public MoteurElectrique(String cylindre, Double prix) {
		Moteur(cylindre, prix);
		this.type=TypeMoteur.electrique;

	}
/*	private TypeMoteur technoMoteur;
	String cylindre;
	Double prix;
	
	public MoteurElectrique() {
		super();
		setTechnoMoteur(TypeMoteur.electrique);

	}
	
	public MoteurElectrique(String cylindre, Double prix) {
		Moteur(cylindre, prix);
		setTechnoMoteur(TypeMoteur.electrique);
	}

	public Moteur setMoteur(String cylindre2, Double prix2) {
		new MoteurElectrique(cylindre,prix);
		return this;
	}

	private void setTechnoMoteur(TypeMoteur technoMoteur) {
		this.technoMoteur = technoMoteur;
	}

	public TypeMoteur getTechnoMoteur() {
		return this.technoMoteur;
	}
	
	public String toString() {
		return(" Moteur "+this.technoMoteur.toString()+" "+super.cylindre.toString()+" ");
	}
	*/
}
