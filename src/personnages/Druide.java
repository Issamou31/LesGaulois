package personnages;

public class Druide {
	private String nom;
	private int forcePotion;
	private Chaudron chaudron;

	public Druide(String nom, int forcePotion) {
		this.nom = nom;
		this.forcePotion = forcePotion;
		this.chaudron = new Chaudron();
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le Druide " + nom + " : ";
	}

	public void fabriquerPotion(int nbDoses, int forcePotion) {
		this.forcePotion = forcePotion;
		chaudron.remplirChaudron(nbDoses);
		parler("J'ai concocté " + nbDoses + " doses de potion magique. Elle a une force de " + forcePotion + ".");
	}

	public void boosterGaulois(Gaulois gaulois) {
		if (gaulois.getNom().equals("Obélix")) {
			parler("Non, Obélix Non !... Et tu le sais très bien !");
		} else if (chaudron.resterPotion()) {
			parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");
			gaulois.boirePotion(forcePotion);
			chaudron.utiliserDose();
		} else {
			parler("Désolé, il n'y a plus de potion !");
		}
	}
}
