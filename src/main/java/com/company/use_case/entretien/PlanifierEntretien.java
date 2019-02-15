package com.company.use_case.entretien;

import com.company.model.entretien.Candidat;
import com.company.model.entretien.ConsultantRecruteur;
import com.company.model.entretien.Creneau;
import com.company.model.entretien.Entretien;
import com.company.use_case.entretien.entretien_outils.EntretienOutils;

public class PlanifierEntretien {

    public static Entretien planifierEntretien(Creneau creneau,Candidat candidat) throws NoCandidateFoundException {
        ConsultantRecruteur consultant = EntretienOutils.chercherConsultantRecruteurDisponible(creneau, candidat);
        Entretien entretien = new Entretien(consultant,candidat,creneau);
        if (consultant == null) throw new NoCandidateFoundException();
        entretien.setEstPlanifie(true);
        return entretien;
    }

    public static class NoCandidateFoundException extends Exception{
    }
}
