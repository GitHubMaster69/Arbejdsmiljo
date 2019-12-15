package Arbejdsmiljoe;

import processing.core.PApplet;
import processing.core.PImage;

public class Display extends MainDisplay {
    protected final PApplet p = this;
    PImage quiz;

    public void eatAss() {
        quiz = loadImage("quiz.png");

    }

    public void loginScreen() {
        quiz.resize(width, height);
        p.background(quiz);
        println("boomer");
}

public void quizList() {

}
public void takeQuiz() {

}
public void seeQuiz() {

}

}
