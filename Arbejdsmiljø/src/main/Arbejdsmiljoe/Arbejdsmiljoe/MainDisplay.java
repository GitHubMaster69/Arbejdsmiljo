package Arbejdsmiljoe;

import processing.core.PApplet;
import processing.core.PImage;

public class MainDisplay extends PApplet {
    protected final PApplet p = this;
    public static Display loginScreen = new Display();
    public static Display takeQuiz = new Display();
    public static Display quizList = new Display();
    public static Display seeQuiz = new Display();


    public int page = 2;



    public void displaySelector(PApplet p, PImage quizImage) {
     switch (page) {
         case 0:
             loginScreen.loginScreen(p, quizImage);
             break;
         case 1:
             quizList.quizList(p);
             break;
         case 2:
             takeQuiz.takeQuiz(p);
             break;
         case 3:
             seeQuiz.seeQuiz(p);
             break;
         }
    }



}







