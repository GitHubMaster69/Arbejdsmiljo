package Arbejdsmiljoe;
import processing.core.PApplet;
public class Main extends PApplet {
    protected final PApplet p = this;
    public static void main(String[] args){
        Main.main("Arbejdsmiljoe.Main");


    }
    public static MainDisplay Displays = new MainDisplay();
   // public static MyGUIForm loginscreen = new MyGUIForm(); ikke slet, er igang <3

    public void settings(){
        size(displayWidth/4,displayHeight/4);
    }

    public void draw()  {
    p.background(100);
    Displays.Display();




    }
    public void mouseClicked()  {

    }

}
