package com.company.model.entretien;

public class Entretien {

    private ConsultantRecruteur consultantRecruteur;
    private Candidat candidat;
    private Creneau creneau;
    private boolean estPlanifie;


    public Entretien(ConsultantRecruteur consultantRecruteur, Candidat candidat, Creneau creneau) {
        this.consultantRecruteur = consultantRecruteur;
        this.candidat = candidat;
        this.creneau = creneau;
        this.estPlanifie = false;
    }

    public boolean isEstPlanifie() {
        return estPlanifie;
    }

    public void setEstPlanifie(boolean estPlanifie) {
        this.estPlanifie = estPlanifie;
    }

    public boolean getEstPlanifie(){
        return estPlanifie;
    }

    public ConsultantRecruteur getConsultantRecruteur() {
        return consultantRecruteur;
    }

    public Candidat getCandidat() {
        return candidat;
    }

    public Creneau getCreneau() {
        return creneau;
    }

    public void setCreneau(Creneau creneau) {
        this.creneau = creneau;
    }
}
