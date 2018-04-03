package fr.tp_garage;

import java.io.Serializable;

public enum TypeMoteur implements Serializable{ 
	diesel("DIESEL"),essence ("ESSENCE"),hybride ("HYBRIDE"),electrique ("ELECTRIQUE");	
	private String technoMoteur = "";

	   

	  //Constructeur

	  private TypeMoteur(String name) {
	

	    this.technoMoteur = name;

	  }

	   

	  public String toString(){

	    return this.technoMoteur;

	  }
}
