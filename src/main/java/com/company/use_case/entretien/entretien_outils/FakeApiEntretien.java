package com.company.use_case.entretien.entretien_outils;

import com.company.model.entretien.ConsultantRecruteur;

import java.util.ArrayList;
import java.util.List;

public class FakeApiEntretien implements FakeApiEntretienInterface{

    public List<ConsultantRecruteur> getListConsultant() {

        ConsultantRecruteur consultantRecruteur1 = new ConsultantRecruteur(1, "Kevin", "craftmanship", false);
        ConsultantRecruteur consultantRecruteur2 = new ConsultantRecruteur(2, "Alex", "fullstack", true);
        ConsultantRecruteur consultantRecruteur3 = new ConsultantRecruteur(1, "Martin", "craftmanship", true);
        ConsultantRecruteur consultantRecruteur4 = new ConsultantRecruteur(1, "Julien", "cloud", false);
        List<ConsultantRecruteur> consultantRecruteurs = new ArrayList<ConsultantRecruteur>();
        consultantRecruteurs.add(consultantRecruteur1);
        consultantRecruteurs.add(consultantRecruteur2);
        consultantRecruteurs.add(consultantRecruteur3);
        consultantRecruteurs.add(consultantRecruteur4);

        return consultantRecruteurs;
    }
}
