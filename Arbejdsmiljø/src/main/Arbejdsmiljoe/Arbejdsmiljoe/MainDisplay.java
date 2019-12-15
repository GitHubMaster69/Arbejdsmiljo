package Arbejdsmiljoe;

import processing.core.PApplet;

public class MainDisplay extends PApplet {
    protected final PApplet p = this;
    public static Display loginScreen = new Display();
    public static Display takeQuiz = new Display();
    public static Display quizList = new Display();
    public static Display seeQuiz = new Display();


    public int page = 0;



    public void displaySelector() {
     switch (page) {
         case 0:
             loginScreen.loginScreen();
             break;
         case 1:
             quizList.quizList();
             break;
         case 2:
             takeQuiz.takeQuiz();
             break;
         case 3:
             seeQuiz.seeQuiz();
             break;
         }
    }



}







