package com.company.use_case.entretien;

import com.company.model.entretien.Entretien;

public class AnnulerEntretien {

    public static void annulerEntretien(Entretien entretien) {
        entretien.setEstPlanifie(false);
    }
}
