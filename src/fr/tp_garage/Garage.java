package fr.tp_garage;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;




public class Garage implements Serializable {

//	private static final long serialVersionUID = -2287236619335056982L;

	public List<Vehicule> voitures=new ArrayList<>();
	File sauvegarde;
	
	public Garage() {
		sauvegarde=new File("Vehicules.txt");		  
		if(this.sauvegarde.length() != 0d) {
			ObjectInputStream ois;
			try {
				ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream(sauvegarde)));
				this.voitures = ((ArrayList<Vehicule>)(ois.readObject()));
			if (ois != null)
				ois.close();
			} catch (ClassNotFoundException e) {
					e.printStackTrace();
			} catch (FileNotFoundException e) {
					e.printStackTrace();
			} catch (IOException e) {
			    	e.printStackTrace();
			}
/*		try {	
			if (ois != null)
				ois.close();
		} catch (ClassNotFoundException e) {
				e.printStackTrace();
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch (IOException e) {
		    	e.printStackTrace();
		}
*/
		}
	}	 

	public Garage(List<Vehicule> voitures) {
		this.voitures=voitures;
	}

	
	public String toString() {

		String STR="";
		String str="******************************\n"
				+  " *   Garage OpenClassrooms   *\n"
				+  "******************************\n";

		if(this.sauvegarde.length()==0)
			STR= ("Aucune voiture sauvegardée !\n"+str);
	      
		else {
			for(Vehicule voiture : voitures)
				str+= voiture.toString();
			STR= str;
		}

		return(STR);
	}

	
	public void addVoiture(Vehicule voit) {

		this.voitures.add(voit);
		
	    try (FileOutputStream fos=new FileOutputStream("Vehicules.txt");BufferedOutputStream bos= new BufferedOutputStream(fos);ObjectOutputStream oos = new ObjectOutputStream(bos) ){

		      //Nous allons écrire le liste voitures actualisée dans le fichier
		    	  oos.writeObject(this.voitures);
		    	  
		    } catch (FileNotFoundException e) {
		      e.printStackTrace();
		    } catch (IOException e2) {
		      e2.printStackTrace();
		    }       

		  }

	
	}
	

	


