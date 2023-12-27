// Emilio Maset

package com.example.oct31oopspookyassignment;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class oct31oopSpookyAssignment extends Application {
    private Label problemStatement;
    private ImageView sourceCodeImage;
    private Label solveStatement;
    private VBox everythingVBox;
    private HBox threeChoicesHBox;
    private VBox displayCodeFeaturesVBox;

    ProjectEulerProblem1 e1 = new ProjectEulerProblem1();
    ProjectEulerProblem2 e2 = new ProjectEulerProblem2();

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage){
        problemStatement = new Label();
        problemStatement.setFont(Font.font(15));
        problemStatement.setWrapText(true);

        sourceCodeImage = new ImageView();
        sourceCodeImage.setFitWidth(870);
        sourceCodeImage.setFitHeight(400);

        solveStatement = new Label();
        solveStatement.setFont(Font.font(15));

        Button e1Button = new Button("Euler Problem 1");
        e1Button.setFont(Font.font(20));
        e1Button.setOnAction(new e1ButtonClickHandler());

        Button e2Button = new Button("Euler Problem 2");
        e2Button.setFont(Font.font(20));
        e2Button.setOnAction(new e2ButtonClickHandler());

        Label greetingLabel = new Label("Welcome to Emilio's Project Repository! Please select a problem to view.");
        greetingLabel.setFont(Font.font(20));
        greetingLabel.setBorder((new Border(new BorderStroke(Color.BLUEVIOLET, BorderStrokeStyle.SOLID, null, null))));

        HBox greetingHbox = new HBox(greetingLabel);
        greetingHbox.setPadding(new Insets(20));
        greetingHbox.setAlignment(Pos.TOP_CENTER);

        HBox hBoxProblemSelections = new HBox(50, e1Button, e2Button);
        hBoxProblemSelections.setAlignment(Pos.TOP_CENTER);

        threeChoicesHBox = new HBox(10);
        threeChoicesHBox.setAlignment(Pos.TOP_CENTER);

        displayCodeFeaturesVBox = new VBox(15);
        displayCodeFeaturesVBox.setAlignment(Pos.TOP_CENTER);

        everythingVBox = new VBox(20, greetingHbox, hBoxProblemSelections, threeChoicesHBox, displayCodeFeaturesVBox);
        everythingVBox.setAlignment(Pos.TOP_CENTER);

        Scene menuScene = new Scene(everythingVBox, 1100, 700);
        primaryStage.setScene(menuScene);
        primaryStage.setTitle("Emilio's Project Repository");
        primaryStage.show();
    }

    // ========================================================================================================================================================

    class e1ButtonClickHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent actionEvent) {
            Button problemStatementButton = new Button("Problem Statement");
            Button sourceCode = new Button("Source Code");
            Button solveButton = new Button("Solve");
            problemStatementButton.setFont(Font.font(16));
            sourceCode.setFont(Font.font(16));
            solveButton.setFont(Font.font(16));
            problemStatementButton.setOnAction(new e1ProblemStatementButtonClickHandler());
            sourceCode.setOnAction(new e1SourceCodeButtonClickHandler());
            solveButton.setOnAction(new e1SolveClickHandler());
            threeChoicesHBox.getChildren().clear();
            threeChoicesHBox.getChildren().add(problemStatementButton);
            threeChoicesHBox.getChildren().add(sourceCode);
            threeChoicesHBox.getChildren().add(solveButton);
            displayCodeFeaturesVBox.getChildren().clear();
        }
    }

    class e2ButtonClickHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent actionEvent) {
            Button problemStatementButton = new Button("Problem Statement");
            Button sourceCode = new Button("Source Code");
            Button solveButton = new Button("Solve");
            problemStatementButton.setFont(Font.font(16));
            sourceCode.setFont(Font.font(16));
            solveButton.setFont(Font.font(16));
            problemStatementButton.setOnAction(new e2ProblemStatementButtonClickHandler());
            sourceCode.setOnAction(new e2SourceCodeButtonClickHandler());
            solveButton.setOnAction(new e2SolveClickHandler());
            threeChoicesHBox.getChildren().clear();
            threeChoicesHBox.getChildren().add(problemStatementButton);
            threeChoicesHBox.getChildren().add(sourceCode);
            threeChoicesHBox.getChildren().add(solveButton);
            displayCodeFeaturesVBox.getChildren().clear();
        }
    }

    // ========================================================================================================================================================

    class e1ProblemStatementButtonClickHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent actionEvent) {
            problemStatement.setText(e1.getProblemStatement());
            displayCodeFeaturesVBox.getChildren().add(problemStatement);
        }
    }

    class e2ProblemStatementButtonClickHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent actionEvent) {
            problemStatement.setText(e2.getProblemStatement());
            displayCodeFeaturesVBox.getChildren().add(problemStatement);
        }
    }

    // ========================================================================================================================================================

    class e1SourceCodeButtonClickHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent actionEvent) {
            sourceCodeImage.setImage(e1.getSourceCode());
            displayCodeFeaturesVBox.getChildren().add(sourceCodeImage);
        }
    }

    class e2SourceCodeButtonClickHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent actionEvent) {
            sourceCodeImage.setImage(e2.getSourceCode());
            displayCodeFeaturesVBox.getChildren().add(sourceCodeImage);
        }
    }

    // ========================================================================================================================================================

    class e1SolveClickHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent actionEvent) {
            problemStatement.setText(e1.getProblemStatement());
            sourceCodeImage.setImage( e1.getSourceCode());
            solveStatement.setText("The result is: " + e1.solver());
            displayCodeFeaturesVBox.getChildren().clear();
            displayCodeFeaturesVBox.getChildren().add(problemStatement);
            displayCodeFeaturesVBox.getChildren().add(sourceCodeImage);
            displayCodeFeaturesVBox.getChildren().add(solveStatement);
        }
    }

    class e2SolveClickHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent actionEvent) {
            problemStatement.setText(e2.getProblemStatement());
            sourceCodeImage.setImage(e2.getSourceCode());
            solveStatement.setText("The result is: " + e2.solver());
            displayCodeFeaturesVBox.getChildren().clear();
            displayCodeFeaturesVBox.getChildren().add(problemStatement);
            displayCodeFeaturesVBox.getChildren().add(sourceCodeImage);
            displayCodeFeaturesVBox.getChildren().add(solveStatement);
        }
    }
}