package histoire;
import personnages.Village;
import personnages.Chef;
import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;
import personnages.Equipement;

public class Scenario {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois asterix = new Gaulois("Asterix",8);
		Gaulois obélix = new Gaulois("Obelix",25);
		Romain minus = new Romain("Minus",6);
		Village village = new Village("Village des Irreductibles", 30);
		Chef abraracourcix = new Chef("Abraracourcix",6,8,village);

		
		Gaulois gaulois = village.trouverHabitant(29);
		// index out of bound car bornes dépassées
		
		Druide panoramix = new Druide("Panoramix",3,10);

		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obélix);
		village.setChef(abraracourcix);
		village.afficherVillageois();

		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);

		
		panoramix.parler("Je vais aller preparer une petite potion...");
		panoramix.preparerPotion(10);
		panoramix.booster(obélix);
		obélix.parler("Par Belenos, ce n'est pas juste !");
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		minus.parler("J'abandonne...");
		minus.parler("Trop injuste !");
	}

}