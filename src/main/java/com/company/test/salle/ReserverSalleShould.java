package com.company.test.salle;

import com.company.model.entretien.Candidat;
import com.company.model.entretien.Creneau;
import com.company.model.entretien.Entretien;
import com.company.model.salle.Salle;
import com.company.use_case.entretien.PlanifierEntretien;
import com.company.use_case.salle.ReserverSalle;
import com.company.use_case.salle.salle_outils.SalleOutils;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;



public class ReserverSalleShould {


    Creneau creneau1 = new Creneau();
    Candidat candidat1 = new Candidat(1, "Jean", "craftmanship");


    @Test
    public final void reserver_primiere_salle_dispo() throws ReserverSalle.NoSalleDispoExeption, PlanifierEntretien.NoCandidateFoundException {

        Entretien entretien = PlanifierEntretien.planifierEntretien(creneau1, candidat1);
        Salle salleReservee = ReserverSalle.reserverSalle(entretien);
        assertEquals("Salle2", salleReservee.getNom());
    }
}
