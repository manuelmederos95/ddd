package com.company.use_case.planification_entretien;

import com.company.Controller_planification_entretien;

public interface Plannification_entretien_technique {

    boolean verification_salle_ordinateur(boolean salle_dispo);

    boolean selection_consultant_recruteur(boolean consultant_dispo) throws Controller_planification_entretien.NoConsultantFoundException;

    boolean dispo_consultant_recruteur(boolean consultant_dispo);

    boolean dispo_candidat(boolean candidat_dispo);
}
