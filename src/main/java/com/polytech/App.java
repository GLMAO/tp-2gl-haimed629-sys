package com.polytech;

import com.polytech.tp.*;

public class App {
    public static void main(String[] args) {

        GestionnaireEmploiDuTemps gestion = new GestionnaireEmploiDuTemps();

        // Observateurs
        Etudiant e1 = new Etudiant("Mohamed");
        Responsable r1 = new Responsable("Dr. Karim");

        gestion.attach(e1);
        gestion.attach(r1);

        // Cours construit avec Builder
        ICours cours1 = new CoursBuilder()
                .setMatiere("Maths")
                .setEnseignant("Mme Sara")
                .setSalle("A12")
                .setDate("20/11/2025")
                .setHeureDebut("08:00")
                .setNiveau("L3")
                .setProjecteur(true)
                .build();

        // Décorateur : cours en ligne
        cours1 = new CoursEnLigne(cours1);

        gestion.ajouterCours(cours1);

        gestion.modifierCours(cours1, "La salle a changé !");
    }
}
