package Arbejdsmiljoe;
import processing.core.PApplet;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main extends PApplet {
    protected final PApplet p = this;
    public int backgroundColor = 100;
    public static void main(String[] args){ Main.main("Arbejdsmiljoe.Main"); }
    public void settings(){
        size(800,800);
        SQLiteTest db = new SQLiteTest();
        /*try {
            //db.getQuestion("sikkerhed", "1");
            //db.initializeRemoteDatabase(1);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }*/
    }
    //@Override
    public void draw(){
        p.background(backgroundColor);
    }
public void mouseClicked(){
    SQLiteTest db = new SQLiteTest();
    db.initializeRemoteDatabase(1);
    /*
    try {
        ResultSet questionSQL = db.getQuestion("sikkerhed", "1");
        System.out.println(questionSQL.getString(1));
        db.storeQuestion(2, "sikkerhed", "why are you gay lmao?", "i am not gay", "you are gay", "what the fuck", "no you are fuck");
    } catch (SQLException | ClassNotFoundException e) {
        e.printStackTrace();
    }
    */
}
}
