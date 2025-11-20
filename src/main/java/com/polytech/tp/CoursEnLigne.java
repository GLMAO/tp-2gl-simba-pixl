package com.polytech.tp;

public class CoursEnLigne extends CoursDecorator {
    CoursEnLigne(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        return coursDecorated.getDescription() + " (En ligne)";
    }

    @Override
    public double getDuree() {
       return coursDecorated.getDuree();
    };
}
