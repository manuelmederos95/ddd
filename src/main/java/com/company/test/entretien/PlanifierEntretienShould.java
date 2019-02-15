package com.company.test.entretien;


import com.company.model.entretien.Candidat;
import com.company.model.entretien.Creneau;
import com.company.model.entretien.Entretien;
import com.company.use_case.entretien.PlanifierEntretien;
import com.company.use_case.entretien.entretien_outils.FakeApiEntretien;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class PlanifierEntretienShould {

    Creneau creneau1 = new Creneau();
    Candidat candidat1 = new Candidat(1, "Jean", "craftmanship");
    Candidat candidat2 = new Candidat(2, "Emmanuel", "architecture");
    Candidat candidat3 = new Candidat(3, "Eric", "architecture");
    FakeApiEntretien api = new FakeApiEntretien();

    @Test
    public final void etre_planifie_quand_CR_est_disponible() throws PlanifierEntretien.NoCandidateFoundException {
        Entretien entretien = PlanifierEntretien.planifierEntretien(creneau1, candidat1);
        boolean estplanifie = entretien.getEstPlanifie();
        assertEquals(true, estplanifie);
    }

    @Test (expected = PlanifierEntretien.NoCandidateFoundException.class)
    public final void pas_planifie_quand_CR_pas_disponible() throws PlanifierEntretien.NoCandidateFoundException {
        Entretien entretien = PlanifierEntretien.planifierEntretien(creneau1, candidat3);
        boolean estplanifie = entretien.getEstPlanifie();
        assertEquals(true, estplanifie);
    }

    @Test (expected = PlanifierEntretien.NoCandidateFoundException.class)
    public final void pas_planifie_quand_pas_de_CR_pour_profil() throws PlanifierEntretien.NoCandidateFoundException {
        Entretien entretien = PlanifierEntretien.planifierEntretien(creneau1, candidat2);
        boolean estplanifie = entretien.getEstPlanifie();
        assertEquals(true, estplanifie);
    }

}
