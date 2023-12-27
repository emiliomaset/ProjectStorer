package com.example.oct31oopspookyassignment;

import javafx.scene.image.Image;

public abstract class ProjectRepository {
    private String problemStatement;
    private Image sourceCode;


    public ProjectRepository(String problemStatement, Image sourceCode) {
        this.problemStatement = problemStatement;
        this.sourceCode = sourceCode;
    }

    public abstract int solver();

    public String getProblemStatement() {
        return problemStatement;
    }

    public Image getSourceCode() {
        return sourceCode;
    }
}
