package fr.ArmyZ.personnage;



import fr.ArmyZ.comportement.CombatAuCouteau;
import fr.ArmyZ.comportement.Deplacement;
import fr.ArmyZ.comportement.EspritCombatif;
import fr.ArmyZ.comportement.Marcher;

public abstract class Personnage {

	private EspritCombatif situationDeCombat;// = new CombatAuCouteau();

	private Deplacement actionDeDeplacement;// = new Courir();
	
	
	public Personnage() {
		setSituationDeCombat(new CombatAuCouteau());
		setActionDeDeplacement(new Marcher());
	}
	/**
	 * @return le situationDeCombat
	 */
	public EspritCombatif getSituationDeCombat() {
		return situationDeCombat;
	}

	/**
	 * @param situationDeCombat le situationDeCombat à définir
	 */
	public void setSituationDeCombat(EspritCombatif situationDeCombat) {
		this.situationDeCombat = situationDeCombat;
	}
	/**
	 * @return le actionDeDeplacement
	 */
	public Deplacement getActionDeDeplacement() {
		return actionDeDeplacement;
	}
	/**
	 * @param actionDeDeplacement le actionDeDeplacement à définir
	 */
	public void setActionDeDeplacement(Deplacement actionDeDeplacement) {
		this.actionDeDeplacement = actionDeDeplacement;
	}
	//public EspritCombatif combattre() {
	//	return situationDeCombat;
		// TODO Stub de la méthode généré automatiquement
		
	//}

}
