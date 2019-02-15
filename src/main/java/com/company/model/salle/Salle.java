package com.company.model.salle;

public class Salle {

    private int id;
    private String nom;
    boolean disponibilite;

    public Salle(int id, String nom, boolean disponibilite) {
        this.id = id;
        this.nom = nom;
        this.disponibilite = disponibilite;
    }

    public boolean estDisponible() {
        return disponibilite;
    }

    public void reserver() {
        disponibilite = false;
    }

    public void liberer() {
        disponibilite = true;
    }

    public String getNom() {return nom; }
}

