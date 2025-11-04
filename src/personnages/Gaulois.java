package personnages;

public class Gaulois {
    private String nom;
    private int force;
    private int effetPotion = 1;

    public Gaulois(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "\"" + texte + "\"");
    }

    private String prendreParole() {
        return "Le Gaulois " + nom + " : ";
    }

    @Override
    public String toString() {
        return nom;
    }


    public void frapper(Romain romain) {
        System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
        int forceCoup = (force * effetPotion) / 3;
        romain.recevoirCoup(forceCoup);


        if (effetPotion > 1) {
            effetPotion--;
        }
    }


    public void boirePotion(int effetPotion) {
        this.effetPotion = effetPotion;
        parler("Merci Druide, je sens ma force multipliée par " + effetPotion + " !");
    }
}

