package personnages;

import personnages.Equipement;

public class Trophee {
	private personnages gaulois;
	private Equipement equipement;

	public Trophee(personnages gaulois, Equipement equipement) {
		super();
		this.gaulois = gaulois;
		this.equipement = equipement;
	}

	public personnages getGaulois() {
		return gaulois;
	}
	public Equipement getEquipement() {
		return equipement;
	}

//	public void donnerNom(Gaulois gaulois) {
//		System.out.println(gaulois.getnom);
//	}
}
