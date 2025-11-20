package com.polytech.tp;

public class CoursBuilder {

    private String matiere;
    private String enseignant;
    private String salle;
    private String date;
    private String heureDebut;
    private boolean estOptionnel;
    private String niveau;
    private boolean necessiteProjecteur;

    public CoursBuilder setMatiere(String matiere) {
        this.matiere = matiere;
        return this;
    }

    public CoursBuilder setEnseignant(String enseignant) {
        this.enseignant = enseignant;
        return this;
    }

    public CoursBuilder setSalle(String salle) {
        this.salle = salle;
        return this;
    }

    public CoursBuilder setDate(String date) {
        this.date = date;
        return this;
    }

    public CoursBuilder setHeureDebut(String heure) {
        this.heureDebut = heure;
        return this;
    }

    public CoursBuilder setOptionnel(boolean value) {
        this.estOptionnel = value;
        return this;
    }

    public CoursBuilder setNiveau(String niveau) {
        this.niveau = niveau;
        return this;
    }

    public CoursBuilder setProjecteur(boolean value) {
        this.necessiteProjecteur = value;
        return this;
    }

    public Cours build() {
        return new Cours(
                matiere, enseignant, salle, date,
                heureDebut, estOptionnel, niveau, necessiteProjecteur
        );
    }
}
