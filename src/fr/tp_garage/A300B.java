package fr.tp_garage;

import java.io.Serializable;

public class A300B extends Vehicule implements Serializable {
	
	public A300B() {
		this.nom="A300B";
		this.nomMarque=Marque.pigeot;
		this.prix=28457;
	}

}
