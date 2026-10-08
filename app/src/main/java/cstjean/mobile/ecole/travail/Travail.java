package cstjean.mobile.ecole.travail;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * Travail scolaire.
 *
 * @author Morgane Gamache
 */
public class Travail {
    /**  Le nom du travail.*/
    private final String nom;
    private final Calendar dateRemise;


    /**
     * Constructeur
     *
     * @param nom Le nom du travail.
     * @param dateRemise La date
     */

    public Travail(String nom, Calendar dateRemise) {

        this.nom = nom;
        this.dateRemise = dateRemise;
    }

    /**
     * Récupère le nom du travail.
     *
     * @return Le nom du travail.
     */

    public String getNom() {
        return nom;
    }

    public Calendar getDateRemise() {
        return dateRemise;
    }
}
