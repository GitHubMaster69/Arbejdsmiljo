package Arbejdsmiljoe;
import processing.core.PApplet;
public class Main extends PApplet {
    protected final PApplet p = this;
    public static void main(String[] args){ Main.main("Arbejdsmiljoe.Main"); }
public static MainDisplay Displays = new MainDisplay();

    public void settings(){
        fullScreen();
    }

    public void draw()  {
    p.background(100);
    Displays.Display();


    }
    public void mouseClicked()  {

    }

}
