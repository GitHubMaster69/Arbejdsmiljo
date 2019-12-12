package Arbejdsmiljoe;
import processing.core.PApplet;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main extends PApplet {
    protected final PApplet p = this;
    public static void main(String[] args){ Main.main("Arbejdsmiljoe.Main"); }
    public void settings(){
        size(800,800);

    }
    @Override
public void draw(){
    p.background(100);
}
public void mouseClicked(){
    SQLiteTest db = new SQLiteTest();
    try {
        db.initialize();
        ResultSet questionSQL = db.getQuestion("sikkerhed", "1");
        System.out.println(questionSQL.getString(1));
    } catch (SQLException | ClassNotFoundException e) {
        e.printStackTrace();
    }
}
}
