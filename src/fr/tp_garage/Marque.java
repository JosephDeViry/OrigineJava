package fr.tp_garage;

import java.io.Serializable;

public enum Marque implements Serializable{
		reno("RENO"),pigeot("PIGEOT"),troen("TROEN");
		String nomMarque="";



	//Constructeur
		private Marque(String nomMarque) {
	
			this.nomMarque = nomMarque;

	  }

	   

	  public String toString(){

	    return nomMarque;

	  }




}
