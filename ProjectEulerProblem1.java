package com.example.oct31oopspookyassignment;

import javafx.scene.image.Image;

public class ProjectEulerProblem1 extends ProjectRepository{

    public ProjectEulerProblem1() {
        super("If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6, and 9. " +
                "The sum of these multiples is 23. Find the sum of all multiples of 3 or 5 below 1000."
                , new Image("file:///Users/emiliomaset/IdeaProjects/oct31oopSpookyAssignment/projectEuler1Screenshot.png"));
    }

    public int solver() {
        int sum = 0;

        for (int i = 1; i < 1000; i++) {
            if ( (i % 3 == 0) || ( i % 5 == 0) )
                sum += i;
        }

        return sum;
    }
}
