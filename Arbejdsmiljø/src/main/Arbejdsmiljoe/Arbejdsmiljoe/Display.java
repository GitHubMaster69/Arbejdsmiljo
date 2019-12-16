package Arbejdsmiljoe;

import processing.core.PApplet;
import processing.core.PImage;

public class Display extends MainDisplay {


    Button Question1;
    Button Question2;
    Button Question3;
    Button Question4;

    public void loginScreen(PApplet p, PImage quizImage) {
        Question1 = new Button("Question 1", width - W, height - H);
        Question1.display(p);
        //p.background(quizImage);
        //println("boomer");
    }
    public void loginScreen(PApplet p) {

    }

    public void quizList(PApplet p) {
    }

    public void takeQuiz(PApplet p) {
        Question1 = new Button("Question 1", width, height*9);
        Question1.display(p);

        Question2 = new Button("Question 2", width, height*7);
        Question2.display(p);

        Question3 = new Button("Question 3", width*11, height*7);
        Question3.display(p);

        Question4 = new Button("Question 4", width*11, height*9);
        Question4.display(p);

    }

    public void seeQuiz(PApplet p) {

    }

    public void mouseMoved() {
        Question1.isInside();
    }

    public void mousePressed() {
        if (Question1.isHovering) --page;
    }
}
