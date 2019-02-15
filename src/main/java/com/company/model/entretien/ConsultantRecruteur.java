package com.company.model.entretien;

public class ConsultantRecruteur {

    private int id;
    private String nom;
    private String specialite;
    private boolean estDispo;

    public ConsultantRecruteur(int id, String nom, String specialite, boolean estDispo){
        this.id = id;
        this.nom = nom;
        this.specialite = specialite;
        this.estDispo = estDispo;
    }

    public boolean peutTester (Candidat candidat) {
        if (this.specialite.equals(candidat.getSpecialite())) return true;
        else return false;
    }

    public boolean estDisponible () { //Pour les cas de test on moc la disponibilité du consultant
        return estDispo;
    }

    public String getNom(){
        return nom;
    }

}
