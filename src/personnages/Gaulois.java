package personnages;

public class Gaulois {
	private String nom;
	private int effetPotion = 1;
	private int force;
	private int nbTrophees;
	private Equipement[] mesTrophees  = new Equipement[100];
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	//	private String prendreParole() {
	//		return "Le gaulois " + nom + " : ";
	//	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	//	public void frapper(Romain romain) {
	//		System.out.println(nom + " envoie un grand coup dans la m�choire de "
	//				+ romain.getNom());
	//		romain.recevoirCoup(force / 3);
	//	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) *
				effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++, nbTrophees++) {
			this.mesTrophees[nbTrophees] = trophees[i];
		}
	}
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force
				+ ", effetPotion=" + effetPotion + "]";
	}
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est "+
				effetPotion +" fois d�cuplee. ");
	}
	public static void main(String[] args) {
		Gaulois asterix;
		asterix = new Gaulois("Ast�rix", 8);
		System.out.println(asterix);
		asterix.parler("Bonjour � tous");
		asterix.boirePotion(3);
	}

}
