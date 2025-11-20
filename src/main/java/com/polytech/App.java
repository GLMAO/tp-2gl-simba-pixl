package com.polytech;

import com.polytech.tp.Cours;
import com.polytech.tp.CoursBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        Cours cours = new CoursBuilder()
                .setMatiere("génie Logiciel")
                .setEnseignant("Dr.MAZARI ABDSSAMED")
                .setSalle("L1")
                .setDate("20/11/2025")
                .setHeureDebut("13:00")
                .setEstOptionnel(false)
                .setNiveau("CS")
                .setNecessiteProjecteur(true)
                .build();

        System.out.println(cours.getDescription());
    }

    

    
}
