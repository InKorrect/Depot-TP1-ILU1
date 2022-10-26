package personnages;

public class Romain extends personnages {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;
	private int pos = 0;
	private boolean dejaVu = false;
	private static final String ROMAIN = "soldat";
	
	public Romain(String nom, int force) {
		if (force < 0) {
			System.out.println("la force ne doit pas être negative");
		}
		this.nom = nom;
		this.force = force;
		this.equipements = new Equipement[2];
	}
	public String getNom() {
		return nom;
	}
	
	public int getForce() {
		return force;
	}
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2 :
			System.out.println(ROMAIN + this.nom + " est deja bien protege !");
			break;
		case 1 :
			if (equipement.toString().equals(equipements[0].toString())) {
				System.out.println(ROMAIN + this.nom + 
						" possede deja un " 
						+ equipement.toString() + " !" );
				break;
			}
		default :
			System.out.println(ROMAIN + this.nom 
					+ " s'equipe avec un " + equipement.toString() 
					+ " !");
			this.equipements[nbEquipement] = equipement;
			nbEquipement++;
			break;
		}
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "«" + texte + "»");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	//	public void recevoirCoup(int forceCoup) {
	//		assert (forceCoup> 0) : "la force du coup ne doit pas �tre n�gative";
	//		int forceInitiale = this.force;
	//		force -= forceCoup;
	//		if (force > 0) {
	//			parler("Aïe");
	//		} else {
	//			parler("J'abandonne...");
	//		}
	//		assert (forceInitiale > force) : "la force doit avoir diminu�e";
	//
	//	}

	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// precondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		if (forceCoup>0) {
			force -= forceCoup;
			if (force<0) {
				force =0;
			}
		}
		// if (force > 0) {
		// parler("Aïe");
		// } else {
		// equipementEjecte = ejecterEquipement();
		// parler("J'abandonne...");
		// }
		if (force==0) {
			parler("Aïe");}
		else{
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
		// post condition la force à diminuer
		assert force < oldForce;
		return equipementEjecte;
	}
	private int calculResistanceEquipement(int forceCoup) {
		String texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if ((nbEquipement != 0)) {
			texte += "\nMais heureusement, grace a mon equipement sa force est diminue de ";
			for (int i = 0; i < nbEquipement;) {
				if ((equipements[i] != null &&
						equipements[i].equals(Equipement.BOUCLIER)) == true) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
				i++;
			}
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'equipement de " + nom + "s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] != null) {
				equipementEjecte[nbEquipementEjecte] =
						equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
		nbEquipement =0;
		return equipementEjecte;
	}
}
