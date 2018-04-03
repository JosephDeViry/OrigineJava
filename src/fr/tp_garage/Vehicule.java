package fr.tp_garage;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public abstract class Vehicule implements Option, Serializable {

	private static final long serialVersionUID = -3688728091086136367L;
	protected double prix;
	protected String nom="";
	List <Option> options =new ArrayList<Option>();
	protected Marque nomMarque=null;
	protected Moteur moteurVehicule;

	public Moteur setMoteur(Moteur moteurVehicule1) {
		this.moteurVehicule= moteurVehicule1;
		return this.moteurVehicule;
	}
	
	public String toString() {
		String str = "";
		int nbOptions = this.options.size();

		if (nbOptions>2) {
			for(int i = 0; i < (nbOptions-1); i++) {
				str+= this.options.get(i).toString()+", ";
		      }
		}
		if (nbOptions>0)
			str+=this.options.get(nbOptions-1).toString();

		
		Double prixOptions = 0d;
		
		for(Option optionCourante : options )
			prixOptions+=optionCourante.getPrix();

		
		
		return ("+ Voiture "+this.getMarque().toString()+" : "+this.nom+" "+this.moteurVehicule.toString()+"("+this.getPrix()+"€)"+" [ "+str+"] d'une valeur totale de "+(this.getPrix()+prixOptions)+"€ \n");	

	}
		
	public void addOption(Option opt) {
		this.options.add(opt);
		}

	public Marque getMarque() {
		return this.nomMarque;
		}

	public List<Option> getOptions() {
		
		return this.options;
	}

	public Double getPrix() {
		return this.prix;

	}




}
	

