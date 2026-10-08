package cstjean.mobile.ecole.travail;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestTravailEquipe extends TestTravail {
    public void testAjoutCoequipiers(){
        TravailEquipe travail = (TravailEquipe) creerTravail("TP1", new GregorianCalendar(2026, Calendar.SEPTEMBER, 20));

        int da1 = 123456;
        String nomCoequipier1 = "Sébastien Huot";
        travail.ajouterCoequipier(da1, nomCoequipier1);
        assertEquals(nomCoequipier1, travail.getCoequipier(da1));

        int da2 = 123457;
        String nomCoequipier2 = "Simon";
        travail.ajouterCoequipier(da2, nomCoequipier2);
        assertEquals(nomCoequipier2, travail.getCoequipier(da2));
        assertEquals(nomCoequipier1, travail.getCoequipier(da1));
    }


    @Override
    protected Travail creerTravail(String nom, Calendar dateRemise) {
        return new TravailEquipe(nom, dateRemise);
    }


}
