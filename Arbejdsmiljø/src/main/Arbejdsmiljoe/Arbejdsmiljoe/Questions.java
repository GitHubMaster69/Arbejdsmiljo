package Arbejdsmiljoe;
import processing.core.PApplet;

public class Questions extends PApplet {
    protected final PApplet p = this;

    int number;
    String questionText;
    String correct1;
    String wrong1;
    String wrong2;
    String wrong3;
    Questions(int num, String text, String c1, String w1, String w2, String w3){
         number = num;
         questionText = text;
         correct1 = c1;
         wrong1 = w1;
         wrong2 = w2;
         wrong3 = w3;
}
}
