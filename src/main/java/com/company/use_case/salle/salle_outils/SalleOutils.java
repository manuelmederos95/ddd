package com.company.use_case.salle.salle_outils;
import com.company.model.salle.Salle;

public class SalleOutils {

    public static Salle chercherSalleDisponible() {

        FakeApiSalleInterface api = new FakeApiSalle();

        for (Salle salle: api.getListSalles()) {
            if (salle.estDisponible()) return salle;
        }

        return null;
    }

}
