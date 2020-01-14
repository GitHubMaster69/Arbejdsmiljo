package Arbejdsmiljoe;
import processing.core.PApplet;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main extends PApplet {
    //private static PApplet p;
    protected final PApplet p = this;

    public static void main(String[] args) {
        Main.main("Arbejdsmiljoe.Main");


    }

    public static MainDisplay displaySelector = new MainDisplay();
    // public static MyGUIForm loginscreen = new MyGUIForm(); ikke slet, er igang <3

    public void settings() {

        size(displayWidth / 4, displayHeight / 4);

        //size(800,800);
        fullScreen();
        SQLiteTest db = new SQLiteTest();
        /*try {
            //db.getQuestion("sikkerhed", "1");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }*/

    }

    public void mouseClicked() {
        SQLiteTest db = new SQLiteTest();
        displaySelector.displaySelector(p);
        try {
            String[] questionSQL = db.getQuestion("sikkerhed", "2");
            System.out.println(questionSQL[1]);
            db.storeQuestion(4, "sikkerhed", "n1", "n2", "n3", "n4", "n5");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
public void setup(){
            update();
}


            public void update() {
        if(MainDisplay.updateState)
                MainDisplay.displaySelector(p);
        MainDisplay.updateState = false;
            }

            //@Override
            public void draw () {
                //p.rect(100,100,100,100);
                //mousePressed();
                //mouseMoved();
            }
        }

