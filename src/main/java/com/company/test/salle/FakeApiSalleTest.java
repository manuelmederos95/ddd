package com.company.test.salle;

import com.company.model.salle.Salle;
import com.company.use_case.salle.salle_outils.FakeApiSalleInterface;

import java.util.ArrayList;
import java.util.List;

public class FakeApiSalleTest implements FakeApiSalleInterface {

    public List<Salle> getListSalles() {
        Salle salle1 = new Salle(1, "Salle1", false);
        Salle salle2 = new Salle(2, "Salle2", false);
        List<Salle> salleList = new ArrayList<Salle>();
        salleList.add(salle1);
        salleList.add(salle2);


        return salleList;
    }
}
