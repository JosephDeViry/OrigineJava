package fr.ArmyZ.personnage;

import fr.ArmyZ.comportement.*;

public class Medecin extends Personnage {
	private  Soin actionMedicale;// = new StopperLHemoragie();
	public Medecin() {
		super();

	}
	/**
	 * @return le actionMédicale
	 */
	public Soin getActionMedicale() {
		return actionMedicale;
	}
	/**
	 * @param actionMédicale le actionMédicale à définir
	 */
	public void setActionMedicale(Soin actionMedicale) {
		this.actionMedicale = actionMedicale;
	}


	

}
