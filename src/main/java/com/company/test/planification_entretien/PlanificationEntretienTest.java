package com.company.test.planification_entretien;

import com.company.Controller_planification_entretien;
import com.company.use_case.planification_entretien.Plannification_entretien_technique;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlanificationEntretienTest {

    Plannification_entretien_technique plan = new Controller_planification_entretien();

    /** Test si la salle est dispoible*/
    @Test
    public final void testSalleDispo() {
        assertEquals(true, plan.verification_salle_ordinateur(true) );
    }

    /**Test si la salle n'est pas disponible*/
    @Test
    public final void testSalleNonDispo() {
        assertEquals(false, plan.verification_salle_ordinateur(false) );
    }

    /**Test si la consultant recruteur est bien selectionné*/
    @Test
    public final void selectionConsultantTest() throws Controller_planification_entretien.NoConsultantFoundException {
        assertEquals(true, plan.selection_consultant_recruteur(true) );
    }

    /**Test de l'exception lors que la sélection des consultants renvoie null*/
    @Test (expected = Controller_planification_entretien.NoConsultantFoundException.class)
    public final void selectionConsultantManquantTest() throws Controller_planification_entretien.NoConsultantFoundException {
       plan.selection_consultant_recruteur(false);
    }

    /**Test si le consultant est disponible*/
    @Test
    public final void testConsultantDispo() {
        assertEquals(true, plan.dispo_consultant_recruteur(true) );
    }

    /**Test si le consultant n'est pas disponible*/
    @Test
    public final void testConsultantNonDispo() {
        assertEquals(false, plan.dispo_consultant_recruteur(false) );
    }

    /**Test si le candidat est disponible */
    @Test
    public final void testCandidatDispo() {
        assertEquals(true, plan.dispo_candidat(true) );
    }

    /**Test si le consultant n'est pas disponible*/
    @Test
    public final void testCandidatNonDispo() {
        assertEquals(false, plan.dispo_candidat(false) );
    }

}
