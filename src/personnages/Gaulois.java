package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getnom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

public void frapper(Romain romain) {
	System.out.println(nom+ "envoie un grand coup dans la machoire de" + romain.getNom());
	romain.recevoirCoup(force/3);
	
}
}
