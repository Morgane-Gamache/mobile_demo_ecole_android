package cstjean.mobile.ecole.travail.rapport;

import cstjean.mobile.ecole.travail.CoursSession;
import cstjean.mobile.ecole.travail.Travail;

import java.text.SimpleDateFormat;

public class RapportTravaux extends Rapport {
    static final String ENTETE_RAPPORT_TRAVAUX = "------------- TRAVAUX -------------" + SAUT_LIGNE;
    static final String PIEDPAGE_RAPPORT_TRAVAUX = SAUT_LIGNE + "--------------------------";

    static String getRapportTravaux(CoursSession coursSession){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        StringBuilder sb = new StringBuilder();

        sb.append(ENTETE_RAPPORT_TRAVAUX);
        for (int i = 0; i < coursSession.getNombreTravaux(); i++) {
            Travail travail = coursSession.getTravail(i);

            sb.append(travail.getNom())
                    .append(" - ")
                    .append(format.format(travail.getDateRemise().getTime()))
                    .append(SAUT_LIGNE);
        }
        sb.append("Total : ")
                .append(coursSession.getNombreTravaux())
                .append(PIEDPAGE_RAPPORT_TRAVAUX);

        return sb.toString();
    }

}
