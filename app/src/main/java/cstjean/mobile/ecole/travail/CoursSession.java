package cstjean.mobile.ecole.travail;

import java.util.ArrayList;
import java.util.List;

public class CoursSession implements Comparable<CoursSession> {
    private final String departement;
    private final String numero;
    private final List<Travail> travaux = new ArrayList<>();
    private static int compteur = 0;

    public CoursSession(String departement, String numero) {
        this.departement = departement;
        this.numero = numero;
        incrementerCompteur();
    }

    public String getDepartement() {
        return departement;
    }

    public String getNumero() {
        return numero;
    }

    public int getNombreTravaux() {
        return travaux.size();
    }

    public void ajouterTravail(Travail travail) {
        travaux.add(travail);
    }

    public Travail getTravail(int index) {
        return travaux.get(index);
    }

    static int getCompteur() {
        return compteur;
    }

    static void resetCompteur() {
        compteur = 0;
    }

    private static void incrementerCompteur() {
        compteur++;
    }

    @Override
    public int compareTo(CoursSession o) {
        int compareDepartement = getDepartement().compareTo(o.getDepartement());

        if (compareDepartement != 0)
            return compareDepartement;

        return getNumero().compareTo(o.getNumero());
    }
}
