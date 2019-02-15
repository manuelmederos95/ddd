package com.company.use_case.entretien.entretien_outils;

import com.company.model.entretien.Candidat;
import com.company.model.entretien.ConsultantRecruteur;
import com.company.model.entretien.Creneau;

import java.util.ArrayList;
import java.util.List;

public class EntretienOutils {


        public static ConsultantRecruteur chercherConsultantRecruteurDisponible (Creneau creneau , Candidat candidat) {

            FakeApiEntretienInterface api = new FakeApiEntretien();

            // On fait un filtre sur la liste des consultants poru trouver ceux pouvant tester le candidat
            List <ConsultantRecruteur> consultantsPouvantTester = new ArrayList<ConsultantRecruteur>();
            for (ConsultantRecruteur consultantRecruteur: api.getListConsultant()) {
                if (consultantRecruteur.peutTester(candidat)) consultantsPouvantTester.add(consultantRecruteur);
            }

            for (ConsultantRecruteur consultant: consultantsPouvantTester) { //On prend pas en compte le creneau pour ce moc
                if (consultant.estDisponible()) return consultant;
            }

            return null;
        }
}

