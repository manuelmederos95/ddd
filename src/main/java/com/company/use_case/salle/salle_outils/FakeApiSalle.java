package com.company.use_case.salle.salle_outils;

import com.company.model.salle.Salle;

import java.util.ArrayList;
import java.util.List;

public class FakeApiSalle implements FakeApiSalleInterface{


    public List<Salle> getListSalles() {

        Salle salle1 = new Salle(1, "Salle1", false);
        Salle salle2 = new Salle(2, "Salle2", true);
        Salle salle3 = new Salle(3, "Salle3", true);
        List<Salle> salleList = new ArrayList<Salle>();
        salleList.add(salle1);
        salleList.add(salle2);
        salleList.add(salle3);

        return salleList;
    }
}
