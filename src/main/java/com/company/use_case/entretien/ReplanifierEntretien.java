package com.company.use_case.entretien;

import com.company.model.entretien.ConsultantRecruteur;
import com.company.model.entretien.Creneau;
import com.company.model.entretien.Entretien;

import java.util.List;

public class ReplanifierEntretien {

    public static Entretien replanifierEntretien(Creneau nouveauCreneau, Entretien ancienneEntretien, List<ConsultantRecruteur> consultantRecruteurListe) throws PlanifierEntretien.NoCandidateFoundException {

        if (ancienneEntretien.getConsultantRecruteur().estDisponible()) {
            ancienneEntretien.setCreneau(nouveauCreneau);
            return ancienneEntretien;
        }
        else {
            return PlanifierEntretien.planifierEntretien(nouveauCreneau, ancienneEntretien.getCandidat());
        }
    }
}
