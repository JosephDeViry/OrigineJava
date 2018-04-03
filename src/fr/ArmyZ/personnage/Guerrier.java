package fr.ArmyZ.personnage;

import fr.ArmyZ.comportement.CombatAuCouteau;
import fr.ArmyZ.comportement.CombatAuFusil;

public class Guerrier extends Personnage{

	public Guerrier() {
		super();
		setSituationDeCombat(new CombatAuFusil());
		// TODO Stub du constructeur généré automatiquement
	}



}
