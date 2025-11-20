package com.polytech.tp;

public class CoursEnLigne extends CoursDecorator {

    public CoursEnLigne(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        // Le test attend exactement "En ligne"
        return coursDecorated.getDescription() + " - En ligne";
    }

    @Override
    public double getDuree() {
        return coursDecorated.getDuree();
    }
}
