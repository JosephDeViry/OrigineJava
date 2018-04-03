package fr.ArmyZ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.ArmyZ.comportement.FaireUnePiqureDeMorphine;
import fr.ArmyZ.personnage.Guerrier;
import fr.ArmyZ.personnage.Medecin;
import fr.ArmyZ.personnage.Personnage;

public class TestArmyZ {

	public static void main(String[] args) {
		// TODO Stub de la méthode généré automatiquement
		List<Personnage> listeDesPersonnages=new ArrayList<Personnage>();
		Personnage rambo= new Guerrier();
		Personnage drQueen = new Medecin();
		listeDesPersonnages.add(rambo);
		listeDesPersonnages.add(drQueen);
//		rambo.getSituationDeCombat().Combattre();
//		rambo.getActionDeDeplacement().SeDeplacer();
		for (Personnage personnage : listeDesPersonnages) {
			personnage.getActionDeDeplacement().SeDeplacer();
			personnage.getSituationDeCombat().Combattre();
			
		}
		((Medecin) drQueen).setActionMedicale(new FaireUnePiqureDeMorphine());
		((Medecin)drQueen).getActionMedicale().soigner();
		
		/*		Scanner clavier = new Scanner(System.in);
		String saisie = clavier.nextLine().toLowerCase();
		switch (saisie) {
		case "courir":
			drQueen.getActionDeDeplacement.SeDeplacer();
			rambo.getActionDeDeplacement.SeDeplacer();
			break;
		case "combattre":
			rambo.getSituationDeCombat();
			break;
		case "soigner" :	
			drQueen.soigner();
			break;

		default:
			
			break;
		}
*/	}

}
