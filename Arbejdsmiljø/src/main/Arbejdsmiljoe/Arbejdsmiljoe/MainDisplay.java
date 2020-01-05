package Arbejdsmiljoe;

import processing.core.PApplet;

public class MainDisplay extends PApplet {
    protected final PApplet p = this;
    public static Display loginScreen = new Display();
    public static Display takeQuiz = new Display();
    public static Display quizList = new Display();
    public static Display seeQuiz = new Display();


    public static int page = 0;

    int getPage() {
        return page;
    }



    public void displaySelector(PApplet p) {
     switch (page) {
         case 0:
             loginScreen.loginScreen(p);
             System.out.printf("case 0");
             break;
         case 1:
             quizList.quizList(p);
             System.out.printf("case 1");
             break;
         case 2:
             takeQuiz.takeQuiz(p);
             System.out.printf("case 2");
             break;
         case 3:
             seeQuiz.seeQuiz(p);
             System.out.printf("case 3");
             break;
         }
    }



}







