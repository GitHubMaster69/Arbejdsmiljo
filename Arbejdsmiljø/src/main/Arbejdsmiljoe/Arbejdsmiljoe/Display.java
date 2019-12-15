package Arbejdsmiljoe;

import processing.core.PApplet;
import processing.core.PImage;

public class Display extends MainDisplay {
    //protected final PApplet p = this;
    PImage quiz = null;

    public void eatAss(PImage quizImage, PApplet p) {
        quiz = quizImage;
        //quiz.resize(width, height);
        System.out.println("image gotten");
        p.background(quiz);
    }

    public void loginScreen(PApplet logScreen) {
        //logScreen.background(quiz);
        println("boomer");
}

public void quizList(PApplet p) {

}
public void takeQuiz(PApplet p) {

}
public void seeQuiz(PApplet p) {

}

}
