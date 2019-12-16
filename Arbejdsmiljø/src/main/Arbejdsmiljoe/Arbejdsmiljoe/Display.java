package Arbejdsmiljoe;

import processing.core.PApplet;

import javax.swing.*;

import static Arbejdsmiljoe.Button.H;
import static Arbejdsmiljoe.Button.W;

public class Display extends MainDisplay {

    Button Question1;

    public void loginScreen(PApplet p) {
        Question1 = new Button("Question 1", width - W, height - H);
        Question1.display(p);
        println("boomer");
    }

    public void quizList() {

    }

    public void takeQuiz() {

    }

    public void seeQuiz() {

    }

    public void mouseMoved() {
        Question1.isInside();
    }

    public void mousePressed() {
        if (Question1.isHovering) --page;
    }
}
