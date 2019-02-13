package com.company;

import com.company.use_case.planification_entretien.Plannification_entretien_technique;

public class Controller_planification_entretien implements Plannification_entretien_technique {


    public Controller_planification_entretien() {

    }


    public boolean verification_salle_ordinateur(boolean salle_dispo) {
        return salle_dispo;
    }

    public boolean selection_consultant_recruteur(boolean consultant_dispo) throws NoConsultantFoundException {
        if (true) return consultant_dispo;
        else throw new Controller_planification_entretien.NoConsultantFoundException();
    }

    public boolean dispo_consultant_recruteur(boolean consultant_dispo) {
        return consultant_dispo;
    }

    public boolean dispo_candidat(boolean candidat_dispo) {
        return candidat_dispo;
    }

    public static class NoConsultantFoundException extends Exception {

    }

}
