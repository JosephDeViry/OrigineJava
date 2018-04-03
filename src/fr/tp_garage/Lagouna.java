package fr.tp_garage;

import java.io.Serializable;

public class Lagouna extends Vehicule implements Serializable {

	public Lagouna() {
		this.nom="Lagouna";
		this.nomMarque=Marque.reno;
		this.prix=23123;
	}

}
