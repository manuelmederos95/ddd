package com.company.use_case.salle;

import com.company.model.entretien.Entretien;
import com.company.model.salle.Salle;
import com.company.use_case.salle.salle_outils.SalleOutils;


public class ReserverSalle {

    public static Salle reserverSalle(Entretien entretien) throws NoSalleDispoExeption {
        Salle salle = SalleOutils.chercherSalleDisponible();

        if (salle == null) throw new NoSalleDispoExeption();

        return salle;
    }

    public static class NoSalleDispoExeption extends Exception {

    }
}
