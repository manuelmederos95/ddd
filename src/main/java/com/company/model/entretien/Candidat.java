package com.company.model.entretien;

public class Candidat {
    private int id;
    private String nom;
    private String specialite;

    public Candidat(int id, String nom, String specialite) {
        this.id = id;
        this.nom = nom;
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }
}
