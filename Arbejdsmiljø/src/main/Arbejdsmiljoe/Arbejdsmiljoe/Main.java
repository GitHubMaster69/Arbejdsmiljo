package Arbejdsmiljoe;
import processing.core.PApplet;
import processing.core.PImage;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main extends PApplet {
    protected final PApplet p = this;
    public PImage quizImage;
    public static void main(String[] args){
        Main.main("Arbejdsmiljoe.Main");


    }
     public static MainDisplay displaySelector = new MainDisplay();
   // public static MyGUIForm loginscreen = new MyGUIForm(); ikke slet, er igang <3
 public void setup(){
     //quizImage = loadImage("quiz.png");
     //quizImage = loadImage("C:\\Users\\Simoon\\Documents\\GitHub\\Arbejdsmiljo\\Arbejdsmiljø\\src\\main\\Arbejdsmiljoe\\Arbejdsmiljoe\\data\\quiz.png");

 }
    public void settings(){

        size(displayWidth/4,displayHeight/4);

        //size(1600,900);
        fullScreen();
        SQLiteTest db = new SQLiteTest();
        /*try {
            db.getQuestion("sikkerhed", "1");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }*/
    }
public void mouseClicked(){
    SQLiteTest db = new SQLiteTest();
    db.initializeRemoteDatabase(2);
   /* try {
        ResultSet questionSQL = db.getQuestion("sikkerhed", "1");
        System.out.println(questionSQL.getString(1));
        //db.storeQuestion(2, "sikkerhed", "why are you gay?", "i am not gay", "you are gay", "what the fuck", "no you are fuck");
    } catch (SQLException | ClassNotFoundException e) {
        e.printStackTrace();
    }*/
}

    //@Override
    public void draw()  {
    p.background(100);
    displaySelector.displaySelector(p, quizImage);
    //mousePressed();
    //mouseMoved();
    }


}
