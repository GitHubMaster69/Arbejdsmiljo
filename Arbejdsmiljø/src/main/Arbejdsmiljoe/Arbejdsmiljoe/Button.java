package Arbejdsmiljoe;

import processing.core.PApplet;


public class Button extends PApplet {
    final int W = width*8, H = height;
    private PApplet pa;
    final String label;
    final short x, y, xW, yH;
    boolean isHovering;

    Button(String txt, int xx, int yy) {
        label = txt;

        x = (short) xx;
        y = (short) yy;

        xW = (short) (xx + W);
        yH = (short) (yy + H);
    }

    void display(PApplet p) {
        pa = p;
        //pa.background(255);
        pa.rect(x, y, W, H);
        pa.fill(0);
        pa.text(label, x + W / 2, y + H / 2);
        pa.fill(255);
    }

    boolean isInside() {
        return isHovering = mouseX > x & mouseX < xW & mouseY > y & mouseY < yH;
    }
}